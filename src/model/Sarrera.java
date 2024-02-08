package model;

import java.util.Objects;

public class Sarrera {
	// ALDAGAIAK
	private Saioa saioa;
	private int pertsonaKopurua;
	
	// KONSTRUKTOREA
	
	public Sarrera(Saioa saioa, int pertsonaKopurua) {
		this.saioa = saioa;
		this.pertsonaKopurua = pertsonaKopurua;
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
		Sarrera other = (Sarrera) obj;
		return pertsonaKopurua == other.pertsonaKopurua && Objects.equals(saioa, other.saioa);
	}
	
	// TOSTRING

	@Override
	public String toString() {
		return "Sarrera [saioa=" + saioa + ", pertsonaKopurua=" + pertsonaKopurua + "]";
	}
	
	// GETTERS & SETTERS

	public Saioa getSaioa() {
		return saioa;
	}

	public void setSaioa(Saioa saioa) {
		this.saioa = saioa;
	}

	public int getPertsonaKopurua() {
		return pertsonaKopurua;
	}

	public void setPertsonaKopurua(int pertsonaKopurua) {
		this.pertsonaKopurua = pertsonaKopurua;
	}
}
