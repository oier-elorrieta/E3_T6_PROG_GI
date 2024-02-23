package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.*;
import model.metodoak.*;
import model.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;

import java.util.Date;

public class FilmaAukera extends JFrame {

	private static final long serialVersionUID = 1L;
	private static ArrayList<Integer> karteldegiPos;
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
	 * 
	 * @param zinemaAukera
	 */

	public FilmaAukera() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1182, 683);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Hasiera.class.getResource("/images/cine.png")));
		setTitle("Filma aukeratu - Talde 6");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JPanel panelFilmak = new JPanel();
		panelFilmak.setBorder(new CompoundBorder());
		panelFilmak.setBounds(66, 173, 1040, 387);
		contentPane.add(panelFilmak);
		panelFilmak.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelFilmak.setLayout(new GridLayout(0, 2));
		

		JPanel panelFilmaIzena = new JPanel();
		panelFilmaIzena.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		panelFilmaIzena.setBounds(302, 73, 599, 39);
		contentPane.add(panelFilmaIzena);
		
		JPanel panelDataIzena = new JPanel();
		panelDataIzena.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		panelDataIzena.setBounds(302, 123, 599, 39);
		contentPane.add(panelDataIzena);
		
		  if(!SesioAldagaiak.logeatuta) {
	        	JButton btnLogin = View_metodoak.btn_login();
	        	btnLogin.addMouseListener(new MouseAdapter() {
	    			@Override
	    			public void mouseClicked(MouseEvent e) {
	    				Login login = new Login("filmaAukera");
	    				login.setVisible(true);
	    				dispose();
	    			}
	    		});
	        	contentPane.add(btnLogin);
	        }else {
	        	JButton btnLogOut = View_metodoak.btn_logout();
	        	btnLogOut.addMouseListener(new MouseAdapter() {
	    			@Override
	    			public void mouseClicked(MouseEvent e) {	
	    				SesioAldagaiak.logeatuta = false;
	    				dispose();
	    				JFrameSortu.filmaAukera();
	    			}
	    		});
	    		contentPane.add(btnLogOut);
	    		JLabel lblOngiEtorri = View_metodoak.lbl_textLog();
	    		contentPane.add(lblOngiEtorri);
	        }

		JButton btnJarraitu = View_metodoak.btn_jarraitu();

		JButton btnAmaiera = View_metodoak.btn_amaiera();

		JLabel lblFilmLista = new JLabel("FILMEN LISTA");
		lblFilmLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmLista.setBounds(0, 11, 1166, 58);
		lblFilmLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
		contentPane.add(lblFilmLista);
	
		JLabel lblAukFilma = new JLabel("Aukeratutako zinema:");
		lblAukFilma.setBounds(90, 80, 221, 25);
		lblAukFilma.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukFilma.setVerticalAlignment(SwingConstants.TOP);
		lblAukFilma.setFont(new Font("SansSerif", Font.BOLD, 18));
		contentPane.add(lblAukFilma);

		JLabel lblFilmAukera = new JLabel(SesioAldagaiak.zinemaAukera.getZinema_izena());
		lblFilmAukera.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmAukera.setBounds(310, 9, 452, 58);
		lblFilmAukera.setFont(new Font("Dialog", Font.BOLD, 21));
		panelFilmaIzena.add(lblFilmAukera);
		
		JLabel lblAukData = new JLabel("Aukeratutako data:");
		lblAukData.setBounds(90, 130, 221, 25);
		lblAukData.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukData.setVerticalAlignment(SwingConstants.TOP);
		lblAukData.setFont(new Font("SansSerif", Font.BOLD, 18));
		contentPane.add(lblAukData);
		
		JLabel lblDataAukera = new JLabel(SesioAldagaiak.dataAukeratuta.getDate() + "/" + (SesioAldagaiak.dataAukeratuta.getMonth()+1) + "/" + SesioAldagaiak.dataAukeratuta.getYear());
		lblDataAukera.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataAukera.setBounds(310, 130, 452, 58);
		lblDataAukera.setFont(new Font("Dialog", Font.BOLD, 21));
		panelDataIzena.add(lblDataAukera);

		ButtonGroup bg = new ButtonGroup();
		int bound = 100;

		karteldegiPos = View_metodoak.filmakAtera(SesioAldagaiak.zinemaAukera.getSaioak());


		for (int i = 0; i < karteldegiPos.size(); i++) {
			JRadioButton rdbtnFilma = new JRadioButton(
					SesioAldagaiak.karteldegiaSortuta.getFilmaList()[karteldegiPos.get(i)].getFilma_izena());
			rdbtnFilma.setActionCommand(
					SesioAldagaiak.karteldegiaSortuta.getFilmaList()[karteldegiPos.get(i)].getFilma_izena());
			rdbtnFilma.setBounds(100, bound, 200, 54);
			rdbtnFilma.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnFilma.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			rdbtnFilma.setFocusPainted(false);
			panelFilmak.add(rdbtnFilma);
			bound = bound + 50;
			bg.add(rdbtnFilma);
		}

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(btnAmaiera);
		contentPane.add(btnJarraitu);

		btnJarraitu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String aukera = "";
				try {
					aukera = bg.getSelection().getActionCommand();
					for (int i = 0; i < SesioAldagaiak.karteldegiaSortuta.getFilmaList().length; i++) {
						if (SesioAldagaiak.karteldegiaSortuta.getFilmaList()[i].getFilma_izena().equals(aukera)) {
							SesioAldagaiak.filmaAukera = SesioAldagaiak.karteldegiaSortuta.getFilmaList()[i];
						}
					}
					dispose();
					JFrameSortu.saioaAukera();
				} catch (Exception e2) {
                	JOptionPane.showMessageDialog(null, "Ez duzu filmarik aukeratu! Aukeratu zerrendako filma bat.", "Errorea", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		btnAmaiera.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JFrameSortu.zinemaAukera();
			}
		});

	}
}