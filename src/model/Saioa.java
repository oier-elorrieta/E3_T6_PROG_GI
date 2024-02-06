package model;

import java.util.Date;
import java.util.Objects;

public class Saioa {
	private Date data;
	private Filma filma;
	private Aretoa aretoa;
	private double filma_prezioa;

	public Saioa() {
		
	}
	
	public Saioa(Date data, Filma filma, Aretoa aretoa, double filma_prezioa) {
		this.data = data;
		this.filma = filma;
		this.aretoa = aretoa;
		this.filma_prezioa = filma_prezioa;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Filma getFilma() {
		return filma;
	}
	public void setFilma(Filma filma) {
		this.filma = filma;
	}
	public Aretoa getAretoa() {
		return aretoa;
	}
	public void setAretoa(Aretoa aretoa) {
		this.aretoa = aretoa;
	}
	
	public double getFilma_prezioa() {
		return filma_prezioa;
	}
	public void setFilma_prezioa(double filma_prezioa) {
		this.filma_prezioa = filma_prezioa;
	}
	
	@Override
	public String toString() {
		return "Saioa [data=" + data + ", filma=" + filma + ", aretoa=" + aretoa + ", filma_prezioa=" + filma_prezioa
				+ "]";
	}
	
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
				&& Double.doubleToLongBits(filma_prezioa) == Double.doubleToLongBits(other.filma_prezioa);
	}
	

}
	
	
