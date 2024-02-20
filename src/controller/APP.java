package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.WindowConstants;

import model.*;
import model.metodoak.Metodoak;
import model.sql.ConexioaSQL;
import view.*;

public class APP {

	public static ZinemaAukera zinemaAukera;
	
	public static void main(String[] args) {
		ConexioaSQL.conexioaIrekiEtaItxi();
		Metodoak.hasieraAukeraSortu();
	
	}
}
	