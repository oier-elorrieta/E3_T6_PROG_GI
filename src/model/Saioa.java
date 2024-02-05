package model;

import java.util.Date;
import java.util.Objects;

public class Saioa {
	private Date data;
	private Filma filma;
	private Aretoa aretoa;

	public Saioa() {
		
	}
	public Saioa(Date data, Filma filma, Aretoa aretoa) {
		
		this.data = data;
		this.filma = filma;
		this.aretoa = aretoa;
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
	
	@Override
	public String toString() {
		return "Saioa [data=" + data + ", filma=" + filma + ", aretoa=" + aretoa + "]";
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
				&& Objects.equals(filma, other.filma);
	}
	
	
	
}
