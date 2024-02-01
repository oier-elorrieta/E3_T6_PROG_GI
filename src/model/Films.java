package model;

import java.util.Objects;

import model.methods.Converters;

public class Films {
	//VARIABLES
	private int film_id;
	private String film_name;
	private double film_duration;
	private double film_price;
	private String film_genre;
	
	// CONSTRUCTORS
	public Films() {
		
	}
	
	public Films(int film_id,String film_name, double film_duration, double film_price, String film_genre) {
		this.film_id = film_id;
		this.film_name = film_name;
		this.film_duration = film_duration;
		this.film_price = film_price;
		this.film_genre = film_genre;
	}
	
	public Films(String film_id,String film_name, String film_duration, String film_price, String film_genre) {
		this.film_id = Converters.stringToInt(film_id);
		this.film_name = film_name;
		this.film_duration = Converters.stringToDouble(film_duration);
		this.film_price = Converters.stringToDouble(film_price);
		this.film_genre = film_genre;
	}
	
	@Override
	public String toString() {
		return "Films [film_id=" + film_id + ", film_name=" + film_name + ", film_duration=" + film_duration
				+ ", film_price=" + film_price + ", film_genre=" + film_genre + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Films other = (Films) obj;
		return Double.doubleToLongBits(film_duration) == Double.doubleToLongBits(other.film_duration)
				&& Objects.equals(film_genre, other.film_genre) && Objects.equals(film_name, other.film_name)
				&& film_id == other.film_id
				&& Double.doubleToLongBits(film_price) == Double.doubleToLongBits(other.film_price);
	}	

	// GETTERS & SETTERS
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public String getFilm_name() {
		return film_name;
	}
	public void setFilm_name(String film_name) {
		this.film_name = film_name;
	}
	public double getFilm_duration() {
		return film_duration;
	}
	public void setFilm_duration(double film_duration) {
		this.film_duration = film_duration;
	}
	public double getFilm_price() {
		return film_price;
	}
	public void setFilm_price(double film_price) {
		this.film_price = film_price;
	}
	public String getFilm_genre() {
		return film_genre;
	}
	public void setFilm_genre(String film_genre) {
		this.film_genre = film_genre;
	}
	
	// METHODS
}
