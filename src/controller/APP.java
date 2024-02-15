package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.WindowConstants;

import model.*;
import model.sql.ConexioaSQL;
import view.*;

public class APP {

	public static ZinemaAukera zinemaAukera;
	
	public static void main(String[] args) {
		ConexioaSQL.conexioaIrekiEtaItxi();
		
		ZinemaAukera zinemaAukera = new ZinemaAukera();
		zinemaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		zinemaAukera.setVisible(true);
		
	}
}
	