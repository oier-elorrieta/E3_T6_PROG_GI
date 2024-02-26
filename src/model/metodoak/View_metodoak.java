package model.metodoak;

import java.awt.Font;

import javax.swing.*;

import model.Filma;
import model.Saioa;
import model.SesioAldagaiak;

import java.awt.Color;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class View_metodoak {
	/**
	 * @wbp.parser.entryPoint
	 */
	public static JButton btn_login() {
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setForeground(Color.RED);
		btnLogin.setBounds(943, 53, 190, 54);
		btnLogin.setFont(new Font("SansSerif", Font.BOLD, 22));
		btnLogin.setFocusPainted(false);
		
		return btnLogin;
	}
	
	public static JButton btn_logout() {
		 JButton btnLogOut = new JButton("Logout");
			btnLogOut.setBackground(Color.BLACK);
			btnLogOut.setForeground(Color.RED);
			btnLogOut.setBounds(943, 53, 190, 54);
			btnLogOut.setFont(new Font("SansSerif", Font.BOLD, 22));
			btnLogOut.setFocusPainted(false);
			return btnLogOut;
	}
	
	public static JLabel lbl_textLog ()	{
		 JLabel lblOngiEtorri = new JLabel("Ongi etorri, " + SesioAldagaiak.bezeroIzena.getBezeroa_izena() + "!");
		 lblOngiEtorri.setHorizontalAlignment(SwingConstants.CENTER);
		 lblOngiEtorri.setFont(new Font("SansSerif", Font.BOLD, 12));
	     lblOngiEtorri.setBounds(943, 118, 190, 14);
        return lblOngiEtorri;
	}
	
	public static JButton btn_amaiera() {
		JButton btnAmaiera = new JButton("Amaiera");
		btnAmaiera.setBounds(739, 565, 159, 54);
		btnAmaiera.setFont(new Font("Segoe UI", Font.BOLD, 21));

		btnAmaiera.setFocusPainted(false);
		return btnAmaiera;
	}

	public static JButton btn_jarraitu() {
		JButton btnJarraitu = new JButton("Jarraitu");
		btnJarraitu.setBounds(943, 565, 169, 54);
		btnJarraitu.setFont(new Font("Segoe UI", Font.BOLD, 21));
		btnJarraitu.setFocusPainted(false);
		return btnJarraitu;
	}
	
	

	@SuppressWarnings("deprecation")
	public static boolean dataKonprobatu(Saioa saioAukera) {
		boolean atera = false;
		if (saioAukera.getData().getTime() >= SesioAldagaiak.dataAukeratuta.getTime() && saioAukera.getData().getDate() == SesioAldagaiak.dataAukeratuta.getDate() && saioAukera.getData().getMonth() == SesioAldagaiak.dataAukeratuta.getMonth() && saioAukera.getData().getYear() == SesioAldagaiak.dataAukeratuta.getYear()) {
			atera = true;
		}
		return atera;
	}

	public static ArrayList<Saioa> saioakAtera(Saioa[] saioak, Filma filmaAukeratuta) {
		ArrayList<Saioa> saioaAukerak = new ArrayList<Saioa>();
		boolean atera;
		for (int i = 0; i < saioak.length; i++) {
			atera = dataKonprobatu(saioak[i]);
			if (atera) {
				if (saioak[i].getFilma().equals(filmaAukeratuta)) {
					if(!saioaAukerak.contains(saioak[i])) {
					saioaAukerak.add(saioak[i]);}
				}
			}
		}
		return saioaAukerak;
		
	}
	
	public static ArrayList<Integer> filmakAtera(Saioa[] saioak){
		ArrayList<Integer> karteldegiPos = new ArrayList<Integer>();
		boolean atera;
		for (int i = 0; i < saioak.length; i++) {
			atera = dataKonprobatu(saioak[i]);
			if (atera) {
				for (int z = 0; z < SesioAldagaiak.karteldegiaSortuta.getFilmaList().length; z++) {
					if (SesioAldagaiak.karteldegiaSortuta.getFilmaList()[z].getFilma_izena().equals(saioak[i].getFilma().getFilma_izena())){	
					if(!karteldegiPos.contains(z)) {
                            karteldegiPos.add(z);
                        }
					}
				}
			}
		}
		return karteldegiPos;
	}
	
	@SuppressWarnings("deprecation")
	public static String dateToString (Date dataAldatzeko) {
		String dataAldatuta;

		if (dataAldatzeko.getMinutes() < 10) {
			dataAldatuta = dataAldatzeko.getHours() + ":0" + dataAldatzeko.getMinutes() + " h.";
		} else {
			dataAldatuta = dataAldatzeko.getHours() + ":" + dataAldatzeko.getMinutes() + " h.";
		}

		return dataAldatuta;
	}
	
	@SuppressWarnings("deprecation")
	public static void ticketSortu() throws IOException {
		Date dataOrain = new Date();
		String rutaArchivo = "ticket_" + dataOrain.getTime() + ".txt";
		File archivo = new File(rutaArchivo);
		FileWriter escritor = new FileWriter(archivo);
		BufferedWriter bufferedWriter = new BufferedWriter(escritor);
		
		for (int i = 0; i < SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().size();i++) {
			
			bufferedWriter.write("Filma: " + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getFilma().getFilma_izena());
			 bufferedWriter.newLine();
			 bufferedWriter.write("Iraupena: " + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getFilma().getFilma_iraupena() + " minutu.");
			 bufferedWriter.newLine();
			 bufferedWriter.write("Aretoa: " + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getAretoa().getAreto_izena());
			 bufferedWriter.newLine();	
			 bufferedWriter.write("Saioaren Data: " + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getData().getDay() + "/" + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getData().getMonth() + "/" + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getData().getYear());
			 bufferedWriter.newLine();	
			 bufferedWriter.write("Ordua: " + dateToString(SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getData()));
			 bufferedWriter.newLine();
			 bufferedWriter.write("Petsona Kopurua: " + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getPertsonaKopurua());
			 bufferedWriter.newLine();	       		
			 bufferedWriter.write("------------------------------------------------");
			 bufferedWriter.newLine();
		}
		bufferedWriter.write("Bezeroa: ");
		bufferedWriter.newLine();
		bufferedWriter.write("\t Izena: " + SesioAldagaiak.sarreraKudeatzailea.getBezeroa().getBezeroa_izena() + " " + SesioAldagaiak.sarreraKudeatzailea.getBezeroa().getBezeroa_abizenak());
		bufferedWriter.newLine();
		bufferedWriter.write("\t NAN: " + SesioAldagaiak.sarreraKudeatzailea.getBezeroa().getBezeroa_NAN());
		bufferedWriter.newLine();
		bufferedWriter.write("Precio totala: " + SesioAldagaiak.sarreraKudeatzailea.getTicket_prezioa() + "€");
		bufferedWriter.newLine();
		bufferedWriter.write("Erosketa Data: " + dataOrain);
		bufferedWriter.close();
	}
}