package model;

import java.util.Arrays;

import model.sql.KontsultakSQL;

public class ZinemaKudeatzailea {
	Zinema[] zinemaList = new Zinema[KontsultakSQL.kont_zinemak];

	public ZinemaKudeatzailea(Zinema[] zinemaList) {
		this.zinemaList = zinemaList;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZinemaKudeatzailea other = (ZinemaKudeatzailea) obj;
		return Arrays.equals(zinemaList, other.zinemaList);
	}

	@Override
	public String toString() {
		return "ZinemaKudeatzailea [zinemaList=" + Arrays.toString(zinemaList) + "]";
	}

	public Zinema[] getZinemaList() {
		return zinemaList;
	}

	public void setZinemaList(Zinema[] zinemaList) {
		this.zinemaList = zinemaList;
	}
	
	
}
