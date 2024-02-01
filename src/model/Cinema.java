package model;

import java.util.Objects;

import model.methods.Converters;

public class Cinema {
	// VARIABLES
	private int cinema_id;
	private String cinema_name;
	
	// CONSTRUCTORS
	public Cinema() {
		
	}
	
	public Cinema(int cinema_id, String cinema_name) {
		this.cinema_id = cinema_id;
		this.cinema_name = cinema_name;
	}
	
	public Cinema(String cinema_id, String cinema_name) {
		this.cinema_id = Converters.stringToInt(cinema_id);
		this.cinema_name = cinema_name;
	}

	@Override
	public String toString() {
		return "Cinema [cinema_id=" + cinema_id + ", cinema_name=" + cinema_name + "]";
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
		return cinema_id == other.cinema_id && Objects.equals(cinema_name, other.cinema_name);
	}

	// SETTERS & GETTERS
	public int getCinema_id() {
		return cinema_id;
	}

	public void setCinema_id(int cinema_id) {
		this.cinema_id = cinema_id;
	}

	public String getCinema_name() {
		return cinema_name;
	}

	public void setCinema_name(String cinema_name) {
		this.cinema_name = cinema_name;
	}
	
	// METHODS
}
