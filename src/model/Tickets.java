package model;

public class Tickets {
	// VARIABLES
	private int ticket_number;
	private String date;
	private int film;
	private int room;
	private double price;
	
	// CONSTRUCTORS
	public Tickets() {
		
	}
	
	public Tickets(int ticket_number, String date, int film, int room, double price) {
		this.ticket_number = ticket_number;
		this.date = date;
		this.film = film;
		this.room = room;
		this.price = price;
	}
	
	public Tickets(String ticket_number, String date, String film, String room, String price) {
		this.ticket_number = CheckConstructors.stringToInt(ticket_number);
		this.date = date;
		this.film = CheckConstructors.stringToInt(film);
		this.room = CheckConstructors.stringToInt(room);
		this.price = CheckConstructors.stringToDouble(price);
	}
	
	public boolean equals(Tickets object) {
        if (this.ticket_number == object.ticket_number &&
            this.date.equals(object.date) &&
            this.film == object.film &&
            this.room == object.room &&
            this.price == object.price) {
            return true;
        }
        return false;
    }
	
	// SETTERS & GETTERS
	public int getTicket_number() {
		return ticket_number;
	}
	public void setTicket_number(int ticket_number) {
		this.ticket_number = ticket_number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getFilm() {
		return film;
	}
	public void setFilm(int film) {
		this.film = film;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// METHODS
}
