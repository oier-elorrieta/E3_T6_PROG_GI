package model.sql;

import java.sql.*;
import java.util.ArrayList;

import model.Aretoa;
import model.BezeroKudeatzailea;
import model.Bezeroa;
import model.Filma;
import model.Karteldegia;
import model.Saioa;

public class KontsultakSQL {
	private static Karteldegia karteldegiaEginda;
	private static BezeroKudeatzailea bezeroaKudeatzailea;
	
	private static ResultSet emaitza;
	private static String kontsulta;
	
	public static int kont_filmak;
	public static int kont_saioak;
	public static int kont_aretoak;
	public static int kont_zinemak;
	
	private static Filma[] filmaList;
	private static Aretoa[] aretoList;
	private static Saioa[] saioList;
	
	public static void sql_zenbatu (Connection konexioa, Statement statement) throws SQLException {
		kontsulta = "SELECT count(*) c FROM filma";
		emaitza = statement.executeQuery(kontsulta);
		while(emaitza.next()) {
			kont_filmak = emaitza.getInt("c");
		}
		
		kontsulta = "SELECT count(*) c FROM saioa";
		emaitza = statement.executeQuery(kontsulta);
		while(emaitza.next()) {
			kont_saioak = emaitza.getInt("c");
		}
		
		kontsulta = "SELECT count(*) c FROM aretoa";
		emaitza = statement.executeQuery(kontsulta);
		while(emaitza.next()) {
			kont_aretoak = emaitza.getInt("c");
		}
		
		kontsulta = "SELECT count(*) c FROM zinema";
		emaitza = statement.executeQuery(kontsulta);
		while(emaitza.next()) {
			kont_zinemak = emaitza.getInt("c");
		}
	}
	
	
	public static void sql_karteldegia_filmak (Connection konexioa, Statement statement) throws SQLException{
		int kont = 0;
		kontsulta = "SELECT f.izena , f.iraupena, g.izena FROM filma f JOIN generoa g on f.id_generoa = g.id_generoa";
		emaitza = statement.executeQuery(kontsulta);
		filmaList = new Filma[kont_filmak];
		
		while(emaitza.next()) {
			Filma filma = new Filma(emaitza.getString("f.izena"), emaitza.getString("g.izena"), emaitza.getInt("f.iraupena"));
			filmaList[kont] = filma;
			kont++;
		}
		karteldegiaEginda = new Karteldegia(filmaList);	
	}
	
	public static void sql_bezeroak (Connection konexioa, Statement statement) throws SQLException{
		ArrayList<Bezeroa> bezeroList = new ArrayList<Bezeroa>();
		kontsulta = "SELECT * FROM bezeroa";
		emaitza = statement.executeQuery(kontsulta);
		while(emaitza.next()) {
			Bezeroa bezeroa = new Bezeroa(emaitza.getString("NAN"), emaitza.getString("izena"),emaitza.getString("abizena"),emaitza.getString("pasahitza"),emaitza.getString("sexua").charAt(0));
			bezeroList.add(bezeroa);
		}
		bezeroaKudeatzailea = new BezeroKudeatzailea(bezeroList);
	}	
	
	public static void sql_aretoak (Connection konexioa, Statement statement) throws SQLException{
		int kont = 0;
		kontsulta = "SELECT izena FROM aretoa";
		emaitza = statement.executeQuery(kontsulta);
		 aretoList = new Aretoa[kont_aretoak];
		while(emaitza.next()) {
			Aretoa aretoa = new Aretoa(emaitza.getString("izena"));
			aretoList[kont] = aretoa;
			kont++;
		}
	}
	
	public static void sql_saioak (Connection konexioa, Statement statement) throws SQLException{
		saioList = new Saioa[kont_saioak];
		Aretoa aretoaux = new Aretoa();
		Filma filmaaux = new Filma();
		int kont = 0;
		String aux;
		kontsulta = "SELECT s.saioa_data, a.izena, f.izena, prezioa FROM aretoa a join saioa s on s.id_aretoa = a.ID_aretoa	join filma f on s.id_filma = f.id_filma";
		emaitza = statement.executeQuery(kontsulta);
		
		while(emaitza.next()) {
			aux = emaitza.getString("a.izena");
			for (int i = 0; i < kont_aretoak; i++) {
				if (aretoList[i].getAreto_izena().equals(aux)) {
					aretoaux = aretoList[i];
				}
			}
			
			kont = 0;
			aux = emaitza.getString("f.izena");
			for (int i = 0; i < kont_filmak; i++) {
				if (filmaList[i].getFilma_izena().equals(aux)) {
					filmaaux = filmaList[i];
				}
			}
			Saioa saioa = new Saioa(emaitza.getDate("s.saioa_data"),aretoaux, filmaaux,emaitza.getDouble("prezioa"));
			saioList[kont] = saioa;
			kont++;
		}
		
		System.out.println(saioList.toString());
	}
}
