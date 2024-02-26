package model.sql;

import java.sql.*;

public class ConexioaSQL {
	private static final String url = "jdbc:mysql://localhost:3306/e3_t6_prog_gi";
	private static final String user = "root";
	private static final String pass = "";

	public static void datuakKargatu() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conexioa = DriverManager.getConnection(url, user, pass);
			
			Statement sentencia = conexioa.createStatement();
			
			KontsultakSQL.sql_zenbatu(conexioa, sentencia);
			KontsultakSQL.sql_karteldegia_filmak(conexioa, sentencia);
			KontsultakSQL.sql_bezeroak(conexioa, sentencia);
			KontsultakSQL.sql_zinemak(conexioa, sentencia);
			
			sentencia.close();
			conexioa.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
	}
}
