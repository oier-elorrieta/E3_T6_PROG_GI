package model;

import java.util.Date;
import java.util.Objects;

public class Saioa {
	// ALDAGAIAK
	private Date data;
	private Aretoa aretoa;
	private Filma filma;
	private double prezioa;

	// KONSTRUKTOREAK
	public Saioa() {
		
	}

	public Saioa(Date data, Aretoa aretoa, Filma filma, double prezioa) {
		this.data = data;
		this.aretoa = aretoa;
		this.filma = filma;
		this.prezioa = prezioa;
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
		Saioa other = (Saioa) obj;
		return Objects.equals(aretoa, other.aretoa) && Objects.equals(data, other.data)
				&& Objects.equals(filma, other.filma)
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return "Saioa [data=" + data + ", aretoa=" + aretoa + ", filma=" + filma + ", filma_prezioa=" + prezioa
				+ "]";
	}
	
	// GETTERS & SETTERS
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Aretoa getAretoa() {
		return aretoa;
	}
	public void setAretoa(Aretoa aretoa) {
		this.aretoa = aretoa;
	}
	public Filma getFilma() {
		return filma;
	}
	public void setFilma(Filma filma) {
		this.filma = filma;
	}	
	public double getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}
	
	public static Date stringToDate(String data) {
		Date dataBihurtuta = new Date();
		String[] sub = data.split("-");
		dataBihurtuta.setYear(Integer.parseInt(sub[0]));
		dataBihurtuta.setMonth(Integer.parseInt(sub[1])-1);
		dataBihurtuta.setDate(Integer.parseInt(sub[2]));
		dataBihurtuta.setHours(Integer.parseInt(sub[3]));
		dataBihurtuta.setMinutes(Integer.parseInt(sub[4]));
		dataBihurtuta.setSeconds(0);
		return dataBihurtuta;
	}
}