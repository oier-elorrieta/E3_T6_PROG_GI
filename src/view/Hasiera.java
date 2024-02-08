package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import java.awt.Color;

public class Hasiera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hasiera frame = new Hasiera();
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
	public Hasiera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 954, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblOngiEtorri = new JLabel("ONGI ETORRI ELORRIETA FILMS-ERA!");
		lblOngiEtorri.setBounds(0, 99, 938, 41);
		lblOngiEtorri.setHorizontalAlignment(SwingConstants.CENTER);
		lblOngiEtorri.setFont(new Font("Unispace", Font.PLAIN, 40));
		
		JLabel lblPelikulapp = new JLabel("PELIKULAPP · TALDE 6");
		lblPelikulapp.setHorizontalAlignment(SwingConstants.CENTER);
		lblPelikulapp.setBounds(0, 173, 938, 35);
		lblPelikulapp.setFont(new Font("Trebuchet MS", Font.PLAIN, 29));
		contentPane.setLayout(null);
		contentPane.add(lblOngiEtorri);
		contentPane.add(lblPelikulapp);
		
		JLabel lblKlik = new JLabel("Klik egin pantailan programa hasteko...");
		lblKlik.setHorizontalAlignment(SwingConstants.CENTER);
		lblKlik.setFont(new Font("Trebuchet MS", Font.PLAIN, 29));
		lblKlik.setBounds(0, 336, 938, 35);
		contentPane.add(lblKlik);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(10, 408, 918, 20);
		contentPane.add(progressBar);
	}
}
