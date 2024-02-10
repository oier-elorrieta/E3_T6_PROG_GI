package model.sql;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import model.Aretoa;
import model.BezeroKudeatzailea;
import model.Bezeroa;
import model.Filma;
import model.FilmaKudeatzailea;
import model.Saioa;
import model.Zinema;
import model.ZinemaKudeatzailea;

public class KontsultakSQL {
	private static ResultSet emaitza;
	private static String kontsulta;

	public static int kont_filmak;
	public static int kont_saioak;
	public static int kont_aretoak;
	public static int kont_zinemak;

	private static Filma[] filmaList;
	private static ArrayList<Bezeroa> bezeroaList;
	private static Aretoa[] aretoaList;
	private static Saioa[] saioaList;
	private static Zinema[] zinemaList;

	public static FilmaKudeatzailea karteldegiaSortuta;
	public static BezeroKudeatzailea bezeroaKudeatzailea;
	public static ZinemaKudeatzailea zinemaKudeatzailea;

	public static void sql_zenbatu(Connection konexioa, Statement statement) throws SQLException {
		kontsulta = "SELECT count(*) c FROM filma";
		emaitza = statement.executeQuery(kontsulta);
		while (emaitza.next()) {
			kont_filmak = emaitza.getInt("c");
		}

		kontsulta = "SELECT count(*) c FROM saioa";
		emaitza = statement.executeQuery(kontsulta);
		while (emaitza.next()) {
			kont_saioak = emaitza.getInt("c");
		}

		kontsulta = "SELECT count(*) c FROM aretoa";
		emaitza = statement.executeQuery(kontsulta);
		while (emaitza.next()) {
			kont_aretoak = emaitza.getInt("c");
		}

		kontsulta = "SELECT count(*) c FROM zinema";
		emaitza = statement.executeQuery(kontsulta);
		while (emaitza.next()) {
			kont_zinemak = emaitza.getInt("c");
		}
	}

	public static void sql_karteldegia_filmak(Connection konexioa, Statement statement) throws SQLException {
		filmaList = new Filma[kont_filmak];
		int kont = 0;

		kontsulta = "SELECT f.izena , f.iraupena, g.izena FROM filma f JOIN generoa g on f.id_generoa = g.id_generoa";
		emaitza = statement.executeQuery(kontsulta);

		while (emaitza.next()) {
			Filma filmaSortuta = new Filma(emaitza.getString("f.izena"), emaitza.getString("g.izena"),
					emaitza.getInt("f.iraupena"));
			filmaList[kont] = filmaSortuta;
			kont++;
		}

		karteldegiaSortuta = new FilmaKudeatzailea(filmaList);
	}

	public static void sql_bezeroak(Connection konexioa, Statement statement) throws SQLException {
		bezeroaList = new ArrayList<Bezeroa>();

		kontsulta = "SELECT * FROM bezeroa";
		emaitza = statement.executeQuery(kontsulta);

		while (emaitza.next()) {
			Bezeroa bezeroaSortuta = new Bezeroa(emaitza.getString("NAN"), emaitza.getString("izena"),
					emaitza.getString("abizena"), emaitza.getString("pasahitza"), emaitza.getString("sexua").charAt(0));
			bezeroaList.add(bezeroaSortuta);
		}

		bezeroaKudeatzailea = new BezeroKudeatzailea(bezeroaList);
	}

	

	public static void sql_zinemak(Connection konexioa, Statement statement) throws SQLException {
		zinemaList = new Zinema[kont_zinemak];
		Aretoa[] aretoaAuxList;
		Saioa[] saioaAuxList;
		String aux;
		int kont_sql = 0;
		int posAreto = 0;
		int posFilma = 0;
		int kont = 0;

		for (int i = 1; i <= kont_zinemak; i++) {
			// ARETOS
			kontsulta = "SELECT count(*) c from aretoa where id_zinema = " + i;
			emaitza = statement.executeQuery(kontsulta);
			while (emaitza.next()) {
				kont_sql = emaitza.getInt("c");
			}

			aretoaAuxList = new Aretoa[kont_sql];

			kontsulta = "SELECT izena from aretoa where id_zinema = " + i;
			emaitza = statement.executeQuery(kontsulta);
			while (emaitza.next()) {
				Aretoa aretoaSortuta = new Aretoa(emaitza.getString("izena"));
				aretoaAuxList[kont] = aretoaSortuta;
				kont++;
			}

			kont = 0;
			// SAIOS
			kontsulta = "SELECT count(*) c FROM zinema z join aretoa a on z.ID_zinema = a.ID_zinema join saioa s on s.id_aretoa = a.ID_aretoa	join filma f on s.id_filma = f.id_filma where a.ID_zinema = "
					+ i;
			emaitza = statement.executeQuery(kontsulta);
			while (emaitza.next()) {
				kont_sql = emaitza.getInt("c");
			}

			saioaAuxList = new Saioa[kont_sql];

			kontsulta = "SELECT s.saioa_data, a.izena, f.izena, prezioa, z.ID_zinema FROM zinema z join aretoa a on z.ID_zinema = a.ID_zinema join saioa s on s.id_aretoa = a.ID_aretoa	join filma f on s.id_filma = f.id_filma where a.ID_zinema = "
					+ i;
			while (emaitza.next()) {
				aux = emaitza.getString("a.izena");
				for (int j = 0; j < kont_aretoak; j++) {
					if (aretoaAuxList[j].getAreto_izena().equals(aux)) {
						posAreto = j;
					}
				}
				aux = emaitza.getString("f.izena");
				for (int j = 0; j < kont_filmak; j++) {
					if (filmaList[j].getFilma_izena().equals(aux)) {
						posFilma = j;
					}
				}
				Saioa saioaSortuta = new Saioa(emaitza.getDate("s.saioa_data"), aretoaAuxList[posAreto],
						filmaList[posFilma], emaitza.getDouble("prezioa"));
				saioaAuxList[kont] = saioaSortuta;
				kont++;
			}
			kontsulta = "SELECT izena, helbidea, telefonoa from zinema where id_zinema = " + i;
			emaitza = statement.executeQuery(kontsulta);
			while (emaitza.next()) {
				Zinema zinemaSortuta = new Zinema(emaitza.getString("izena"), emaitza.getString("helbidea"),
						emaitza.getInt("telefonoa"), aretoaAuxList, saioaAuxList);
				zinemaList[i-1] = zinemaSortuta;
			}
		}
		zinemaKudeatzailea = new ZinemaKudeatzailea(zinemaList);
	}
}
