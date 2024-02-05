package model;

import java.util.Arrays;
import java.util.Objects;

public class Aretoa {
	private String areto_izena;
	private Saioa[] SaioList = new Saioa[20];
	
	
	public Aretoa() {
	
	}
	
	public Aretoa(String areto_izena, Saioa[] saioList) {
		
		this.areto_izena = areto_izena;
		SaioList = saioList;
	}
	
	public String getAreto_izena() {
		return areto_izena;
	}
	public void setAreto_izena(String areto_izena) {
		this.areto_izena = areto_izena;
	}
	public Saioa[] getSaioList() {
		return SaioList;
	}
	public void setSaioList(Saioa[] saioList) {
		SaioList = saioList;
	}

	@Override
	public String toString() {
		return "Aretoa [areto_izena=" + areto_izena + ", SaioList=" + Arrays.toString(SaioList) + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aretoa other = (Aretoa) obj;
		return Arrays.equals(SaioList, other.SaioList) && Objects.equals(areto_izena, other.areto_izena);
	}
	
	
	
}
