package model;

import java.util.ArrayList;
import java.util.Objects;

public class SarreraKudeatzailea {
	// ALDAGAIAK
	private ArrayList<Sarrera> sarreraLista = new ArrayList<Sarrera>();
	private double ticket_prezioa;
	private Bezeroa bezeroa;

	// KONSTRUKTOREA
	public SarreraKudeatzailea() {
	}
	
	public SarreraKudeatzailea(ArrayList<Sarrera> sarreraLista, double ticket_prezioa, Bezeroa bezeroa) {
		this.sarreraLista = sarreraLista;
		this.ticket_prezioa = ticket_prezioa;
		this.bezeroa = bezeroa;
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
		SarreraKudeatzailea other = (SarreraKudeatzailea) obj;
		return Objects.equals(sarreraLista, other.sarreraLista) && Objects.equals(bezeroa, other.bezeroa)
				&& Double.doubleToLongBits(ticket_prezioa) == Double.doubleToLongBits(other.ticket_prezioa);
	}
	
	// TOSTRING
	
	@Override
	public String toString() {
		return "Ticket [SarreraLista=" + sarreraLista + ", ticket_prezioa=" + ticket_prezioa + ", bezeroa=" + bezeroa
				+ "]";
	}

	// GETTERS & SETTERS
	

	public ArrayList<Sarrera> getSarreraLista() {
		return sarreraLista;
	}

	public void setSarreraLista(ArrayList<Sarrera> sarreraLista) {
		sarreraLista = sarreraLista;
	}

	public double getTicket_prezioa() {
		return ticket_prezioa;
	}

	public void setTicket_prezioa(double ticket_prezioa) {
		this.ticket_prezioa = ticket_prezioa;
	}

	public Bezeroa getBezeroa() {
		return bezeroa;
	}

	public void setBezeroa(Bezeroa bezeroa) {
		this.bezeroa = bezeroa;
	}
}
