package model;

import model.methods.Converters;

public class Cinema {
	// VARIABLES
	private int cinema_number;
	private int cinema_room;
	
	// CONSTRUCTORS
	public Cinema() {
		
	}
	
	public Cinema(int cinema_number, int cinema_room) {
		this.cinema_number = cinema_number;
		this.cinema_room = cinema_room;
	}
	
	public Cinema(String cinema_number, String cinema_room) {
		this.cinema_number = Converters.stringToInt(cinema_number);
		this.cinema_room = Converters.stringToInt(cinema_room);
	}
	
	@Override
	public String toString() {
		return "Cinema [cinema_number=" + cinema_number + ", cinema_room=" + cinema_room + "]";
	}

	public boolean equals(Cinema object) {
        if (this.cinema_number == object.cinema_number &&
            this.cinema_room == object.cinema_room) {
                return true;
        }

        return false;
    }
	
	// SETTERS & GETTERS
	public int getCinema_number() {
		return cinema_number;
	}
	public void setCinema_number(int cinema_number) {
		this.cinema_number = cinema_number;
	}
	public int getCinema_room() {
		return cinema_room;
	}
	public void setCinema_room(int cinema_room) {
		this.cinema_room = cinema_room;
	}
	
	// METHODS
}
