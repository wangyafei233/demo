package demo.ax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.ax.dao.SendMail;

/**
 * Servlet implementation class ErroMail
 * 发送email
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/erromail" })
public class ErroMail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ErroMail() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		String to = new String(request.getParameter("subjectdata").getBytes("ISO-8859-1"), "UTF-8");
		String subject = "demo 系统警告";
		String content = new String(request.getParameter("bodydata").getBytes("ISO-8859-1"), "UTF-8");
		SendMail sendmail = new SendMail();
		boolean mark = sendmail.senda(to, subject, content);
		System.out.println(mark);
		out.print(mark);
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
