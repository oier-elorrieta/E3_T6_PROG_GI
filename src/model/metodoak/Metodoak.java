package model.metodoak;

import javax.swing.WindowConstants;

import model.Saioa;
import view.DataAukera;
import view.FilmaAukera;
import view.SaioaAukera;
import view.ZinemaAukera;

public class Metodoak {
	
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
	
	public static double kalkulatuPrezioa(Saioa saioaAukera, int pertsonaKop) {
		double prezioGuztira = saioaAukera.getPrezioa() * pertsonaKop;
		return prezioGuztira;
	}
}
	