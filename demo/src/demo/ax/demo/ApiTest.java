package demo.ax.demo;

import java.util.ArrayList;
import java.util.List;

import demo.ax.client.Dcm;
import demo.ax.client.Dcm_Service;
import demo.ax.client.EntityProperty;
import demo.ax.client.EntityType;
import demo.ax.client.Property;

public class ApiTest {

	public static void main(String[] args) {
		Dcm_Service dcms = new Dcm_Service();
		Dcm dc = dcms.getDcmPort();
		List<Property> property = new ArrayList<Property>();
		Property username = new Property();
		Property type = new Property();
		Property conn = new Property();
		Property management = new Property();
		Property power = new Property();
		username.setName(EntityProperty.NAME);
		type.setName(EntityProperty.ENTITY_TYPE);
		conn.setName(EntityProperty.CONNECTOR_NAME);
		management.setName(EntityProperty.BMC_ADDRESS);
		power.setName(EntityProperty.DERATED_PWR);
		management.setValue("192.168.124.21");
		conn.setValue("com.intel.dcm.plugin.Ipmi20Plugin");
		type.setValue("server");
		username.setValue("root");
		power.setValue("600");
		property.add(username);
		property.add(type);
		property.add(conn);
		property.add(management);
		property.add(power);

		EntityProperty a = EntityProperty.fromValue("BMC_ADDRESS");

		try {
			// dc.removeEntity(20, true);
			// ret = dc.findEntities(a, "192.168.124.32", false);
			int ret;
//			ret = dc.addEntity(EntityType.NODE, property, true);
			dc.associateEntity(21, 22);
			// for (int i = 0; i < ret.size(); i++) {
			System.out.println();
			// }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
