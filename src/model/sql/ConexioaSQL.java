package model.sql;

import java.sql.*;

public class ConexioaSQL {

	public static void conexioaIrekiEtaItxi() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/e3_t6_prog_gi";
			String user = "root";
			String pass = "";
			
			Connection conexion = DriverManager.getConnection(url, user, pass);
			
			conexion.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
	}
	
	
}
