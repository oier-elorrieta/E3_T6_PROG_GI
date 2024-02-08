package model;

import java.util.ArrayList;
import java.util.Objects;

public class Ticket {
	// ALDAGAIAK
	private ArrayList<Sarrera> SarreraLista = new ArrayList<Sarrera>();
	private double ticket_prezioa;
	private Bezeroa bezeroa;

	// KONSTRUKTOREA
	
	public Ticket(ArrayList<Sarrera> sarreraLista, double ticket_prezioa, Bezeroa bezeroa) {
		SarreraLista = sarreraLista;
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
		Ticket other = (Ticket) obj;
		return Objects.equals(SarreraLista, other.SarreraLista) && Objects.equals(bezeroa, other.bezeroa)
				&& Double.doubleToLongBits(ticket_prezioa) == Double.doubleToLongBits(other.ticket_prezioa);
	}
	
	// TOSTRING
	
	@Override
	public String toString() {
		return "Ticket [SarreraLista=" + SarreraLista + ", ticket_prezioa=" + ticket_prezioa + ", bezeroa=" + bezeroa
				+ "]";
	}

	// GETTERS & SETTERS
	

	public ArrayList<Sarrera> getSarreraLista() {
		return SarreraLista;
	}

	public void setSarreraLista(ArrayList<Sarrera> sarreraLista) {
		SarreraLista = sarreraLista;
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
