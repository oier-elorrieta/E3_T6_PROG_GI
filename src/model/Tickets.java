package model;

import java.util.Date;
import java.util.Objects;

import model.methods.Converters;

public class Tickets {
	// VARIABLES
	private int ticket_id;
	private int session_id;
	private double price;
	private String id_card_number;

	// CONSTRUCTORS
	public Tickets() {

	}

	public Tickets(int ticket_id, int session_id, double price, String id_card_number) {
		this.ticket_id = ticket_id;
		this.session_id = session_id;
		this.price = price;
		this.id_card_number = id_card_number;
	}
	
	public Tickets(String ticket_id, String session_id, String price, String id_card_number) {
		this.ticket_id = Converters.stringToInt(ticket_id);
		this.session_id = Converters.stringToInt(session_id);
		this.price = Converters.stringToDouble(price);
		this.id_card_number = id_card_number;
	}

	@Override
	public String toString() {
		return "Tickets [ticket_id=" + ticket_id + ", session_id=" + session_id + ", price=" + price
				+ ", id_card_number=" + id_card_number + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tickets other = (Tickets) obj;
		return Objects.equals(id_card_number, other.id_card_number)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& session_id == other.session_id && ticket_id == other.ticket_id;
	}

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public int getSession_id() {
		return session_id;
	}

	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getId_card_number() {
		return id_card_number;
	}

	public void setId_card_number(String id_card_number) {
		this.id_card_number = id_card_number;
	}

	

}
