package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;

import model.metodoak.Metodoak;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;

public class DataAukera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataAukera frame = new DataAukera();
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
	public DataAukera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(823, 146, 212, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		Properties p = new Properties();
		UtilDateModel model = new UtilDateModel();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		contentPane.setLayout(null);
		
		JButton btnJarraitu = new JButton("AMAITU");
		btnJarraitu.setBounds(38, 183, 123, 23);
		contentPane.add(btnJarraitu);
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);		
		datePanel.setBounds(0, 0, 200, 180);
		contentPane.add(datePanel);
		
		btnJarraitu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
	                dispose();
	            } catch (Exception e2) {
	                System.err.println("error");
	            }
				
			}
		});

	}

}
