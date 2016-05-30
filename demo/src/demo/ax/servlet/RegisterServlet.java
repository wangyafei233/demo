package demo.ax.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.ax.connect.Connec;

/**
 * Servlet implementation class RegisterServlet ×¢²áÕË»§
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/registerservlet" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("registername");
		String password = request.getParameter("registerpwd");
		String type = request.getParameter("registertype");
		String message = "";
		Connection conn = null;
		Statement statement = null;
		try {
			conn = Connec.con();
			statement = conn.createStatement();
			String sql = "INSERT INTO `user`" + " (username,password,type)" + " VALUES ('" + username + "','" + password
					+ "','" + type + "')";
			int c = statement.executeUpdate(sql);
			if (c > 0) {
				message = "Register Successful!";
			} else {
				message = "Register ERRO!";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		request.setAttribute("message", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
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
