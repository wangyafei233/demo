package demo.ax.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demo.ax.connect.Connec;
import java.sql.Connection;

/**
 * Servlet implementation class FoltViewServlet
 * 刷新数据显示在主页折线图中
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/foltviewservlet" })
public class FoltViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FoltViewServlet() {
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
		String cpua = "";
		String memoryb = "";
		Boolean ok = true;
		HttpSession session = request.getSession();
		try {
			Connection conn= Connec.con();
			Statement statement =conn.createStatement();
			Statement statement1 =conn.createStatement();
			String sql = "";
			int aint = -1;
			int aint1 = -1;
			while (ok) {
				ResultSet rstwo1 = null;
				Object rstwo = session.getAttribute("rsrs");
				if (rstwo != null) {
					rstwo1 = (ResultSet) rstwo;
					rstwo1.last();
					aint = rstwo1.getInt(1);
					rstwo1.first();
					aint1 = rstwo1.getInt(1);
				}
				// sql = "select * from `database`";
				sql = "SELECT * FROM (SELECT * FROM `database` ORDER BY id DESC limit 30)t ORDER BY id ";
				ResultSet rs = statement.executeQuery(sql);
				session.setAttribute("rsrs", rs);
				if (rstwo1 == null) {
					// System.out.println("初次访问");
					while (rs.next()) {
						String name2 = rs.getString(2);
						String name3 = rs.getString(3);
						cpua += name2;
						memoryb += name3;
					}
					ok = false;
				} else {
					// System.out.println("数据不变");
					rs.first();
					int rsid = rs.getInt(1);
					System.out.println("");
					rs.last();
					if (aint == rs.getInt(1) && aint1 == rsid) {
						// session.invalidate();
						try {
							Thread.sleep(1000);
							// System.out.println("我要睡1s");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						// System.out.println("数据变化");
						ResultSet rs2 = statement1.executeQuery(sql);
						while (rs2.next()) {
							String name2 = rs2.getString(2);
							String name3 = rs2.getString(3);
							cpua += name2;
							memoryb += name3;
						}
						ok = false;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage() + "   ajax changlunxun");
		}
		
		out.print(cpua + "&&" + memoryb);
		out.close();
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
