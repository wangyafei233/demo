package demo.ax.demo;

import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

public class sedapi {

	public static void main(String[] args) {
		String endpoint = "http://localhost:8688/DCMWsdl/dcm.wsdl";
		String result = "no result!";
		Service service = new Service();
		Call call;
		Object[] object = new Object[1];
		object[0] = "1";// Object是用来存储方法的参数
		try {
			call = (Call) service.createCall();
			call.setTargetEndpointAddress(endpoint);// 远程调用路径
			call.setOperationName("getEventState");// 调用的方法名

			// 设置参数名:
			call.addParameter("eventId", // 参数名
					XMLType.XSD_INT, // 参数类型:String
					ParameterMode.IN);// 参数模式：'IN' or 'OUT'

			// 设置返回值类型：
			call.setReturnType(XMLType.XSD_BOOLEAN);// 返回值类型：String

			Boolean result1 = (Boolean) call.invoke(object);// 远程调用
			System.out.println(result1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
