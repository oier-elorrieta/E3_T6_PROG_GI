package model;

import java.util.Objects;

import model.methods.Converters;

public class Tickets {
	// VARIABLES
	private int ticket_number;
	private String cinema_name;
	private String room_name;
	private String film_name;
	private double price;
	private String session_date;

	// CONSTRUCTORS
	public Tickets() {

	}

	public Tickets(int ticket_number, String cinema_name, String room_name, String film_name, double price,
			String session_date) {
		this.ticket_number = ticket_number;
		this.cinema_name = cinema_name;
		this.room_name = room_name;
		this.film_name = film_name;
		this.price = price;
		this.session_date = session_date;
	}

	public Tickets(String ticket_number, String cinema_name, String room_name, String film_name, String price,
			String session_date) {
		this.ticket_number = Converters.stringToInt(ticket_number);
		this.cinema_name = cinema_name;
		this.room_name = room_name;
		this.film_name = film_name;
		this.price = Converters.stringToDouble(price);
		this.session_date = session_date;
	}

	@Override
	public String toString() {
		return "Tickets [ticket_number=" + ticket_number + ", cinema_name=" + cinema_name + ", room_name=" + room_name
				+ ", film_name=" + film_name + ", price=" + price + ", session_date=" + session_date + "]";
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
		return Objects.equals(cinema_name, other.cinema_name) && Objects.equals(film_name, other.film_name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(room_name, other.room_name) && Objects.equals(session_date, other.session_date)
				&& ticket_number == other.ticket_number;
	}

	public int getTicket_number() {
		return ticket_number;
	}

	public void setTicket_number(int ticket_number) {
		this.ticket_number = ticket_number;
	}

	public String getCinema_name() {
		return cinema_name;
	}

	public void setCinema_name(String cinema_name) {
		this.cinema_name = cinema_name;
	}

	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}

	public String getFilm_name() {
		return film_name;
	}

	public void setFilm_name(String film_name) {
		this.film_name = film_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSession_date() {
		return session_date;
	}

	public void setSession_date(String session_date) {
		this.session_date = session_date;
	}

}
