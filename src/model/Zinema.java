package model;

import java.util.Arrays;
import java.util.Objects;

public class Zinema {
	private String zinema_izena;
	private String zinema_helbidea;
	private int zinema_telefonoa;
	private Aretoa[] zinema_aretoak = new Aretoa[20];
	private Saioa[] saioak = new Saioa[100];
	
	public Zinema() {
		
	}
	
	public Zinema(String zinema_izena, String zinema_helbidea, int zinema_telefonoa, Aretoa[] zinema_aretoak,
			Saioa[] saioak) {
		this.zinema_izena = zinema_izena;
		this.zinema_helbidea = zinema_helbidea;
		this.zinema_telefonoa = zinema_telefonoa;
		this.zinema_aretoak = zinema_aretoak;
		this.saioak = saioak;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zinema other = (Zinema) obj;
		return Arrays.equals(saioak, other.saioak) && Arrays.equals(zinema_aretoak, other.zinema_aretoak)
				&& Objects.equals(zinema_helbidea, other.zinema_helbidea)
				&& Objects.equals(zinema_izena, other.zinema_izena)
				&& Objects.equals(zinema_telefonoa, other.zinema_telefonoa);
	}
	
	@Override
	public String toString() {
		return "Zinema [zinema_izena=" + zinema_izena + ", zinema_helbidea=" + zinema_helbidea + ", zinema_telefonoa="
				+ zinema_telefonoa + ", zinema_aretoak=" + Arrays.toString(zinema_aretoak) + ", saioak="
				+ Arrays.toString(saioak) + "]";
	}
	
	public String getZinema_izena() {
		return zinema_izena;
	}
	public void setZinema_izena(String zinema_izena) {
		this.zinema_izena = zinema_izena;
	}
	public String getZinema_helbidea() {
		return zinema_helbidea;
	}
	public void setZinema_helbidea(String zinema_helbidea) {
		this.zinema_helbidea = zinema_helbidea;
	}
	public int getZinema_telefonoa() {
		return zinema_telefonoa;
	}
	public void setZinema_telefonoa(int zinema_telefonoa) {
		this.zinema_telefonoa = zinema_telefonoa;
	}
	public Aretoa[] getZinema_aretoak() {
		return zinema_aretoak;
	}
	public void setZinema_aretoak(Aretoa[] zinema_aretoak) {
		this.zinema_aretoak = zinema_aretoak;
	}
	public Saioa[] getSaioak() {
		return saioak;
	}
	public void setSaioak(Saioa[] saioak) {
		this.saioak = saioak;
	}
	
	
	

	
}
