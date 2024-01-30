package model;

import model.methods.Converters;

public class Cinema_rooms {
	// VARIABLES
	private int room_number;
	private String room_name;
	private String room_date;
	
	// CONSTRUCTORS
	public Cinema_rooms() {
		
	}
	
	public Cinema_rooms(int room_number, String room_name, String room_date) {
		this.room_number = room_number;
		this.room_name = room_name;
		this.room_date = room_date;
	}
	
	public Cinema_rooms(String room_number, String room_name, String room_date, String room_schedule) {
		this.room_number = Converters.stringToInt(room_number);
		this.room_name = room_name;
		this.room_date = room_date;
	}
	
	@Override
	public String toString() {
		return "Cinema_rooms [room_number=" + room_number + ", room_name=" + room_name + ", room_date=" + room_date
				+ "]";
	}

	public boolean equals(Cinema_rooms object) {
        if (this.room_number == object.room_number &&
            this.room_name.equals(object.room_name) &&
            this.room_date.equals(object.room_date)) {
            return true;
        }
        
        return false;
    }

	// GETTERS & SETTERS
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public String getRoom_date() {
		return room_date;
	}
	public void setRoom_date(String room_date) {
		this.room_date = room_date;
	}
	
	// METHODS
}
