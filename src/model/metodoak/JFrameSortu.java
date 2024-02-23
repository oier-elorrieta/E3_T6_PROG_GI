package model.metodoak;

import javax.swing.WindowConstants;

import model.Saioa;
import view.DataAukera;
import view.FilmaAukera;
import view.Hasiera;
import view.SaioaAukera;
import view.ZinemaAukera;

public class JFrameSortu {
	
	public static void hasieraAukera() {
		Hasiera hasieraAukera = new Hasiera();
		hasieraAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		hasieraAukera.setVisible(true);
    }
	
	public static void zinemaAukera() {
		ZinemaAukera zinemaAukera = new ZinemaAukera();
		zinemaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		zinemaAukera.setVisible(true);
    }
	
	public static void filmaAukera() {
        FilmaAukera filmaAukera = new FilmaAukera();
        filmaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        filmaAukera.setVisible(true);
    }
	
	public static void saioaAukera() {
        SaioaAukera saioaAukera = new SaioaAukera();
        saioaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        saioaAukera.setVisible(true);
    }
	
	public static void dataAukera() {
        DataAukera dataAukera = new DataAukera();
        dataAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dataAukera.setVisible(true);
    }
}
	