package demo.ax.demo;

import java.util.ArrayList;
import java.util.List;

import demo.ax.client.Dcm;
import demo.ax.client.Dcm_Service;
import demo.ax.client.EntityDiscoverInfo;
import demo.ax.client.EntityProperty;
import demo.ax.client.Property;
import demo.ax.client.ProtocolType;

public class TestApi {

	public static void main(String[] args) {
		
	
	Dcm_Service dcms = new Dcm_Service();
		Dcm dc = dcms.getDcmPort();

		List<Property> property = new ArrayList<Property>();
		Property username = new Property();
		Property password = new Property();
		username.setName(EntityProperty.BMC_USER);
		password.setName(EntityProperty.BMC_PASSWORD);
		username.setValue("root");
		password.setValue("root");
		property.add(username);
		property.add(password);

		// List<Integer> ret = new ArrayList<Integer>();
		EntityProperty a = EntityProperty.fromValue("BMC_ADDRESS");
		List<EntityDiscoverInfo> ret = new ArrayList<EntityDiscoverInfo>();
		try {
			ret = dc.discoverEntities("192.168.124.1", "192.168.124.254", "255.255.255.0", ProtocolType.IPMI, property);
			System.out.println(ret);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	

}
