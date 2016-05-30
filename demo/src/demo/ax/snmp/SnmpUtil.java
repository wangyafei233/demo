package demo.ax.snmp;

import java.io.IOException;
import java.util.Vector;

import org.snmp4j.CommandResponder;
import org.snmp4j.CommandResponderEvent;
import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
 
public class SnmpUtil {
 
       private Snmp snmp = null;
 
       private Address targetAddress = null;
       private TransportMapping transport = null;
 
//       public void initComm() throws IOException {
//             
//              // 设置Agent方的IP和端口
//              targetAddress = GenericAddress.parse("udp:127.0.0.1/161");
//              TransportMapping transport = new DefaultUdpTransportMapping();
//              snmp = new Snmp(transport);
//              transport.listen();
//       }
       
   	public void initComm() throws IOException {

		// 设置Agent方的IP和端口
		targetAddress = GenericAddress.parse("udp:192.168.114.41/161");
		// 设置接收trap的IP和端口
		transport = new DefaultUdpTransportMapping(new UdpAddress("192.168.114.21/162"));
		snmp = new Snmp(transport);

		CommandResponder trapRec = new CommandResponder() {
			public synchronized void processPdu(CommandResponderEvent e) {
				// 接收trap
				PDU command = e.getPDU();
				if (command != null) {
					System.out.println(command.toString()+"接受");
				}
			}
		};
		snmp.addCommandResponder(trapRec);

		transport.listen();
	}
       
       
 
       public ResponseEvent sendPDU(PDU pdu) throws IOException {
              // 设置 target
              CommunityTarget target = new CommunityTarget();
              target.setCommunity(new OctetString("public"));
              target.setAddress(targetAddress);
              // 通信不成功时的重试次数
              target.setRetries(2);
              // 超时时间
              target.setTimeout(1500);
              target.setVersion(SnmpConstants.version2c);
              // 向Agent发送PDU，并返回Response
              return snmp.send(pdu, target);
       }
      
       public void setPDU() throws IOException {
              // set PDU
              PDU pdu = new PDU();
//              pdu.add(new VariableBinding(new OID(new int[] { 1, 3, 6, 1, 2, 1, 1, 5, 0 }), new OctetString("SNMPTEST333377775555")));
              pdu.add(new VariableBinding(new OID(new int[] {1,3,6,1,2,1,2021,11,9,0})));
              pdu.setType(PDU.SET);
              sendPDU(pdu);
       }
      
       public void getPDU() throws IOException {
              // get PDU
              PDU pdu = new PDU();
              pdu.add(new VariableBinding(new OID(new int[] {1,3,6,1,4,1,2021,11,9,0 })));
              pdu.setType(PDU.GET);
              readResponse(sendPDU(pdu));
       }
      
       public void readResponse(ResponseEvent respEvnt) {
              // 解析Response
              if (respEvnt != null && respEvnt.getResponse() != null) {
                     Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()
                                   .getVariableBindings();
                     for (int i = 0; i < recVBs.size(); i++) {
                            VariableBinding recVB = recVBs.elementAt(i);
                            System.out.println(recVB.getOid() + " : " + recVB.getVariable());
                     }
              }
       }
       
       public synchronized void listen() {
           System.out.println("Waiting for traps..");
           try {
                  this.wait();//Wait for traps to come in
           } catch (InterruptedException ex) {
                  System.out.println("Interrupted while waiting for traps: " + ex);
                  System.exit(-1);
           }
    }
      
       public static void main(String[] args) {
              try {
                     SnmpUtil util = new SnmpUtil();
                     util.initComm();
                     util.setPDU();
                     util.getPDU();
//                     util.listen();
              } catch (IOException e) {
                     e.printStackTrace();
              }
       }
}