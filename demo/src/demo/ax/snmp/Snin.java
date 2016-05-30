package demo.ax.snmp;

import java.io.IOException;
import java.util.Vector;
 
import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.PDUv1;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
 
public class Snin {
 
       private Snmp snmp = null;
 
       private Address targetAddress = null;
 
       public void initComm() throws IOException {
             
              // ����Agent����IP�Ͷ˿�
              targetAddress = GenericAddress.parse("udp:192.168.114.41/161");
              TransportMapping transport = new DefaultUdpTransportMapping();
              snmp = new Snmp(transport);
              transport.listen();
       }
 
       public void sendPDU() throws IOException {
              // ���� target
              CommunityTarget target = new CommunityTarget();
              target.setCommunity(new OctetString("public"));
              target.setAddress(targetAddress);
              // ͨ�Ų��ɹ�ʱ�����Դ���
              target.setRetries(2);
              // ��ʱʱ��
              target.setTimeout(1500);
              target.setVersion(SnmpConstants.version2c);
              // ���� PDU
              PDU pdu = new PDU();
              pdu.add(new VariableBinding(new OID(new int[] {1,3,6,1,4,1,25506,2,6,1,1,1,1,6,19})));
              // MIB�ķ��ʷ�ʽ
              pdu.setType(PDU.GET);
              // ��Agent����PDU��������Response
              ResponseEvent respEvnt = snmp.send(pdu, target);
              // ����Response
              if (respEvnt != null && respEvnt.getResponse() != null) {
                     Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()
                                   .getVariableBindings();
                     for (int i = 0; i < recVBs.size(); i++) {
                            VariableBinding recVB = recVBs.elementAt(i);
                            System.out.println(recVB.getOid() + " : " + recVB.getVariable());
                     }
              }
       }
       
       
       
       
 
       public static void main(String[] args) {
              try {
            	  Snin util = new Snin();
                     util.initComm();
                     util.sendPDU();
              } catch (IOException e) {
                     e.printStackTrace();
              }
       }
}