package connectDB;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Database {
	
	public static Connection con = null;
	private static Database instance = new Database();
	public static Database getInstance() {
		return instance;
	}

	public void connect() {
		String url = "jdbc:sqlserver://localhost:1433;databasename=QLKaraoke";
		String user = "sa";
		String password = "crisky99";
		try {
			con = DriverManager.getConnection(url, user, password);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void disconnect() {
		if(con != null)
			try {
				con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
	}
	public static Connection getConnection() {
		System.out.println("Kết nối thành công!");
		return con;
		
	}

}
