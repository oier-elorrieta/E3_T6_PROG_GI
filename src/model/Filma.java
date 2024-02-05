package model;

import java.util.Objects;

public class Filma {
	private String filma_izena;
	private int filma_iraupena;
	private double filma_prezioa;
	private String filma_generoa;
	
	public Filma() {
		
	}
	public Filma(String filma_izena, int filma_iraupena, double filma_prezioa, String filma_generoa) {
		
		this.filma_izena = filma_izena;
		this.filma_iraupena = filma_iraupena;
		this.filma_prezioa = filma_prezioa;
		this.filma_generoa = filma_generoa;
	}
	public String getFilma_izena() {
		return filma_izena;
	}
	public void setFilma_izena(String filma_izena) {
		this.filma_izena = filma_izena;
	}
	public int getFilma_iraupena() {
		return filma_iraupena;
	}
	public void setFilma_iraupena(int filma_iraupena) {
		this.filma_iraupena = filma_iraupena;
	}
	public double getFilma_prezioa() {
		return filma_prezioa;
	}
	public void setFilma_prezioa(double filma_prezioa) {
		this.filma_prezioa = filma_prezioa;
	}
	public String getFilma_generoa() {
		return filma_generoa;
	}
	public void setFilma_generoa(String filma_generoa) {
		this.filma_generoa = filma_generoa;
	}
	
	
	@Override
	public String toString() {
		return "Filma [filma_izena=" + filma_izena + ", filma_iraupena=" + filma_iraupena + ", filma_prezioa="
				+ filma_prezioa + ", filma_generoa=" + filma_generoa + "]";
	}
	
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
				&& Objects.equals(filma_izena, other.filma_izena)
				&& Double.doubleToLongBits(filma_prezioa) == Double.doubleToLongBits(other.filma_prezioa);
	}
	
	
	
}
