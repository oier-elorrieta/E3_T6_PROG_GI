package model.metodoak;

import javax.swing.WindowConstants;

import model.Saioa;
import view.DataAukera;
import view.FilmaAukera;
import view.Hasiera;
import view.SaioaAukera;
import view.ZinemaAukera;

public class JFrameSortu {
	
	public static void hasieraAukeraSortu() {
		Hasiera hasieraAukera = new Hasiera();
		hasieraAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		hasieraAukera.setVisible(true);
    }
	
	public static void zinemaAukeraSortu() {
		ZinemaAukera zinemaAukera = new ZinemaAukera();
		zinemaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		zinemaAukera.setVisible(true);
    }
	
	public static void filmaAukeraSortu() {
        FilmaAukera filmaAukera = new FilmaAukera();
        filmaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        filmaAukera.setVisible(true);
    }
	
	public static void saioaAukeraSortu() {
        SaioaAukera saioaAukera = new SaioaAukera();
        saioaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        saioaAukera.setVisible(true);
    }
	
	public static void dataAukeraSortu() {
        DataAukera dataAukera = new DataAukera();
        dataAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dataAukera.setVisible(true);
    }
}
	