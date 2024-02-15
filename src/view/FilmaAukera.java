package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import model.*;
import model.metodoak.*;
import model.sql.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FilmaAukera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmaAukera frame = new FilmaAukera();
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
	public FilmaAukera() {
		System.out.println();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1182, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton btnLogin = View_metodoak.btn_login();
		
		JButton btnJarraitu = View_metodoak.btn_jarraitu();
		
		JButton btnAmaiera = View_metodoak.btn_amaiera();
		
		ButtonGroup bg = new ButtonGroup();
		
		JLabel lblFilmLista = new JLabel("FILMEN LISTA");
		lblFilmLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmLista.setBounds(310, 11, 452, 58);
		lblFilmLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
		contentPane.add(lblFilmLista);
		
		JLabel lblAukeratuFilma = new JLabel("Aukeratu zinema bat:");
		lblAukeratuFilma.setBounds(79, 70, 239, 25);
		lblAukeratuFilma.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukeratuFilma.setVerticalAlignment(SwingConstants.TOP);
		lblAukeratuFilma.setFont(new Font("SansSerif", Font.BOLD, 18));
		contentPane.add(lblAukeratuFilma);
		
		Filma[] filmaux = new Filma[KontsultakSQL.kont_filmak];
		filmaux = KontsultakSQL.karteldegiaSortuta.getFilmaList();
		int bound = 100;
		
		for (int i = 0; i < KontsultakSQL.kont_filmak; i++) {
			JRadioButton rdbtnFilma = new JRadioButton(filmaux[i].getFilma_izena());
			rdbtnFilma.setBounds(bound, 300 , 200, 54);
			rdbtnFilma.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnFilma.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			rdbtnFilma.setFocusPainted(false);
			contentPane.setLayout(null);
			contentPane.add(rdbtnFilma);
			bound = bound + 165;
			bg.add(rdbtnFilma);
		}
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(btnLogin);
		contentPane.add(btnAmaiera);
		contentPane.add(btnJarraitu);
		
	}
}
