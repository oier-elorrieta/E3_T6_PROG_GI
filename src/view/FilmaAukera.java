package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import model.*;
import model.metodoak.*;
import model.sql.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;

public class FilmaAukera extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FilmaAukera frame = new FilmaAukera();
                    frame.setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * @param zinemaAukera 
     */
    
    public FilmaAukera() {
        System.out.println();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 250, 1182, 683);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
        JPanel panelFilmak = new JPanel();
        panelFilmak.setBorder(new CompoundBorder());
        panelFilmak.setBounds(79, 125, 900, 410);
        contentPane.add(panelFilmak);
        panelFilmak.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panelFilmak.setLayout(new GridLayout(0, 2));
    
        
        JButton btnLogin = View_metodoak.btn_login();
        
        JButton btnJarraitu = View_metodoak.btn_jarraitu();
        
        JButton btnAmaiera = View_metodoak.btn_amaiera();
        
        JLabel lblFilmLista = new JLabel("FILMEN LISTA");
        lblFilmLista.setHorizontalAlignment(SwingConstants.CENTER);
        lblFilmLista.setBounds(310, 11, 452, 58);
        lblFilmLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
        contentPane.add(lblFilmLista);
        
        JLabel lblAukeratuFilma = new JLabel("Aukeratu filma bat:");
        lblAukeratuFilma.setBounds(79, 70, 239, 25);
        lblAukeratuFilma.setHorizontalAlignment(SwingConstants.CENTER);
        lblAukeratuFilma.setVerticalAlignment(SwingConstants.TOP);
        lblAukeratuFilma.setFont(new Font("SansSerif", Font.BOLD, 18));
        contentPane.add(lblAukeratuFilma);

        ButtonGroup bg = new ButtonGroup();
        int bound = 100;
        
        Saioa[] saioaAukerak = ZinemaAukera.zinemaAukera.getSaioak();
        for (int i = 0; i < saioaAukerak.length;i++) {
        	 if (View_metodoak.filmaDatagatikAtera(saioaAukerak[i])) {
                 JRadioButton rdbtnZinema = new JRadioButton(saioaAukerak[i].getFilma().getFilma_izena());
                 rdbtnZinema.setActionCommand(String.valueOf(i));
                 rdbtnZinema.setBounds(100, bound, 200, 54);
                 rdbtnZinema.setHorizontalAlignment(SwingConstants.CENTER);
                 rdbtnZinema.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                 rdbtnZinema.setFocusPainted(false);
                 panelFilmak.add(rdbtnZinema);
                 bound = bound + 50;
                 bg.add(rdbtnZinema);
             }
        }
        
       
        
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(btnLogin);
        contentPane.add(btnAmaiera);
        contentPane.add(btnJarraitu);
        
      
        btnAmaiera.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
    }
}