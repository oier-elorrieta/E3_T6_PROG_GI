package model.metodoak;

import java.awt.Font;

import javax.swing.*;
import javax.swing.border.*;

import controller.APP;
import model.Filma;
import model.Saioa;
import model.SesioAldagaiak;
import model.sql.KontsultakSQL;
import view.*;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;

public class View_metodoak {
	/**
	 * @wbp.parser.entryPoint
	 */
	public static JButton btn_login() {
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login = new Login();

				login.setVisible(true);
			}
		});
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setForeground(Color.RED);
		btnLogin.setBounds(943, 53, 190, 54);
		btnLogin.setFont(new Font("SansSerif", Font.BOLD, 22));
		btnLogin.setFocusPainted(false);
		return btnLogin;
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
		btnJarraitu.setBounds(930, 565, 169, 54);
		btnJarraitu.setFont(new Font("Segoe UI", Font.BOLD, 21));
		btnJarraitu.setFocusPainted(false);
		return btnJarraitu;
	}

	public static boolean dataKonprobatu(Saioa saioAukera) {
		boolean atera = false;
		if (saioAukera.getData().getTime() >= SesioAldagaiak.dataAukeratuta.getTime() && saioAukera.getData().getDay() == SesioAldagaiak.dataAukeratuta.getDay()) {
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
					saioaAukerak.add(saioak[i]);
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
}
