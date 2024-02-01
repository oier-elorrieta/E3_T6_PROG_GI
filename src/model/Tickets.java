package model;

import java.util.Objects;

import model.methods.Converters;

public class Tickets {
	// VARIABLES
	private int ticket_id;
	private String session_date;
	private String session_film_name;
	private String session_room_name;
	private String session_cinema_name;
	private double price;
	private String id_card_number;

	// CONSTRUCTORS
	public Tickets() {

	}

	public Tickets(int ticket_id, String session_date, String session_film_name, String session_room_name,
			String session_cinema_name, double price, String id_card_number) {
		this.ticket_id = ticket_id;
		this.session_date = session_date;
		this.session_film_name = session_film_name;
		this.session_room_name = session_room_name;
		this.session_cinema_name = session_cinema_name;
		this.price = price;
		this.id_card_number = id_card_number;
	}

	public Tickets(String ticket_id, String session_date, String session_film_name, String session_room_name,
			String session_cinema_name, String price, String id_card_number) {
		this.ticket_id = Converters.stringToInt(ticket_id);
		this.price = Converters.stringToDouble(price);
		this.session_date = session_date;
		this.session_film_name = session_film_name;
		this.session_room_name = session_room_name;
		this.session_cinema_name = session_cinema_name;
		this.price = Converters.stringToDouble(price);
		this.id_card_number = id_card_number;
	}

	@Override
	public String toString() {
		return "Tickets [ticket_id=" + ticket_id + ", session_date=" + session_date + ", session_film_name="
				+ session_film_name + ", session_room_name=" + session_room_name + ", session_cinema_name="
				+ session_cinema_name + ", price=" + price + ", id_card_number=" + id_card_number + "]";
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
				&& Objects.equals(session_cinema_name, other.session_cinema_name)
				&& Objects.equals(session_date, other.session_date)
				&& Objects.equals(session_film_name, other.session_film_name)
				&& Objects.equals(session_room_name, other.session_room_name) && ticket_id == other.ticket_id;
	}

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public String getSession_date() {
		return session_date;
	}

	public void setSession_date(String session_date) {
		this.session_date = session_date;
	}

	public String getSession_film_name() {
		return session_film_name;
	}

	public void setSession_film_name(String session_film_name) {
		this.session_film_name = session_film_name;
	}

	public String getSession_room_name() {
		return session_room_name;
	}

	public void setSession_room_name(String session_room_name) {
		this.session_room_name = session_room_name;
	}

	public String getSession_cinema_name() {
		return session_cinema_name;
	}

	public void setSession_cinema_name(String session_cinema_name) {
		this.session_cinema_name = session_cinema_name;
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
