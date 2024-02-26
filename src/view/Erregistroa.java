package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import org.mindrot.jbcrypt.BCrypt;

import model.Bezeroa;
import model.SesioAldagaiak;
import model.metodoak.JFrameSortu;
import model.sql.ConexioaSQL;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Choice;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class Erregistroa extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String String = null;
	private static final int nanLuzeraBeti = 9;
	private JPanel contentPane;
	private JTextField txtIzena;
	private JTextField txtAbizenak;
	private JTextField txtNAN;
	private JPasswordField passwordField;
	private JPasswordField passwordField_errepikatu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Erregistroa frame = new Erregistroa(String);
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
	public Erregistroa(String nondikDator) {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1182, 683);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Hasiera.class.getResource("/images/cine.png")));
		setTitle("Erregistroa - Talde 6");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblErregistroa_Header = new JLabel("ERREGISTROA");
		lblErregistroa_Header.setBounds(527, 16, 190, 27);
		lblErregistroa_Header.setHorizontalAlignment(SwingConstants.CENTER);
		lblErregistroa_Header.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		

		JLabel lblIzena = new JLabel("IZENA");
		lblIzena.setBounds(319, 74, 204, 23);
		lblIzena.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		txtIzena = new JTextField();
		txtIzena.setBounds(319, 103, 699, 32);
		txtIzena.setToolTipText("Sartu izen bat...");
		txtIzena.setColumns(10);
		txtIzena.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		JLabel lblAbizenak = new JLabel("ABIZENAK");
		lblAbizenak.setBounds(319, 146, 204, 23);
		lblAbizenak.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		txtAbizenak = new JTextField();
		txtAbizenak.setBounds(319, 175, 699, 32);
		txtAbizenak.setToolTipText("Sartu abizenak...");
		txtAbizenak.setColumns(10);
		txtAbizenak.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		JLabel lblNAN = new JLabel("NAN");
		lblNAN.setBounds(319, 213, 204, 23);
		lblNAN.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		txtNAN = new JTextField();
		txtNAN.setBounds(319, 239, 304, 32);
		txtNAN.setToolTipText("Sartu NAN bat...");
		txtNAN.setColumns(10);
		txtNAN.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		JLabel lblPasahitza = new JLabel("PASAHITZA");
		lblPasahitza.setBounds(319, 282, 204, 23);
		lblPasahitza.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		passwordField = new JPasswordField();
		passwordField.setBounds(319, 309, 546, 33);
		passwordField.setToolTipText("Sartu pasahitza...");
		passwordField.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		JLabel lblPasahitza_1 = new JLabel("ERREPIKATU PASAHITZA");
		lblPasahitza_1.setBounds(319, 360, 296, 23);
		lblPasahitza_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		passwordField_errepikatu = new JPasswordField();
		passwordField_errepikatu.setBounds(319, 389, 546, 33);
		passwordField_errepikatu.setToolTipText("Sartu pasahitza berriz...");
		passwordField_errepikatu.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		JLabel lblSexua = new JLabel("SEXUA (Aukeratu bat)");
		lblSexua.setBounds(319, 441, 200, 23);
		lblSexua.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton rdbtnGizona = new JRadioButton("Gizona");
		rdbtnGizona.setActionCommand("g");
		rdbtnGizona.setBounds(325, 471, 69, 29);
		rdbtnGizona.setToolTipText("Gizona");
		rdbtnGizona.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		rdbtnGizona.setForeground(Color.BLACK);
		rdbtnGizona.setBackground(Color.WHITE);
		bg.add(rdbtnGizona);
		
		JRadioButton rdbtnEmakumea = new JRadioButton("Emakumea");
		rdbtnEmakumea.setActionCommand("e");
		rdbtnEmakumea.setBounds(407, 471, 150, 29);
		rdbtnEmakumea.setToolTipText("Emakumea");
		rdbtnEmakumea.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		rdbtnEmakumea.setForeground(Color.BLACK);
		rdbtnEmakumea.setBackground(Color.WHITE);
		bg.add(rdbtnEmakumea);

		JButton btnErregistratu = new JButton("Erregistratu");
		rdbtnEmakumea.setActionCommand("g");
		btnErregistratu.setBounds(482, 530, 136, 29);
		btnErregistratu.setForeground(SystemColor.text);
		btnErregistratu.setBackground(SystemColor.desktop);
		btnErregistratu.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		
		JButton btnAtzera = new JButton("Atzera");
		btnAtzera.setBounds(319, 530, 136, 29);
		btnAtzera.setForeground(SystemColor.text);
		btnAtzera.setBackground(SystemColor.desktop);
		btnAtzera.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		
		contentPane.setLayout(null);
		contentPane.add(lblErregistroa_Header);
		contentPane.add(lblIzena);
		contentPane.add(txtIzena);
		contentPane.add(lblAbizenak);
		contentPane.add(txtAbizenak);
		contentPane.add(lblNAN);
		contentPane.add(txtNAN);
		contentPane.add(lblPasahitza);
		contentPane.add(passwordField);
		contentPane.add(lblPasahitza_1);
		contentPane.add(passwordField_errepikatu);
		contentPane.add(lblSexua);
		contentPane.add(rdbtnGizona);
		contentPane.add(rdbtnEmakumea);
		contentPane.add(btnErregistratu);
		contentPane.add(btnAtzera);
		
		btnAtzera.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				switch (nondikDator) {
				case "zinemaAukera": 
					JFrameSortu.zinemaAukera();
				break;
				case "saioaAukera":
					JFrameSortu.saioaAukera();
				break;
				case "filmaAukera": 
					JFrameSortu.filmaAukera();
				break;
				case "dataAukera":
					JFrameSortu.dataAukera();
				break;
				case "laburpenaAukera":
					JFrameSortu.laburpenaAukera();
				break;
				}
			}
		});
		
		btnErregistratu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nanAukeratuta = txtNAN.getText();
				String txtError = "Ez duzu hurrengo datuak ondo idatzi:";
				boolean erroreErregistro = false;
				boolean erroreNAN = false;
				
				char[] pasahitzaCharArray = passwordField.getPassword();
				char[] pasahitzaErrepikatutaCharArray = passwordField_errepikatu.getPassword();
				String pasahitzaString = "";
				String pasahitzaErrepikatutaString = "";
				for (int i = 0; i < pasahitzaCharArray.length; i++) {
					pasahitzaString = pasahitzaString + pasahitzaCharArray[i];
				}
				for (int i = 0; i < pasahitzaErrepikatutaCharArray.length; i++) {
					pasahitzaErrepikatutaString = pasahitzaErrepikatutaString + pasahitzaErrepikatutaCharArray[i];
				}

				int nanLuzera = nanAukeratuta.length();
				if (nanLuzera != nanLuzeraBeti) {
					erroreNAN = true;
					JOptionPane.showMessageDialog(null, "Sartutako NAN-a ez dago ondo.", "Errorea",JOptionPane.ERROR_MESSAGE);
				} else {
					if(!Bezeroa.nanKomprobatu(nanAukeratuta)) {
						erroreNAN = true;
						JOptionPane.showMessageDialog(null, "Sartutako NAN-a ez dago ondo.", "Errorea",JOptionPane.ERROR_MESSAGE);
					}else {
						for (int i = 0; i < SesioAldagaiak.bezeroaKudeatzailea.getBezeroaList().size(); i++) {
							if (nanAukeratuta.equals(SesioAldagaiak.bezeroaKudeatzailea.getBezeroaList().get(i).getBezeroa_NAN())) {
								erroreNAN = true;
								JOptionPane.showMessageDialog(null, "Badago kontu bat sortuta NAN horrekin", "Errorea",JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				}
				
				if (!erroreNAN) {
					if (txtIzena.getText().isEmpty()) {
						erroreErregistro = true;
						txtError = txtError + " Izena, ";
					}
					if (txtAbizenak.getText().isEmpty()) {
						erroreErregistro = true;
						txtError = txtError + " Abizenak, ";
					}
					
					if (pasahitzaString.length() != 0) {
						if (pasahitzaErrepikatutaString.length() != 0) {
							if(!pasahitzaString.equals(pasahitzaErrepikatutaString)) {
								erroreErregistro = true;
								txtError = txtError + " Pasahitzak ez dute kointziditzen, ";
							}
						} else {
							erroreErregistro = true;
							txtError = txtError + " Pasahitza errepikatuta, ";
						}
					} else {
						erroreErregistro = true;
						txtError = txtError + " Pasahitza, ";
					}
					
					if (bg.getSelection() == null) {
						erroreErregistro = true;
						txtError = txtError + " Sexua";
					}
					
					if (erroreErregistro) {
						JOptionPane.showMessageDialog(null, txtError, "Errorea", JOptionPane.ERROR_MESSAGE);
					} else {
						System.out.println();
						String hashedPassword = BCrypt.hashpw(pasahitzaString, BCrypt.gensalt());
						SesioAldagaiak.bezeroIzena = new Bezeroa(nanAukeratuta, txtIzena.getText(), txtAbizenak.getText(), hashedPassword, bg.getSelection().getActionCommand().charAt(0));
						SesioAldagaiak.bezeroaKudeatzailea.getBezeroaList().add(SesioAldagaiak.bezeroIzena);
						ConexioaSQL.BezeroaSartuKonexioaIreki();
						SesioAldagaiak.logeatuta = true;
						JOptionPane.showMessageDialog(null, "Ondo erregistratu zara!", "Errorea", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						switch (nondikDator) {
						case "zinemaAukera": 
							JFrameSortu.zinemaAukera();
						break;
						case "saioaAukera":
							JFrameSortu.saioaAukera();
						break;
						case "filmaAukera": 
							JFrameSortu.filmaAukera();
						break;
						case "dataAukera":
							JFrameSortu.dataAukera();
						break;
						case "laburpenaAukera":
							JFrameSortu.laburpenaAukera();
						break;
						}
					}
				}	
			}
		});
	}
}
