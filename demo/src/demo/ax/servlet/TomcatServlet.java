package demo.ax.servlet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import demo.ax.connect.Connec;
import demo.ax.dao.ComputerData;

/*�Զ�������Ϣ�����ݿ�*/
public class TomcatServlet implements ServletContextListener {

	private int num = 0;

	// �÷�����ServletContext����֮�󱻵��ã���׼���ô���ͻ�������
	public void contextInitialized(ServletContextEvent event) {
		AutoRunThread autoRunThread = new AutoRunThread();
		autoRunThread.start();
	}

	// ���������ServletContext ��Ҫ�رյ�ʱ�����
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
					// System.out.println("5��/��....");
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
		String wulimemory = Get.GetTotalPhysicalMemorySize() + "M";// �������洢�ռ�
		String maxmemory = Get.getTotalMemory() + "M";// ���ڴ�
		float a = Get.getFreeMemory();// ʣ���ڴ�
		float b = Get.getTotalMemory();// ���ڴ�
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
				System.out.println(message + "*****" + "�ѱ���" + num + "����");
			} else {
				message = " ERRO!";
				System.out.println(message + "*****" + "����ʧ�ܣ�");
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
