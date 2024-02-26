package model.sql;

import java.sql.*;

import model.BezeroKudeatzailea;
import model.Bezeroa;
import model.Filma;
import model.FilmaKudeatzailea;
import model.SesioAldagaiak;

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
	
	public static void BezeroaSartuKonexioaIreki() {
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
