package model;

import java.util.Objects;

public class Aretoa {
	// ALDAGAIAK
	private String areto_izena;

	// KONSTRUKTOREAK
	public Aretoa() {
		
	}
	
	public Aretoa(String areto_izena) {
		this.areto_izena = areto_izena;
	}
	
	// EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aretoa other = (Aretoa) obj;
		return Objects.equals(areto_izena, other.areto_izena);
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return "Aretoa [areto_izena=" + areto_izena + "]";
	}
	
	// GETTERS & SETTERS
	public String getAreto_izena() {
		return areto_izena;
	}
	public void setAreto_izena(String areto_izena) {
		this.areto_izena = areto_izena;
	}	
}
