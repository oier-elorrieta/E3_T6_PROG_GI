package model.metodoak;

import java.awt.Font;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.Color;

public class View_metodoak {
	public static JButton btn_login() {
		JButton btnLogin = new JButton("Login");
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
}
