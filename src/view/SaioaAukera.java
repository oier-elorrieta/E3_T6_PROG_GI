package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.FilmaKudeatzailea;
import model.Saioa;
import model.Sarrera;
import model.SarreraKudeatzailea;
import model.SesioAldagaiak;
import model.Zinema;
import model.metodoak.JFrameSortu;
import model.metodoak.View_metodoak;
import model.sql.KontsultakSQL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Calendar;
import java.util.Date;


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
	public SaioaAukera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1182, 683);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Hasiera.class.getResource("/images/cine.png")));
		setTitle("Saioa aukeratu - Talde 6");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JPanel panelFilmaIzena = new JPanel();
		panelFilmaIzena.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		panelFilmaIzena.setBounds(302, 73, 599, 39);
		contentPane.add(panelFilmaIzena);
		
		JPanel panelDataIzena = new JPanel();
		panelDataIzena.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		panelDataIzena.setBounds(302, 123, 599, 39);
		contentPane.add(panelDataIzena);

		setContentPane(contentPane);

		JButton btnLogin = View_metodoak.btn_login();

		JButton btnJarraitu = View_metodoak.btn_jarraitu();

		JButton btnAmaiera = View_metodoak.btn_amaiera();

		JLabel lblSaioLista = new JLabel("SAIOEN LISTA");
		lblSaioLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaioLista.setBounds(0, 9, 1166, 58);
		lblSaioLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
		contentPane.add(lblSaioLista);

		JLabel lblAukFilma = new JLabel("Aukeratutako filma:");
		lblAukFilma.setBounds(90, 80, 221, 25);
		lblAukFilma.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukFilma.setVerticalAlignment(SwingConstants.TOP);
		lblAukFilma.setFont(new Font("SansSerif", Font.BOLD, 18));
		contentPane.add(lblAukFilma);

		JLabel lblFilmAukera = new JLabel(SesioAldagaiak.filmaAukera.getFilma_izena());
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
		int bound = 225;
		saioaAukerak = View_metodoak.saioakAtera(SesioAldagaiak.zinemaAukera.getSaioak(), SesioAldagaiak.filmaAukera);
		
		for (int i = 0; i < saioaAukerak.size(); i++) {
			JRadioButton rdbtnSaioa = new JRadioButton(
					saioaAukerak.get(i).getAretoa().getAreto_izena() + " - " + View_metodoak.dateToString(saioaAukerak.get(i).getData()) + " - " + saioaAukerak.get(i).getPrezioa() + " €");
			rdbtnSaioa.setActionCommand(String.valueOf(i));
			rdbtnSaioa.setBounds(100, bound, 400, 54);
			rdbtnSaioa.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnSaioa.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			rdbtnSaioa.setFocusPainted(false);
			contentPane.add(rdbtnSaioa);
			bound = bound + 50;
			bg.add(rdbtnSaioa);
		}

		contentPane.setLayout(null);
		contentPane.add(btnLogin);
		contentPane.add(btnAmaiera);
		contentPane.add(btnJarraitu);

		JComboBox comboBox = new JComboBox(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setBounds(302, 178, 50, 22);
		contentPane.add(comboBox);
		
		JLabel lblPertsonaKopurua = new JLabel("Pertsona kopurua:");
		lblPertsonaKopurua.setVerticalAlignment(SwingConstants.TOP);
		lblPertsonaKopurua.setHorizontalAlignment(SwingConstants.CENTER);
		lblPertsonaKopurua.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblPertsonaKopurua.setBounds(90, 175, 221, 25);
		contentPane.add(lblPertsonaKopurua);
		btnJarraitu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int aukera = 0;
				int pertsonaKop = 0;
				try {
					aukera = Integer.parseInt(bg.getSelection().getActionCommand());
					SesioAldagaiak.saioaAukera = saioaAukerak.get(aukera);
					pertsonaKop = Integer.parseInt((String) comboBox.getSelectedItem());
					Sarrera sarreraSortuta = new Sarrera(SesioAldagaiak.saioaAukera, pertsonaKop);
					SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().add(sarreraSortuta);
					SesioAldagaiak.sarreraKudeatzailea.setTicket_prezioa(SesioAldagaiak.sarreraKudeatzailea.getTicket_prezioa() + SarreraKudeatzailea.kalkulatuPrezioa(SesioAldagaiak.saioaAukera, pertsonaKop));
					JOptionPane.showMessageDialog(null, "Saioa ondo gehitu da ", "Ondo", JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception e2) {
					System.err.println("error");
				}
				dispose();
				JFrameSortu.zinemaAukeraSortu();
			}
		});

		btnAmaiera.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JFrameSortu.zinemaAukeraSortu();
			}
		});

	}
}

