package model;

import java.util.ArrayList;
import java.util.Objects;

public class Ticket {
	private ArrayList<Saioa> saioa = new ArrayList<Saioa>();
	private ArrayList<Integer> pertsonaKantitatea = new ArrayList<Integer>();
	private double ticket_prezioa;
	private Bezeroa bezeroa;

	public Ticket(ArrayList<Saioa> saioa, ArrayList<Integer> pertsonaKantitatea, double ticket_prezioa, Bezeroa bezeroa) {
		this.saioa = saioa;
		this.pertsonaKantitatea = pertsonaKantitatea;
		this.ticket_prezioa = ticket_prezioa;
		this.bezeroa = bezeroa;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(bezeroa, other.bezeroa) && Objects.equals(pertsonaKantitatea, other.pertsonaKantitatea)
				&& Objects.equals(saioa, other.saioa)
				&& Double.doubleToLongBits(ticket_prezioa) == Double.doubleToLongBits(other.ticket_prezioa);
	}
	
	@Override
	public String toString() {
		return "Ticket [saioa=" + saioa + ", pertsonaKantitatea=" + pertsonaKantitatea + ", ticket_prezioa="
				+ ticket_prezioa + ", bezeroa=" + bezeroa + "]";
	}

	public ArrayList<Saioa> getSaioa() {
		return saioa;
	}
	public void setSaioa(ArrayList<Saioa> saioa) {
		this.saioa = saioa;
	}
	public ArrayList<Integer> getPertsonaKantitatea() {
		return pertsonaKantitatea;
	}
	public void setPertsonaKantitatea(ArrayList<Integer> pertsonaKantitatea) {
		this.pertsonaKantitatea = pertsonaKantitatea;
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
