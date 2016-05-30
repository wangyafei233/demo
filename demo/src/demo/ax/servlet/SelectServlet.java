package demo.ax.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.ax.connect.Connec;

/**
 * Servlet implementation class SelectServlet 表格查询资料
 */
@WebServlet("/selectservlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Map<String, String>> li = new ArrayList<Map<String, String>>();
		Connection conn = null;
		Statement statement = null;
		try {
			conn = Connec.con();
			statement = conn.createStatement();
			String sql = "select * from `database`";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				ResultSet type = rs;
				String name1 = type.getString(1);
				String name2 = type.getString(2);
				String name3 = type.getString(3);
				String name4 = type.getString(4);
				String name5 = type.getString(5);
				String name6 = type.getString(6);
				Map<String, String> ma = new HashMap<String, String>();
				ma.put("name1", name1);
				ma.put("name2", name2);
				ma.put("name3", name3);
				ma.put("name4", name4);
				ma.put("name5", name5);
				ma.put("name6", name6);
				li.add(ma);
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
		request.setAttribute("list", li);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
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
