package demo.ax.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demo.ax.connect.Connec;

/**
 * Servlet implementation class LoginServlet 登录账户
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/loginservlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		HttpSession session = request.getSession();
		String message = "";
		String jsp = "login.jsp";
		// // 驱动程序名
		// String driverName = "com.mysql.jdbc.Driver";
		// // 数据库用户名
		// String userName = "root";
		// // 密码
		// String userPasswd = "";
		// // 数据库名
		// String dbName = "demosql";
		// // 联结字符串
		// String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName
		// + "&password=" + userPasswd;
		// Class.forName(driverName);
		// Connection connection = DriverManager.getConnection(url);
		// Statement statement = connection.createStatement();

		try {
			Connection conn = Connec.con();
			Statement statement = conn.createStatement();
			String sql = "SELECT * FROM `user`";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				ResultSet type2 = rs;
				String user11 = rs.getString(2);
				if (username.equals(user11)) {
					if (password.equals(type2.getString(3))) {
						if (type.equals(type2.getString(4))) {
							session.setAttribute("user", type2);
							message = "Login Successful!";
							jsp = "add2.jsp";
							break;
						} else {
							message = "Login ERRO!!";
						}
					} else {
						message = "Login ERRO!!";
					}
				} else {
					message = "Login ERRO!!";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		session.setAttribute("lista", "aaaaaaaaaaaa");
		request.setAttribute("message", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);
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
