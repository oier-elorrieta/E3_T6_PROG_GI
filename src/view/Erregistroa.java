package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
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
import javax.swing.JTextArea;
import java.awt.Choice;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class Erregistroa extends JFrame {

	private static final long serialVersionUID = 1L;
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
					Erregistroa frame = new Erregistroa();
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
	public Erregistroa() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1182, 683);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Hasiera.class.getResource("/images/cine.png")));
		setTitle("Erregistroa - Talde 6");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnErregistratu = new JButton("Erregistratu");
		btnErregistratu.setForeground(SystemColor.text);
		btnErregistratu.setBackground(SystemColor.desktop);
		btnErregistratu.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		
		JLabel lblIzena = new JLabel("IZENA");
		lblIzena.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		
		JLabel lblAbizenak = new JLabel("ABIZENAK");
		lblAbizenak.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		
		JLabel lblNAN = new JLabel("NAN");
		lblNAN.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		
		JLabel lblPasahitza = new JLabel("PASAHITZA");
		lblPasahitza.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		
		JLabel lblSexua = new JLabel("SEXUA (Aukeratu bat)");
		lblSexua.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		
		txtIzena = new JTextField();
		txtIzena.setToolTipText("Sartu izen bat...");
		txtIzena.setColumns(10);
		txtIzena.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		txtAbizenak = new JTextField();
		txtAbizenak.setToolTipText("Sartu abizenak...");
		txtAbizenak.setColumns(10);
		txtAbizenak.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		txtNAN = new JTextField();
		txtNAN.setToolTipText("Sartu NAN bat...");
		txtNAN.setColumns(10);
		txtNAN.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Sartu pasahitza...");
		passwordField.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		JRadioButton rdbtnGizona = new JRadioButton("Gizona");
		rdbtnGizona.setToolTipText("Gizona");
		rdbtnGizona.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		rdbtnGizona.setForeground(Color.BLACK);
		rdbtnGizona.setBackground(Color.WHITE);
		
		JRadioButton rdbtnEmakumea = new JRadioButton("Emakumea");
		rdbtnEmakumea.setToolTipText("Emakumea");
		rdbtnEmakumea.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		rdbtnEmakumea.setForeground(Color.BLACK);
		rdbtnEmakumea.setBackground(Color.WHITE);
		
		JLabel lblErregistroa_Header = new JLabel("ERREGISTROA");
		lblErregistroa_Header.setHorizontalAlignment(SwingConstants.CENTER);
		lblErregistroa_Header.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		
		JLabel lblPasahitza_1 = new JLabel("ERREPIKATU PASAHITZA");
		lblPasahitza_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		
		passwordField_errepikatu = new JPasswordField();
		passwordField_errepikatu.setToolTipText("Sartu pasahitza berriz...");
		passwordField_errepikatu.setBorder(new LineBorder(Color.GRAY, 1, true));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(226, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(208)
							.addComponent(lblErregistroa_Header, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblIzena, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtIzena, GroupLayout.PREFERRED_SIZE, 699, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAbizenak, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAbizenak, GroupLayout.PREFERRED_SIZE, 699, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNAN, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNAN, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPasahitza, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 546, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPasahitza_1, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField_errepikatu, GroupLayout.PREFERRED_SIZE, 546, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSexua, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(rdbtnGizona)
							.addGap(13)
							.addComponent(rdbtnEmakumea, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(163)
							.addComponent(btnErregistratu, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
					.addGap(143))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblErregistroa_Header)
					.addGap(31)
					.addComponent(lblIzena, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(txtIzena, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblAbizenak, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(txtAbizenak, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblNAN, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(txtNAN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblPasahitza, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblPasahitza_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(passwordField_errepikatu, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(lblSexua, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnGizona)
						.addComponent(rdbtnEmakumea))
					.addGap(30)
					.addComponent(btnErregistratu)
					.addContainerGap(52, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
