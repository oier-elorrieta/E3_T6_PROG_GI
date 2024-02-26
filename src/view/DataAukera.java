package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

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
import model.metodoak.JFrameSortu;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Hasiera.class.getResource("/images/cine.png")));
		setTitle("Data aukeratu - Talde 6");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbldataAukeratu = new JLabel("DATA AUKERATU");
		lbldataAukeratu.setHorizontalAlignment(SwingConstants.CENTER);
		lbldataAukeratu.setBounds(0, 9, 1166, 58);
		lbldataAukeratu.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
		
		JLabel lblAukZinema = new JLabel("Aukeratutako zinema:");
		lblAukZinema.setBounds(83, 78, 221, 25);
		lblAukZinema.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukZinema.setVerticalAlignment(SwingConstants.TOP);
		lblAukZinema.setFont(new Font("SansSerif", Font.BOLD, 18));
		
		JPanel panelFilmaIzena = new JPanel();
		panelFilmaIzena.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		panelFilmaIzena.setBounds(302, 73, 599, 39);
		
		JLabel lblZinemaAukera = new JLabel(SesioAldagaiak.zinemaAukera.getZinema_izena());
		lblZinemaAukera.setHorizontalAlignment(SwingConstants.CENTER);
		lblZinemaAukera.setBounds(310, 9, 452, 58);
		lblZinemaAukera.setFont(new Font("Dialog", Font.BOLD, 21));
		
		JLabel lblAukeratuDataBat = new JLabel("AUKERATU DATA BAT");
		lblAukeratuDataBat.setVerticalAlignment(SwingConstants.TOP);
		lblAukeratuDataBat.setHorizontalAlignment(SwingConstants.CENTER);
		lblAukeratuDataBat.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblAukeratuDataBat.setBounds(399, 156, 324, 32);
		
		Properties p = new Properties();
		UtilDateModel model = new UtilDateModel();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);		
		datePanel.setBounds(399, 199, 324, 224);

		  if(!SesioAldagaiak.logeatuta) {
	        	JButton btnLogin = View_metodoak.btn_login();
	        	btnLogin.addMouseListener(new MouseAdapter() {
	    			@Override
	    			public void mouseClicked(MouseEvent e) {
	    				Login login = new Login("dataAukera");
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
	    				JFrameSortu.dataAukera();
	    			}
	    		});
	    		JLabel lblOngiEtorri = View_metodoak.lbl_textLog();
	    		contentPane.add(btnLogOut);
	    		contentPane.add(lblOngiEtorri);
	        }

		JButton btnAmaiera = View_metodoak.btn_amaiera();
		JButton btnJarraitu = View_metodoak.btn_jarraitu();

		contentPane.add(lbldataAukeratu);
		contentPane.add(lblAukZinema);
		contentPane.add(panelFilmaIzena);
		panelFilmaIzena.add(lblZinemaAukera);
		contentPane.add(lblAukeratuDataBat);
		contentPane.add(datePanel);
		contentPane.add(btnAmaiera);
		contentPane.add(btnJarraitu);
		
		btnJarraitu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {	
					SesioAldagaiak.dataAukeratuta.setDate(datePanel.getModel().getDay());
					SesioAldagaiak.dataAukeratuta.setMonth(datePanel.getModel().getMonth());
					SesioAldagaiak.dataAukeratuta.setYear(datePanel.getModel().getYear());
				
					Date dataGaur = new Date();
					if(dataGaur.getDate() != datePanel.getModel().getDay() 
						|| dataGaur.getMonth() != datePanel.getModel().getMonth() 
						|| dataGaur.getYear()+1900 != datePanel.getModel().getYear()) {
						SesioAldagaiak.dataAukeratuta.setHours(0);
						SesioAldagaiak.dataAukeratuta.setMinutes(0);
						SesioAldagaiak.dataAukeratuta.setSeconds(0);
					}								
					dispose();
					JFrameSortu.filmaAukera();
				} catch (Exception e2) {
                	JOptionPane.showMessageDialog(null, "Ez duzu datarik aukeratu! Aukeratu data bat.", "Errorea", JOptionPane.ERROR_MESSAGE);
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

