package model;

import java.util.ArrayList;
import java.util.Objects;

import model.sql.KontsultakSQL;

public class BezeroKudeatzailea {
	private ArrayList<Bezeroa> bezeroaList = new ArrayList<Bezeroa>();

	public BezeroKudeatzailea(ArrayList<Bezeroa> bezeroaList) {
		this.bezeroaList = bezeroaList;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BezeroKudeatzailea other = (BezeroKudeatzailea) obj;
		return Objects.equals(bezeroaList, other.bezeroaList);
	}

	@Override
	public String toString() {
		return "BezeroKudeatzailea [bezeroaList=" + bezeroaList + "]";
	}

	public ArrayList<Bezeroa> getBezeroaList() {
		return bezeroaList;
	}

	public void setBezeroaList(ArrayList<Bezeroa> bezeroaList) {
		this.bezeroaList = bezeroaList;
	}	
}
