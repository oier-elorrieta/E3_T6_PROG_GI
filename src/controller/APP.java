package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.*;
import model.sql.ConexioaSQL;
import view.*;

public class APP {

	public static void main(String[] args) {
		ConexioaSQL.conexioaIrekiEtaItxi();
		
		ZinemaAukera zinemaAukera = new ZinemaAukera();
		
		zinemaAukera.setVisible(true);
	}
}
	