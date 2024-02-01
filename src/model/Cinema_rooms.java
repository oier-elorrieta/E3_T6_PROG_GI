package model;

import java.util.Objects;

import model.methods.Converters;

public class Cinema_rooms {
	// VARIABLES
	private int room_id;
	private String room_name;
	
	// CONSTRUCTORS
	public Cinema_rooms() {
		
	}
	
	public Cinema_rooms(int room_number, String room_name) {
		this.room_id = room_number;
		this.room_name = room_name;
	}
	
	public Cinema_rooms(String room_number, String room_name) {
		this.room_id = Converters.stringToInt(room_number);
		this.room_name = room_name;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cinema_rooms other = (Cinema_rooms) obj;
		return room_id == other.room_id && Objects.equals(room_name, other.room_name);
	}

	@Override
	public String toString() {
		return "Cinema_rooms [room_id=" + room_id + ", room_name=" + room_name + "]";
	}
	
	// GETTERS & SETTERS
	
	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}


	
	
	// METHODS
}
