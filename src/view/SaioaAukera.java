package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.FilmaKudeatzailea;
import model.Saioa;
import model.metodoak.View_metodoak;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SaioaAukera extends JFrame {

    private static final long serialVersionUID = 1L;
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
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        JPanel panelFilmaIzena = new JPanel();
        panelFilmaIzena.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
        panelFilmaIzena.setBounds(302, 78, 599, 33);
        contentPane.add(panelFilmaIzena);
        
        setContentPane(contentPane);
        
        JButton btnLogin = View_metodoak.btn_login();
        
        JButton btnJarraitu = View_metodoak.btn_jarraitu();
        
        JButton btnAmaiera = View_metodoak.btn_amaiera();
        
        JLabel lblSaioLista = new JLabel("SAIOEN LISTA");
        lblSaioLista.setHorizontalAlignment(SwingConstants.CENTER);
        lblSaioLista.setBounds(310, 9, 452, 58);
        lblSaioLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
        contentPane.add(lblSaioLista);
        
        JLabel lblAukFilma = new JLabel("Aukeratutako filma:");
        lblAukFilma.setBounds(90, 80, 221, 25);
        lblAukFilma.setHorizontalAlignment(SwingConstants.CENTER);
        lblAukFilma.setVerticalAlignment(SwingConstants.TOP);
        lblAukFilma.setFont(new Font("SansSerif", Font.BOLD, 18));
        contentPane.add(lblAukFilma);
        
        JLabel lblFilmAukera = new JLabel("PRUEBA");
        lblFilmAukera.setHorizontalAlignment(SwingConstants.CENTER);
        lblFilmAukera.setBounds(310, 9, 452, 58);
        lblFilmAukera.setFont(new Font("Constantia", Font.PLAIN, 22));
        panelFilmaIzena.add(lblFilmAukera);
        
        ButtonGroup bg = new ButtonGroup();
        int bound = 100;
        
        for (int i = 0; i < FilmaAukera.saioaAukerak.length;i++) {
             if (View_metodoak.filmaDatagatikAtera(FilmaAukera.saioaAukerak[i])) {
            	 if (FilmaAukera.filmaAukera.equals(FilmaAukera.saioaAukerak[i].getFilma())) {
            		 JRadioButton rdbtnSaioa = new JRadioButton(FilmaAukera.saioaAukerak[i].getAretoa().getAreto_izena() + " - " + FilmaAukera.saioaAukerak[i].getPrezioa() + " €");
                     rdbtnSaioa.setActionCommand(String.valueOf(i));
                     rdbtnSaioa.setBounds(100, bound, 200, 54);
                     rdbtnSaioa.setHorizontalAlignment(SwingConstants.CENTER);
                     rdbtnSaioa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                     rdbtnSaioa.setFocusPainted(false);
                     contentPane.add(rdbtnSaioa);
                     bound = bound + 50;
                     bg.add(rdbtnSaioa);
            	 }
             }
        }
        
        contentPane.setLayout(null);
        contentPane.add(btnLogin);
        contentPane.add(btnAmaiera);
        contentPane.add(btnJarraitu);
        
        btnAmaiera.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        		View_metodoak.zinemaAukeraSortu();
        	}
        });
        
    }

}