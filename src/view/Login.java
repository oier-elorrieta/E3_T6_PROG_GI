package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.util.ArrayList;

import model.*;
import model.metodoak.*;
import model.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
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
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 906, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
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
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Bezeroa> bezeroak = new ArrayList<Bezeroa>();
				
				bezeroak = KontsultakSQL.bezeroaKudeatzailea.getBezeroaList();
				for (int i = 0; i < bezeroak.size(); i++) {
					if (!bezeroak.get(i).getBezeroa_NAN().equals(txtNAN.getText())) {
						JOptionPane.showMessageDialog(null, "Erabiltzailea edo pasahitza txarto dago.", "Errorea", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnLogin.setBounds(342, 422, 148, 29);
		btnLogin.setForeground(SystemColor.text);
		btnLogin.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		btnLogin.setBackground(SystemColor.desktop);
		
		contentPane.setLayout(null);
		contentPane.add(lblNAN);
		contentPane.add(txtNAN);
		contentPane.add(lblPasahitza);
		contentPane.add(passwordField);
		contentPane.add(lblLogin_Header);
		contentPane.add(btnLogin);
	}
}
