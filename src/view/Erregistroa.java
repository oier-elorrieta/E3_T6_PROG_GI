package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.SystemColor;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

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
		setBounds(400, 250, 954, 610);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
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
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JRadioButton rdbtnGizona = new JRadioButton("Gizona");
		rdbtnGizona.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		rdbtnGizona.setForeground(Color.BLACK);
		rdbtnGizona.setBackground(Color.WHITE);
		
		JRadioButton rdbtnEmakumea = new JRadioButton("Emakumea");
		rdbtnEmakumea.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		rdbtnEmakumea.setForeground(Color.BLACK);
		rdbtnEmakumea.setBackground(Color.WHITE);
		
		JLabel lblErregistroa_Header = new JLabel("ERREGISTROA");
		lblErregistroa_Header.setHorizontalAlignment(SwingConstants.CENTER);
		lblErregistroa_Header.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIzena, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
									.addGap(1))
								.addComponent(lblAbizenak, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
								.addComponent(lblNAN, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
								.addComponent(lblPasahitza, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
								.addComponent(lblSexua, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(6)
									.addComponent(rdbtnGizona)
									.addGap(13)
									.addComponent(rdbtnEmakumea, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(16)
									.addComponent(btnErregistratu, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(156)
							.addComponent(lblErregistroa_Header, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblErregistroa_Header)
					.addGap(31)
					.addComponent(lblIzena, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblAbizenak, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblNAN, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblPasahitza, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblSexua, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnGizona)
						.addComponent(rdbtnEmakumea))
					.addGap(67)
					.addComponent(btnErregistratu))
		);
		
		JLabel lblEloFilms_image = new JLabel("");
		//lblEloFilms_image.setIcon(new ImageIcon(Erregistroa.class.getResource("/images/aretoa.png")));
		lblEloFilms_image.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblEloFilms_image, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblEloFilms_image, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
