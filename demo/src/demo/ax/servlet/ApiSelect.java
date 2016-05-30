package demo.ax.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.ax.client.Dcm;
import demo.ax.client.Dcm_Service;

/**
 * Servlet implementation class ApiSelect
 */
@WebServlet("/apiselect")
public class ApiSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ApiSelect() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// RoomService service = new RoomService();
		Dcm_Service dcms = new Dcm_Service();
		Dcm dc = dcms.getDcmPort();

		// JAXRSServerFactoryBean restServer = new JAXRSServerFactoryBean();
		// restServer.setResourceClasses(Room.class, Person.class, Rooms.class);
		//
		// restServer.setServiceBeans(dc);
		//
		// restServer.setAddress("http://localhost:9999/");
		//
		// restServer.create();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
