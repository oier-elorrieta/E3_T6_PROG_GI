package model;

import model.methods.Converters;

public class Cinema_rooms {
	// VARIABLES
	private int room_number;
	private String room_name;
	private String room_date;
	private int room_schedule;
	
	// CONSTRUCTORS
	public Cinema_rooms() {
		
	}
	
	public Cinema_rooms(int room_number, String room_name, String room_date, int room_schedule) {
		this.room_number = room_number;
		this.room_name = room_name;
		this.room_date = room_date;
		this.room_schedule = room_schedule;
	}
	
	public Cinema_rooms(String room_number, String room_name, String room_date, String room_schedule) {
		this.room_number = Converters.stringToInt(room_number);
		this.room_name = room_name;
		this.room_date = room_date;
		this.room_schedule = Converters.stringToInt(room_schedule);
	}
	
	public boolean equals(Cinema_rooms object) {
        if (this.room_number == object.room_number &&
            this.room_name.equals(object.room_name) &&
            this.room_date.equals(object.room_date) &&
            this.room_schedule == object.room_schedule) {
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
	public int getRoom_schedule() {
		return room_schedule;
	}
	public void setRoom_schedule(int room_schedule) {
		this.room_schedule = room_schedule;
	}
	
	// METHODS
}
