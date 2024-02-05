package model;

import java.util.Objects;

public class Bezeroa {
	private String bezeroa_NAN;
	private String bezeroa_izena;
	private String bezeroa_abizenak;
	private String bezeroa_pasahitza;
	private char bezeroa_sexua;
	
	public Bezeroa() {
		
	}
	public Bezeroa(String bezeroa_NAN, String bezeroa_izena, String bezeroa_abizenak, String bezeroa_pasahitza,
			char bezeroa_sexua) {
		this.bezeroa_NAN = bezeroa_NAN;
		this.bezeroa_izena = bezeroa_izena;
		this.bezeroa_abizenak = bezeroa_abizenak;
		this.bezeroa_pasahitza = bezeroa_pasahitza;
		this.bezeroa_sexua = bezeroa_sexua;
	}
	
	public String getBezeroa_NAN() {
		return bezeroa_NAN;
	}
	public void setBezeroa_NAN(String bezeroa_NAN) {
		this.bezeroa_NAN = bezeroa_NAN;
	}
	public String getBezeroa_izena() {
		return bezeroa_izena;
	}
	public void setBezeroa_izena(String bezeroa_izena) {
		this.bezeroa_izena = bezeroa_izena;
	}
	public String getBezeroa_abizenak() {
		return bezeroa_abizenak;
	}
	public void setBezeroa_abizenak(String bezeroa_abizenak) {
		this.bezeroa_abizenak = bezeroa_abizenak;
	}
	public String getBezeroa_pasahitza() {
		return bezeroa_pasahitza;
	}
	public void setBezeroa_pasahitza(String bezeroa_pasahitza) {
		this.bezeroa_pasahitza = bezeroa_pasahitza;
	}
	public char getBezeroa_sexua() {
		return bezeroa_sexua;
	}
	public void setBezeroa_sexua(char bezeroa_sexua) {
		this.bezeroa_sexua = bezeroa_sexua;
	}
	
	@Override
	public String toString() {
		return "Bezeroa [bezeroa_NAN=" + bezeroa_NAN + ", bezeroa_izena=" + bezeroa_izena + ", bezeroa_abizenak="
				+ bezeroa_abizenak + ", bezeroa_pasahitza=" + bezeroa_pasahitza + ", bezeroa_sexua=" + bezeroa_sexua
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
		Bezeroa other = (Bezeroa) obj;
		return Objects.equals(bezeroa_NAN, other.bezeroa_NAN)
				&& Objects.equals(bezeroa_abizenak, other.bezeroa_abizenak)
				&& Objects.equals(bezeroa_izena, other.bezeroa_izena)
				&& Objects.equals(bezeroa_pasahitza, other.bezeroa_pasahitza) && bezeroa_sexua == other.bezeroa_sexua;
	}

	
}
