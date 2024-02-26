package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;

import model.Saioa;
import model.Sarrera;
import model.SarreraKudeatzailea;
import model.SesioAldagaiak;
import model.metodoak.JFrameSortu;
import model.metodoak.View_metodoak;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;



import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SaioaAukera extends JFrame {

	private static final long serialVersionUID = 1L;
	private static ArrayList<Saioa> saioaAukerak;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaioaAukera frame = new SaioaAukera();
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
	@SuppressWarnings({ "deprecation", "unchecked" })
	public SaioaAukera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1182, 683);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Hasiera.class.getResource("/images/cine.png")));
		setTitle("Saioa aukeratu - Talde 6");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSaioLista = new JLabel("SAIOEN LISTA");
		lblSaioLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaioLista.setBounds(0, 9, 1166, 58);
		lblSaioLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));

		JLabel lblAukFilma = new JLabel("Aukeratutako filma:");
		lblAukFilma.setBounds(90, 80, 221, 25);
		lblAukFilma.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukFilma.setVerticalAlignment(SwingConstants.TOP);
		lblAukFilma.setFont(new Font("SansSerif", Font.BOLD, 18));
		
		JPanel panelFilmaIzena = new JPanel();
		panelFilmaIzena.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		panelFilmaIzena.setBounds(302, 73, 599, 39);
		
		JLabel lblFilmAukera = new JLabel(SesioAldagaiak.filmaAukera.getFilma_izena());
		lblFilmAukera.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmAukera.setBounds(310, 9, 452, 58);
		lblFilmAukera.setFont(new Font("Dialog", Font.BOLD, 21));
		
		JLabel lblAukData = new JLabel("Aukeratutako data:");
		lblAukData.setBounds(90, 130, 221, 25);
		lblAukData.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukData.setVerticalAlignment(SwingConstants.TOP);
		lblAukData.setFont(new Font("SansSerif", Font.BOLD, 18));
		
		JPanel panelDataIzena = new JPanel();
		panelDataIzena.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		panelDataIzena.setBounds(302, 123, 599, 39);
		
		JLabel lblDataAukera = new JLabel(SesioAldagaiak.dataAukeratuta.getDate() + "/" + (SesioAldagaiak.dataAukeratuta.getMonth()+1) + "/" + SesioAldagaiak.dataAukeratuta.getYear());
		lblDataAukera.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataAukera.setBounds(310, 130, 452, 58);
		lblDataAukera.setFont(new Font("Dialog", Font.BOLD, 21));
		
		JLabel lblPertsonaKopurua = new JLabel("Pertsona kopurua:");
		lblPertsonaKopurua.setVerticalAlignment(SwingConstants.TOP);
		lblPertsonaKopurua.setHorizontalAlignment(SwingConstants.CENTER);
		lblPertsonaKopurua.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblPertsonaKopurua.setBounds(90, 175, 221, 25);
		

		@SuppressWarnings("rawtypes")
		JComboBox comboBoxPertsonaKop = new JComboBox(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBoxPertsonaKop.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxPertsonaKop.setBounds(302, 178, 50, 22);
		
		saioaAukerak = View_metodoak.saioakAtera(SesioAldagaiak.zinemaAukera.getSaioak(), SesioAldagaiak.filmaAukera);
		ButtonGroup bg = new ButtonGroup();
		int bound = 225;
		for (int i = 0; i < saioaAukerak.size(); i++) {
			JRadioButton rdbtnSaioa = new JRadioButton(
					saioaAukerak.get(i).getAretoa().getAreto_izena() + " - " + View_metodoak.dateToString(saioaAukerak.get(i).getData()) + " - " + saioaAukerak.get(i).getPrezioa() + " €");
			rdbtnSaioa.setActionCommand(String.valueOf(i));
			rdbtnSaioa.setBounds(100, bound, 400, 54);
			rdbtnSaioa.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnSaioa.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			rdbtnSaioa.setFocusPainted(false);
			contentPane.add(rdbtnSaioa);
			bg.add(rdbtnSaioa);
			bound = bound + 50;
		}

		if(!SesioAldagaiak.logeatuta) {
        	JButton btnLogin = View_metodoak.btn_login();
        	btnLogin.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				Login login = new Login("saioaAukera");
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
    				JFrameSortu.saioaAukera();
    			}
    		});
    		contentPane.add(btnLogOut);
    		JLabel lblOngiEtorri = View_metodoak.lbl_textLog();
    		contentPane.add(lblOngiEtorri);
        }
		
		JButton btnAmaiera = View_metodoak.btn_amaiera();
		JButton btnJarraitu = View_metodoak.btn_jarraitu();
	
		contentPane.add(lblSaioLista);
		contentPane.add(lblAukFilma);
		contentPane.add(panelFilmaIzena);
		panelFilmaIzena.add(lblFilmAukera);
		contentPane.add(lblAukData);
		contentPane.add(panelDataIzena);
		panelDataIzena.add(lblDataAukera);
		contentPane.add(lblPertsonaKopurua);
		contentPane.add(comboBoxPertsonaKop);
		contentPane.add(btnAmaiera);
		contentPane.add(btnJarraitu);
		
		btnJarraitu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int aukera = 0;
				int pertsonaKop = 0;
				try {
					aukera = Integer.parseInt(bg.getSelection().getActionCommand());
					SesioAldagaiak.saioaAukera = saioaAukerak.get(aukera);
					pertsonaKop = Integer.parseInt((String) comboBoxPertsonaKop.getSelectedItem());
					Sarrera sarreraSortuta = new Sarrera(SesioAldagaiak.saioaAukera, pertsonaKop);
					SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().add(sarreraSortuta);
					SesioAldagaiak.sarreraKudeatzailea.setTicket_prezioa(SesioAldagaiak.sarreraKudeatzailea.getTicket_prezioa() + SarreraKudeatzailea.kalkulatuPrezioa(SesioAldagaiak.saioaAukera, pertsonaKop));
					JOptionPane.showMessageDialog(null, "Saioa ondo gehitu da!", "Ondo", JOptionPane.INFORMATION_MESSAGE);
					dispose();
					JFrameSortu.zinemaAukera();
				} catch (Exception e2) {
                	JOptionPane.showMessageDialog(null, "Ez duzu saiorik aukeratu! Aukeratu zerrendako saio bat.", "Errorea", JOptionPane.ERROR_MESSAGE);
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

