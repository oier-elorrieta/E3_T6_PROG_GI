package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.metodoak.JFrameSortu;
import model.metodoak.View_metodoak;
import model.sql.KontsultakSQL;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Hasiera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JProgressBar progressBar = new JProgressBar();
	
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
		setBounds(400, 250, 1182, 683);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Hasiera.class.getResource("/images/cine.png")));
		setTitle("Hasiera - Talde 6");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblOngiEtorri = new JLabel("ONGI ETORRI ELORRIETA FILMS-ERA!");
		lblOngiEtorri.setForeground(Color.BLACK);
		lblOngiEtorri.setHorizontalAlignment(SwingConstants.CENTER);
		lblOngiEtorri.setBounds(0, 90, 1165, 61);
		lblOngiEtorri.setFont(new Font("Segoe UI Historic", Font.PLAIN, 45));
		contentPane.setLayout(null);
		contentPane.add(lblOngiEtorri);
		
		JLabel lblPrograma = new JLabel("PELIKULAPP · TALDE 6");
		lblPrograma.setForeground(Color.BLACK);
		lblPrograma.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrograma.setBounds(0, 394, 1165, 36);
		lblPrograma.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		contentPane.add(lblPrograma);
		
		JLabel lblKlik = new JLabel("Klik egin pantailan programa hasteko...");
		lblKlik.setHorizontalAlignment(SwingConstants.CENTER);
		lblKlik.setForeground(Color.BLACK);
		lblKlik.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
		lblKlik.setBounds(0, 465, 1165, 38);
		contentPane.add(lblKlik);
		
		JLabel lblFilm_argazkia = new JLabel("");
		lblFilm_argazkia.setIcon(new ImageIcon(Hasiera.class.getResource("/images/logomedio.png")));
		lblFilm_argazkia.setBounds(529, 214, 99, 113);
		contentPane.add(lblFilm_argazkia);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 	try {
				 		Thread.sleep(1000);
		                dispose();
		                JFrameSortu.zinemaAukeraSortu();
		            } catch (Exception e2) {
		                System.err.println("Hasiera - ERROREA");
		            }
			}
		});
		
		
		
		
		
	}
}
