package model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.SesioAldagaiak;

public class InsertakSQL {
	private static final String url = "jdbc:mysql://localhost:3306/e3_t6_prog_gi";
	private static final String user = "root";
	private static final String pass = "";
	
	public static void BezeroaSartzekoKonexioa() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexioa = DriverManager.getConnection(url, user, pass);
			
			Statement sentencia = conexioa.createStatement();
			
			String sql = "insert into bezeroa values ('"+SesioAldagaiak.bezeroIzena.getBezeroa_NAN()+"','" + SesioAldagaiak.bezeroIzena.getBezeroa_izena() + "','" +SesioAldagaiak.bezeroIzena.getBezeroa_abizenak()+"','"+SesioAldagaiak.bezeroIzena.getBezeroa_pasahitza() + "','" + SesioAldagaiak.bezeroIzena.getBezeroa_sexua()+"');";		
			sentencia.executeUpdate(sql);
			
			sentencia.close();
			conexioa.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
	}
}
