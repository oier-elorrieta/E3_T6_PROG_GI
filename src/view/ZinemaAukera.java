package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.*;
import model.metodoak.*;
import model.sql.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;

public class ZinemaAukera extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZinemaAukera frame = new ZinemaAukera();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ZinemaAukera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1182, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblAukeratu = new JLabel("Aukeratu zinema bat:");
		lblAukeratu.setBounds(99, 75, 177, 25);
		lblAukeratu.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukeratu.setVerticalAlignment(SwingConstants.TOP);
		lblAukeratu.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		
		JButton btnJarraitu = View_metodoak.btn_jarraitu();
		
		JButton btnAmaiera = View_metodoak.btn_amaiera();
		
		JButton btnLogin = View_metodoak.btn_login();
		
		ButtonGroup bg = new ButtonGroup();
		
		Zinema[] zinemaAux = new Zinema[KontsultakSQL.kont_zinemak];
		
		zinemaAux = KontsultakSQL.zinemaKudeatzailea.getZinemaList();
		int bound = 100;
		
		for (int i = 0; i < KontsultakSQL.kont_zinemak; i++) {
			JRadioButton rdbtnZinema = new JRadioButton(zinemaAux[i].getZinema_izena());
			rdbtnZinema.setBounds(bound, 341 , 200, 54);
			rdbtnZinema.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnZinema.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			contentPane.setLayout(null);
			contentPane.add(rdbtnZinema);
			bound = bound + 165;
			bg.add(rdbtnZinema);
		}
		contentPane.setLayout(null);
		
		
		
		JLabel lblZinemaLista = new JLabel("ZINEMA LISTA");
		lblZinemaLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
		lblZinemaLista.setBounds(464, 11, 292, 58);
		lblZinemaLista.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblZinemaLista);
		contentPane.add(btnLogin);
		contentPane.add(lblAukeratu);
		contentPane.add(btnAmaiera);
		contentPane.add(btnJarraitu);
	}
}
