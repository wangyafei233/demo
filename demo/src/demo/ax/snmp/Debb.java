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
	
//	-------设置代理方通过SNMP协议连接----
	private Snmp snmp = null;
		private Address targetAddress = null;
//		------代理方建立连接方法，所要访问的代理
		public  void initComm(String ip) {
			try {
				// 设置Agent方的IP和端口
				targetAddress = GenericAddress.parse("udp:" + ip + "/161");
				TransportMapping transport = new DefaultUdpTransportMapping();
				snmp = new Snmp(transport);
				transport.listen();
			} catch (Exception e) {
				System.out.println("不支持SNMP协议或超时");
			}
		}

//	----根据OID读取MIB相应的值
	public String[] sendPDU(String reqOid) {
			// 设置 target
			CommunityTarget target = new CommunityTarget();
			target.setCommunity(new OctetString("public"));
			target.setAddress(targetAddress);
			// 通信不成功时的重试次数
			target.setRetries(2);
			// 超时时间
			target.setTimeout(1500);
			//SNMP版本
			target.setVersion(SnmpConstants.version1);
			// 创建 PDU
			PDU pdu = new PDU();
			pdu.add(new VariableBinding(new OID(reqOid)));
			// MIB的访问方式
			pdu.setType(PDU.GETNEXT);
			// 向Agent发送PDU，并接收Response
			String[] outinfo = new String[] { "", "" };
			try {
				ResponseEvent respEvnt = snmp.send(pdu, target);
				// 解析Response
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
				System.out.println("不支持SNMP协议或超时");
			}
			return outinfo;
		}


//	-----最后调用
	public static void main(String[] args){
			//调用代理连接
		Debb bb=new Debb();
			bb.initComm("192.168.114.21");
			//根据OID读取,也就是向代理发送请求
			//返回数据分别是：OID:值
			String[] result=bb.sendPDU("1.3.6.1.2.1.1.1.0");//sysdescr
			System.out.println(result[1]);

			//获取当前进程
			//进程开始OID:1.3.6.1.2.1.25.4.2.1
	}

	
	

}
