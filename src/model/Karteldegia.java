package model;

import java.util.Arrays;

public class Karteldegia {
	public Filma[] filmaList = new Filma[20];


	public Karteldegia(Filma[] filmaList) {
	
		this.filmaList = filmaList;
	}

	public Filma[] getFilmaList() {
		return filmaList;
	}

	public void setFilmaList(Filma[] filmaList) {
		this.filmaList = filmaList;
	}

	@Override
	public String toString() {
		return "Karteldegia [filmaList=" + Arrays.toString(filmaList) + "]";
	}

	
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
	
	
}
