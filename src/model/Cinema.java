package model;

import java.util.ArrayList;
import java.util.Objects;

import model.methods.Converters;

public class Cinema {
	// VARIABLES
	private String cinema_name;
	private ArrayList<String> rooms;
	
	// CONSTRUCTORS
	public Cinema() {
		
	}

	public Cinema(String cinema_name, ArrayList<String> rooms) {
		this.cinema_name = cinema_name;
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Cinema [cinema_name=" + cinema_name + ", rooms=" + rooms + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cinema other = (Cinema) obj;
		return Objects.equals(cinema_name, other.cinema_name) && Objects.equals(rooms, other.rooms);
	}

	public String getCinema_name() {
		return cinema_name;
	}

	public void setCinema_name(String cinema_name) {
		this.cinema_name = cinema_name;
	}

	public ArrayList<String> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<String> rooms) {
		this.rooms = rooms;
	}
	
	
	
	
	// METHODS
}
