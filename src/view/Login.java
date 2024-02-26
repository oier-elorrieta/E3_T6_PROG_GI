package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

import model.*;
import model.metodoak.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String String = null;
	private JPanel contentPane;
	private JTextField txtNAN;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login(String);
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
	public Login(String nondikDator) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 906, 594);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Hasiera.class.getResource("/images/cine.png")));
		setTitle("Login - Talde 6");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin_Header = new JLabel("LOGIN");
		lblLogin_Header.setBounds(198, 11, 452, 58);
		lblLogin_Header.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin_Header.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
		
		JLabel lblNAN = new JLabel("NAN");
		lblNAN.setBounds(210, 165, 204, 23);
		lblNAN.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		
		txtNAN = new JTextField();
		txtNAN.setBounds(210, 191, 433, 32);
		txtNAN.setColumns(10);
		
		JLabel lblPasahitza = new JLabel("PASAHITZA");
		lblPasahitza.setBounds(210, 254, 204, 23);
		lblPasahitza.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(210, 281, 433, 33);
		
		JButton btnAtzera = new JButton("Atzera");
		btnAtzera.setBounds(342, 338, 148, 29);
		btnAtzera.setForeground(SystemColor.text);
		btnAtzera.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		btnAtzera.setBackground(SystemColor.desktop);
		
		JButton btnErregistratu = new JButton("Erregistratu");
		btnErregistratu.setBounds(342, 380, 148, 29);
		btnErregistratu.setForeground(SystemColor.text);
		btnErregistratu.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		btnErregistratu.setBackground(SystemColor.desktop);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(342, 422, 148, 29);
		btnLogin.setForeground(SystemColor.text);
		btnLogin.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		btnLogin.setBackground(SystemColor.desktop);
		
		contentPane.add(lblLogin_Header);
		contentPane.add(lblNAN);
		contentPane.add(txtNAN);
		contentPane.add(lblPasahitza);
		contentPane.add(passwordField);
		contentPane.add(btnAtzera);
		contentPane.add(btnErregistratu);
		contentPane.add(btnLogin);

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
				dispose();		
				JFrameSortu.erregistroAukera(nondikDator);
			}
		});
		
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					String bezeroNAN = txtNAN.getText();
					@SuppressWarnings("deprecation")
					String bezeroPwd = passwordField.getText();
					SesioAldagaiak.logeatuta = BezeroKudeatzailea.komprobatuPasahitza(bezeroNAN, bezeroPwd);
					if (SesioAldagaiak.logeatuta) {
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
						
					} else {
						JOptionPane.showMessageDialog(null, "NAN-a eta pasahitza ez dira egokiak.", "Errorea", JOptionPane.ERROR_MESSAGE);
					}
			}
		});
	}
}
