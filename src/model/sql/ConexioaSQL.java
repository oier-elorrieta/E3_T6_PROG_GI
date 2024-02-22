package model.sql;

import java.sql.*;

import model.Filma;
import model.FilmaKudeatzailea;

public class ConexioaSQL {

	public static void datuakJaitsi() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/e3_t6_prog_gi";
			String user = "root";
			String pass = "";
			
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
