package demo.ax.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connec {

	public static Connection con() {

		String driverName = "com.mysql.jdbc.Driver";
		String userName = "root";
		String userPasswd = "";
		String dbName = "demosql";
		Connection connection = null;
		String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd;
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}
}
