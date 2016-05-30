package demo.ax.snmp;

import java.util.ArrayList;
import java.util.List;
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

public class Debb {
	
//	-------���ô���ͨ��SNMPЭ������----
	private Snmp snmp = null;
		private Address targetAddress = null;
//		------�����������ӷ�������Ҫ���ʵĴ���
		public  void initComm(String ip) {
			try {
				// ����Agent����IP�Ͷ˿�
				targetAddress = GenericAddress.parse("udp:" + ip + "/161");
				TransportMapping transport = new DefaultUdpTransportMapping();
				snmp = new Snmp(transport);
				transport.listen();
			} catch (Exception e) {
				System.out.println("��֧��SNMPЭ���ʱ");
			}
		}

//	----����OID��ȡMIB��Ӧ��ֵ
	public String[] sendPDU(String reqOid) {
			// ���� target
			CommunityTarget target = new CommunityTarget();
			target.setCommunity(new OctetString("public"));
			target.setAddress(targetAddress);
			// ͨ�Ų��ɹ�ʱ�����Դ���
			target.setRetries(2);
			// ��ʱʱ��
			target.setTimeout(1500);
			//SNMP�汾
			target.setVersion(SnmpConstants.version1);
			// ���� PDU
			PDU pdu = new PDU();
			pdu.add(new VariableBinding(new OID(reqOid)));
			// MIB�ķ��ʷ�ʽ
			pdu.setType(PDU.GETNEXT);
			// ��Agent����PDU��������Response
			String[] outinfo = new String[] { "", "" };
			try {
				ResponseEvent respEvnt = snmp.send(pdu, target);
				// ����Response
				if (respEvnt != null && respEvnt.getResponse() != null) {
					Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()
							.getVariableBindings();
					if (recVBs.size() > 0) {
						VariableBinding recVB = recVBs.elementAt(0);
						System.out.println(recVB.getOid() + " : "
								+ recVB.getVariable());
						outinfo[0] = recVB.getOid().toString();
						outinfo[1] = recVB.getVariable().toString();
					}
				}
			} catch (Exception e) {
				System.out.println("��֧��SNMPЭ���ʱ");
			}
			return outinfo;
		}


//	-----������
	public static void main(String[] args){
			//���ô�������
		Debb bb=new Debb();
			bb.initComm("192.168.114.21");
			//����OID��ȡ,Ҳ���������������
			//�������ݷֱ��ǣ�OID:ֵ
			String[] result=bb.sendPDU("1.3.6.1.2.1.1.1.0");//sysdescr
			System.out.println(result[1]);

			//��ȡ��ǰ����
			//���̿�ʼOID:1.3.6.1.2.1.25.4.2.1
	}

	
	

}
