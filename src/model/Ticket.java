package model;

import java.util.Objects;

public class Ticket {
	private Saioa saioa;
	private double ticket_prezioa;
	private Bezeroa bezeroa;
	
	
	public Ticket() {
		
	}
	public Ticket(Saioa saioa, double ticket_prezioa, Bezeroa bezeroa) {
	
		this.saioa = saioa;
		this.ticket_prezioa = ticket_prezioa;
		this.bezeroa = bezeroa;
	}
	
	
	public Saioa getSaioa() {
		return saioa;
	}
	public void setSaioa(Saioa saioa) {
		this.saioa = saioa;
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
	
	@Override
	public String toString() {
		return "Ticket [saioa=" + saioa + ", ticket_prezioa=" + ticket_prezioa + ", bezeroa=" + bezeroa + "]";
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
		return Objects.equals(bezeroa, other.bezeroa) && Objects.equals(saioa, other.saioa)
				&& Double.doubleToLongBits(ticket_prezioa) == Double.doubleToLongBits(other.ticket_prezioa);
	}

	
}
