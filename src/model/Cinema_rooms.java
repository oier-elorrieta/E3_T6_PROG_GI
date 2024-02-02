package model;

import java.util.Objects;

import model.methods.Converters;

public class Cinema_rooms {
	// VARIABLES
	private String ID_room;
	private String room_name;
	
	// CONSTRUCTORS
	public Cinema_rooms() {
		
	}

	public Cinema_rooms(String room_name) {
		this.room_name = room_name;
	}
	
	@Override
	public String toString() {
		return "Cinema_rooms [room_name=" + room_name + "]";
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
		return Objects.equals(room_name, other.room_name);
	}

	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	
	
	
	
}
