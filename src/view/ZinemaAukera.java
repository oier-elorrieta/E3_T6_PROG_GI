package view;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import controller.APP;
import model.*;
import model.metodoak.*;
import model.sql.*;

import java.awt.Font;
import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		contentPane.setLayout(null);
		
		JLabel lblZinemaLista = new JLabel("ZINEMA LISTA");
		lblZinemaLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
		lblZinemaLista.setBounds(304, 11, 452, 58);
		lblZinemaLista.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblAukeratu = new JLabel("Aukeratu zinema bat:");
		lblAukeratu.setBounds(79, 70, 239, 25);
		lblAukeratu.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukeratu.setVerticalAlignment(SwingConstants.TOP);
		lblAukeratu.setFont(new Font("SansSerif", Font.BOLD, 18));
		
		JButton btnJarraitu = View_metodoak.btn_jarraitu();
		
		JButton btnAmaiera = View_metodoak.btn_amaiera();
		
		JButton btnLogin = View_metodoak.btn_login();
		
		ButtonGroup bg = new ButtonGroup();
		
		Zinema[] zinemaAux = new Zinema[KontsultakSQL.kont_zinemak];
		zinemaAux = KontsultakSQL.zinemaKudeatzailea.getZinemaList();
		int bound = 100;
		
		
		for (int i = 0; i < KontsultakSQL.kont_zinemak; i++) {
			JRadioButton rdbtnZinema = new JRadioButton(zinemaAux[i].getZinema_izena());
			rdbtnZinema.setActionCommand(String.valueOf(i));
			rdbtnZinema.setBounds(bound, 300 , 200, 54);
			rdbtnZinema.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnZinema.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			rdbtnZinema.setFocusPainted(false);
			contentPane.setLayout(null);
			contentPane.add(rdbtnZinema);
			bound = bound + 165;
			bg.add(rdbtnZinema);
		}
		contentPane.add(lblZinemaLista);
		contentPane.add(btnLogin);
		contentPane.add(lblAukeratu);
		contentPane.add(btnAmaiera);
		contentPane.add(btnJarraitu);
		
		btnJarraitu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int aukera= 0;
				aukera = Integer.parseInt(bg.getSelection().getActionCommand());
				
				dispose();
				FilmaAukera filmaAukera = new FilmaAukera();
				filmaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				filmaAukera.setVisible(true);
			}
		});
	}
}
