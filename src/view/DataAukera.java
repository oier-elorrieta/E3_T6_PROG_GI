package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;

import model.Sarrera;
import model.SesioAldagaiak;
import model.metodoak.Metodoak;
import model.metodoak.View_metodoak;
import model.sql.KontsultakSQL;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.Properties;

public class DataAukera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataAukera frame = new DataAukera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DataAukera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1182, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JPanel panelFilmaIzena = new JPanel();
		panelFilmaIzena.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		panelFilmaIzena.setBounds(302, 73, 599, 39);
		contentPane.add(panelFilmaIzena);

		setContentPane(contentPane);

		JButton btnLogin = View_metodoak.btn_login();

		JButton btnJarraitu = View_metodoak.btn_jarraitu();

		JButton btnAmaiera = View_metodoak.btn_amaiera();

		JLabel lblSaioLista = new JLabel("DATA AUKERATU");
		lblSaioLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaioLista.setBounds(310, 9, 452, 58);
		lblSaioLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
		contentPane.add(lblSaioLista);

		JLabel lblAukFilma = new JLabel("Aukeratutako zinema:");
		lblAukFilma.setBounds(83, 78, 221, 25);
		lblAukFilma.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukFilma.setVerticalAlignment(SwingConstants.TOP);
		lblAukFilma.setFont(new Font("SansSerif", Font.BOLD, 18));
		contentPane.add(lblAukFilma);

		JLabel lblFilmAukera = new JLabel(SesioAldagaiak.zinemaAukera.getZinema_izena());
		lblFilmAukera.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmAukera.setBounds(310, 9, 452, 58);
		lblFilmAukera.setFont(new Font("Constantia", Font.PLAIN, 22));
		panelFilmaIzena.add(lblFilmAukera);

		Properties p = new Properties();
		UtilDateModel model = new UtilDateModel();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);		
		datePanel.setBounds(399, 199, 324, 224);
		contentPane.add(datePanel);

		contentPane.setLayout(null);
		contentPane.add(btnLogin);
		contentPane.add(btnAmaiera);
		contentPane.add(btnJarraitu);
		
		JLabel lblAukeratuDataBat = new JLabel("AUKERATU DATA BAT");
		lblAukeratuDataBat.setVerticalAlignment(SwingConstants.TOP);
		lblAukeratuDataBat.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukeratuDataBat.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblAukeratuDataBat.setBounds(399, 173, 324, 25);
		contentPane.add(lblAukeratuDataBat);
		btnJarraitu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {	
					SesioAldagaiak.dataAukeratuta.setDate(datePanel.getModel().getDay());
					SesioAldagaiak.dataAukeratuta.setMonth(datePanel.getModel().getMonth());
					SesioAldagaiak.dataAukeratuta.setYear(datePanel.getModel().getYear());
					dispose();
					Metodoak.filmaAukeraSortu();
				} catch (Exception e2) {
					System.err.println("error");
				}				
			}
		});

		btnAmaiera.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				View_metodoak.zinemaAukeraSortu();
			}
		});

	}

}
