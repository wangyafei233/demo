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
		object[0] = "1";// Object�������洢�����Ĳ���
		try {
			call = (Call) service.createCall();
			call.setTargetEndpointAddress(endpoint);// Զ�̵���·��
			call.setOperationName("getEventState");// ���õķ�����

			// ���ò�����:
			call.addParameter("eventId", // ������
					XMLType.XSD_INT, // ��������:String
					ParameterMode.IN);// ����ģʽ��'IN' or 'OUT'

			// ���÷���ֵ���ͣ�
			call.setReturnType(XMLType.XSD_BOOLEAN);// ����ֵ���ͣ�String

			Boolean result1 = (Boolean) call.invoke(object);// Զ�̵���
			System.out.println(result1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
