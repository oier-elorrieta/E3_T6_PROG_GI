package view;

import javax.swing.border.EmptyBorder;

import controller.APP;
import model.*;
import model.metodoak.*;
import model.sql.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class ZinemaAukera extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ZinemaAukera frame = new ZinemaAukera();
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
    public ZinemaAukera() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 250, 1182, 683);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Hasiera.class.getResource("/images/cine.png")));
		setTitle("Zinema aukeratu - Talde 6");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblZinemaLista = new JLabel("ZINEMA ZERRENDA");
        lblZinemaLista.setFont(new Font("Source Sans Pro Black", Font.BOLD, 45));
        lblZinemaLista.setBounds(0, 11, 1166, 58);
        lblZinemaLista.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblAukeratu = new JLabel("Aukeratu zinema bat:");
        lblAukeratu.setBounds(80, 80, 239, 25);
        lblAukeratu.setHorizontalAlignment(SwingConstants.CENTER);
        lblAukeratu.setVerticalAlignment(SwingConstants.TOP);
        lblAukeratu.setFont(new Font("SansSerif", Font.BOLD, 18));
        

        ButtonGroup bg = new ButtonGroup();
        int bound = 120;
        for (int i = 0; i < KontsultakSQL.kont_zinemak; i++) {
            JRadioButton rdbtnZinema = new JRadioButton(SesioAldagaiak.zinemaKudeatzailea.getZinemaList()[i].getZinema_izena() + " → " + SesioAldagaiak.zinemaKudeatzailea.getZinemaList()[i].getZinema_helbidea());
            rdbtnZinema.setActionCommand(String.valueOf(i));
            rdbtnZinema.setBounds(110, bound, 700, 54);
            rdbtnZinema.setHorizontalAlignment(SwingConstants.LEFT);
            rdbtnZinema.setFont(new Font("Segoe UI", Font.PLAIN, 25));
            rdbtnZinema.setFocusPainted(false);
            contentPane.setLayout(null);
            contentPane.add(rdbtnZinema);
            bg.add(rdbtnZinema);
            bound = bound + 70;
        }
        
        if(!SesioAldagaiak.logeatuta) {
        	JButton btnLogin = View_metodoak.btn_login();
        	btnLogin.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				JFrameSortu.loginAukera("zinemaAukera");
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
    				JFrameSortu.zinemaAukera();
    			}
    		});
    		JLabel lblOngiEtorri = View_metodoak.lbl_textLog();
    		contentPane.add(btnLogOut);
    		contentPane.add(lblOngiEtorri);
        }
        
        JButton btnAmaiera = View_metodoak.btn_amaiera();
        JButton btnJarraitu = View_metodoak.btn_jarraitu();
     
        contentPane.add(lblZinemaLista);
        contentPane.add(lblAukeratu);
        contentPane.add(btnAmaiera);
        contentPane.add(btnJarraitu);
                
        btnAmaiera.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (SesioAldagaiak.sarreraKudeatzailea.getSarreraLista().size() != 0) {
        			SarreraKudeatzailea.kalkulatuDeskontua();
        			dispose();
            		JFrameSortu.laburpenaAukera();
        		} else {
        			JOptionPane.showMessageDialog(null, "Ez duzu saiorik hartu", "Errorea", JOptionPane.ERROR_MESSAGE);
        		}
        		
        	}
        });
        
        btnJarraitu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int aukera = 0;
                try {
                	aukera = Integer.parseInt(bg.getSelection().getActionCommand());
                    SesioAldagaiak.zinemaAukera =  SesioAldagaiak.zinemaKudeatzailea.getZinemaList()[aukera];                   
                    dispose();
                    JFrameSortu.dataAukera();
                } catch (Exception e2) {
                	JOptionPane.showMessageDialog(null, "Ez duzu zinemarik aukeratu! Aukeratu zerrendako zinema bat.", "Errorea", JOptionPane.ERROR_MESSAGE);
                }    
            }
        });
    }
}