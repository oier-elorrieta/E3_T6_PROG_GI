package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.SesioAldagaiak;
import model.metodoak.JFrameSortu;
import model.metodoak.View_metodoak;

public class Laburpena extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Laburpena frame = new Laburpena();
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
	public Laburpena() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1182, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblLaburpena = new JLabel("LABURPENA");
		lblLaburpena.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaburpena.setBounds(0, 11, 1166, 58);
		lblLaburpena.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
		
		int bounds = 80;
		
		
		for (int i = 0; i < SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().size(); i++) {
			
			JPanel panelDatuak = new JPanel();
			panelDatuak.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
			panelDatuak.setBounds(275, bounds, 599, 150);
			contentPane.add(panelDatuak);
			panelDatuak.setLayout(null);
			
			bounds = bounds + 160;
			
			JLabel lblFilmaIzena = new JLabel("Filma: " + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getFilma().getFilma_izena());
			lblFilmaIzena.setBounds(50, 0, 500, 58);
			lblFilmaIzena.setHorizontalAlignment(SwingConstants.CENTER);
			lblFilmaIzena.setFont(new Font("Dialog", Font.BOLD, 18));
			panelDatuak.add(lblFilmaIzena);
			
			
			
			JLabel lblAretoaAtera = new JLabel("Aretoa: " + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getAretoa().getAreto_izena());
			lblAretoaAtera.setHorizontalAlignment(SwingConstants.CENTER);
			lblAretoaAtera.setBounds(50, 30, 452, 58);
			lblAretoaAtera.setFont(new Font("Dialog", Font.BOLD, 18));
			lblAretoaAtera.setVisible(true);
			panelDatuak.add(lblAretoaAtera);
		
			JLabel lblDataAtera = new JLabel("Data: "+  SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getData().getDate() + "/" + (SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getData().getMonth()+1) + "/" + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getData().getYear() + " - " + View_metodoak.dateToString(SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getSaioa().getData()));
			lblDataAtera.setHorizontalAlignment(SwingConstants.CENTER);
			lblDataAtera.setBounds(50, 60, 452, 58);
			lblDataAtera.setFont(new Font("Dialog", Font.BOLD, 18));
			panelDatuak.add(lblDataAtera);
		
			JLabel lblPetsonaKopAtera = new JLabel("Pertsona Kopurua: " + SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().get(i).getPertsonaKopurua());
			lblPetsonaKopAtera.setHorizontalAlignment(SwingConstants.CENTER);
			lblPetsonaKopAtera.setBounds(50, 90, 452, 58);
			lblPetsonaKopAtera.setFont(new Font("Dialog", Font.BOLD, 18));
			panelDatuak.add(lblPetsonaKopAtera);
			
			
		}
		
		
		
		
		
		
		if(!SesioAldagaiak.logeatuta) {
        	JButton btnLogin = View_metodoak.btn_login();
        	btnLogin.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				Login login = new Login("laburpenaAukera");
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
		
		JLabel lblPrezioTotala = new JLabel("Prezio totala: " + SesioAldagaiak.sarreraKudeatzailea.getTicket_prezioa() + "€");
		lblPrezioTotala.setBounds(943, 500, 235, 54);
		lblPrezioTotala.setFont(new Font("Segoe UI", Font.BOLD, 20));
	
		
		JButton btnJarraitu = View_metodoak.btn_jarraitu();
		
		contentPane.add(lblLaburpena);
		contentPane.add(btnJarraitu);
		contentPane.setLayout(null);
		contentPane.add(lblPrezioTotala);
	}

}
