package demo.ax.servlet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import demo.ax.connect.Connec;
import demo.ax.dao.ComputerData;

/*自动保存信息到数据库*/
public class TomcatServlet implements ServletContextListener {

	private int num = 0;

	// 该方法在ServletContext启动之后被调用，并准备好处理客户端请求
	public void contextInitialized(ServletContextEvent event) {
		AutoRunThread autoRunThread = new AutoRunThread();
		autoRunThread.start();
	}

	// 这个方法在ServletContext 将要关闭的时候调用
	public void contextDestroyed(ServletContextEvent event) {
	}

	public class AutoRunThread extends Thread {
		public AutoRunThread() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void run() {
			try {
				do {
					save();
					// System.out.println("5秒/次....");
					sleep(5 * 1000);
				} while (true);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
			}
		}
	}

	public void save() {
		ComputerData Get = new ComputerData();
		String cpu = (Get.getCpuRatioForWindows()) + "%";
		String wulimemory = Get.GetTotalPhysicalMemorySize() + "M";// 最大物理存储空间
		String maxmemory = Get.getTotalMemory() + "M";// 总内存
		float a = Get.getFreeMemory();// 剩余内存
		float b = Get.getTotalMemory();// 总内存
		double memorylv = (double) Math.round((a / b) * 100);
		String memoryl = memorylv + "%";
		String osName = System.getProperty("os.name");
		// String data = cpu + "%&" + memorylv*100 + "%&" + osName + "&" +
		// maxmemory + "M&" + wulimemory + "M";
		String message = "";

		Connection conn = null;
		Statement statement = null;
		try {
			conn = Connec.con();
			statement = conn.createStatement();
			String sql = "INSERT INTO `database`" + " (cpuname,memoryname,osname,maxmemoryname,wulimemoryname)"
					+ " VALUES ('" + cpu + "','" + memoryl + "','" + osName + "','" + maxmemory + "','" + wulimemory
					+ "')";
			int c = statement.executeUpdate(sql);
			if (c > 0) {
				num += 1;
				message = " Successful!";
				System.out.println(message + "*****" + "已保存" + num + "条！");
			} else {
				message = " ERRO!";
				System.out.println(message + "*****" + "保存失败！");
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
	}
}
