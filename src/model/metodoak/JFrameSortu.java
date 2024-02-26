package model.metodoak;

import javax.swing.WindowConstants;

import view.*;

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
	
	public static void loginAukera(String nondikDator) {
		Login loginAukera = new Login(nondikDator);
		loginAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		loginAukera.setVisible(true);
	}
	
	public static void erregistroAukera(String nondikDator) {
		Erregistroa erregistroAukera = new Erregistroa(nondikDator);
		erregistroAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		erregistroAukera.setVisible(true);
	}
	
	public static void laburpenaAukera() {
		Laburpena laburpenaAukera = new Laburpena();
		laburpenaAukera.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		laburpenaAukera.setVisible(true);
	}
}
	