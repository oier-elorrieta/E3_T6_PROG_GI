package model;

import java.util.Objects;

public class Filma {
	// ALDAGAIAK
	private String filma_izena;
	private String filma_generoa;
	private int filma_iraupena;
	
	// KONSTRUKTOREAK
	public Filma() {
		
	}
	
	public Filma(String filma_izena, String filma_generoa, int filma_iraupena) {
		this.filma_izena = filma_izena;
		this.filma_generoa = filma_generoa;
		this.filma_iraupena = filma_iraupena;
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
		Filma other = (Filma) obj;
		return Objects.equals(filma_generoa, other.filma_generoa) && filma_iraupena == other.filma_iraupena
				&& Objects.equals(filma_izena, other.filma_izena);
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return "Filma [filma_izena=" + filma_izena + ", filma_generoa=" + filma_generoa + ", filma_iraupena="
				+ filma_iraupena + "]";
	}

	// GETTERS & SETTERS
	public String getFilma_izena() {
		return filma_izena;
	}
	public void setFilma_izena(String filma_izena) {
		this.filma_izena = filma_izena;
	}
	public String getFilma_generoa() {
		return filma_generoa;
	}
	public void setFilma_generoa(String filma_generoa) {
		this.filma_generoa = filma_generoa;
	}
	public int getFilma_iraupena() {
		return filma_iraupena;
	}
	public void setFilma_iraupena(int filma_iraupena) {
		this.filma_iraupena = filma_iraupena;
	}
}
