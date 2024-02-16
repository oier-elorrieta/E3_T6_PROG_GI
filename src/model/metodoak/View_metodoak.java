package model.metodoak;

import java.awt.Font;

import javax.swing.*;
import javax.swing.border.*;

import controller.APP;
import model.Saioa;
import view.*;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	
	public static void filmaAukeraSortu() {
        FilmaAukera filmaAukera = new FilmaAukera();
        filmaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        filmaAukera.setVisible(true);
    }
    
    public static boolean filmaDatagatikAtera(Saioa saioAukera) {
        boolean atera = false;
        Date dataEgungoa = new Date(System.currentTimeMillis() + 1000);
        int komparaketa = saioAukera.getData().compareTo(dataEgungoa);
        if (komparaketa < 0) {
            atera = false;
        } else if (komparaketa > 0) {
            atera = true;
        } else {
            atera = true;
        }
        
        return atera;
    }
}
