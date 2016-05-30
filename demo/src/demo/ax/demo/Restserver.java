package demo.ax.demo;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import demo.ax.client.Property;
import demo.ax.client.EntityDiscoverInfo;

public class Restserver {

	public static void main(String[] args) {

		TestApi service = new TestApi();
		
		JAXRSServerFactoryBean restServer = new JAXRSServerFactoryBean();
		restServer.setResourceClasses(Property.class, EntityDiscoverInfo.class);

		restServer.setServiceBean(service);

		restServer.setAddress("http://localhost:8080/");

		restServer.create();

	}

}