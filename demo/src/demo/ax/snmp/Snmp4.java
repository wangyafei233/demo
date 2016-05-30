package demo.ax.snmp;


import java.io.IOException;
import java.util.Vector;
 
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
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
 
public class Snmp4 {
 
       private Snmp snmp = null;
 
       private Address targetAddress = null;
 
       public void initComm() throws IOException {
             
              // 设置Agent方的IP和端口
              targetAddress = GenericAddress.parse("udp:192.168.114.41/161");
              TransportMapping transport = new DefaultUdpTransportMapping();
              snmp = new Snmp(transport);
              transport.listen();
       }
 
       public void sendPDU() throws IOException {
              // 设置 target
              CommunityTarget target = new CommunityTarget();
              target.setCommunity(new OctetString("public"));
              target.setAddress(targetAddress);
              // 通信不成功时的重试次数
              target.setRetries(2);
              // 超时时间
              target.setTimeout(1500);
              target.setVersion(SnmpConstants.version2c);
              // 创建 PDU   .1.3.6.1.2.1.25.2.2.0
              PDU pdu = new PDU();
              pdu.add(new VariableBinding(new OID("1.3.6.1.6.3.16.1.2.1.0")));
              // MIB的访问方式
              pdu.setType(PDU.GET);
              // 向Agent发送PDU，并接收Response
              ResponseEvent respEvnt = snmp.send(pdu, target);
              // 解析Response
              readResponse(respEvnt);
//              if (respEvnt != null && respEvnt.getResponse() != null) {
//                     Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()
//                                   .getVariableBindings();
//                     System.out.println(respEvnt.getRequest());
//                     System.out.println( respEvnt.getResponse());
//                     System.out.println(respEvnt.getUserObject().toString());
//                     
//                     for (int i = 0; i < recVBs.size(); i++) {
//                            VariableBinding recVB = recVBs.elementAt(i);
//                            System.out.println(recVB.getOid() + " : " + recVB.getVariable().toString());
//                     }
//              }
       }
       
       
       @SuppressWarnings("unchecked")  
       public void readResponse(ResponseEvent respEvnt) {  
           // 解析Response  
           System.out.println("------------>解析Response<-------------");  
           if (respEvnt != null && respEvnt.getResponse() != null) {  
               Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()  
                       .getVariableBindings();  
               for (int i = 0; i < recVBs.size(); i++) {  
                   VariableBinding recVB = recVBs.elementAt(i);  
                   System.out.println(recVB.getOid() + " : "  
                           + recVB.getVariable().toString());  
               }  
           }else{System.out.println("sss");}  
       }  
       
       
       
       
       
 
       public static void main(String[] args) {
              try {
                     Snmp4 util = new Snmp4();
                     util.initComm();
                     util.sendPDU();
              } catch (IOException e) {
                     e.printStackTrace();
              }
       }
}