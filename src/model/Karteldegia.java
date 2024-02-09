package model;

import java.util.Arrays;

import model.sql.KontsultakSQL;

public class Karteldegia {
	// ALDAGAIAK
	private Filma[] filmaList = new Filma[KontsultakSQL.kont_filmak];

	public Karteldegia() {
		
	}
	
	public Karteldegia(Filma[] filmaList) {
		this.filmaList = filmaList;
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
		Karteldegia other = (Karteldegia) obj;
		return Arrays.equals(filmaList, other.filmaList);
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return "Karteldegia [filmaList=" + Arrays.toString(filmaList) + "]";
	}
	
	// GETTERS & SETTERS
	
	
	public Filma[] getFilmaList() {
		return filmaList;
	}

	public void setFilmaList(Filma[] filmaList) {
		this.filmaList = filmaList;
	}
}
