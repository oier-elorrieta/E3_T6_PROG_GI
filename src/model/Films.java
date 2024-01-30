package model;

public class Films {
	//VARIABLES
	private int film_number;
	private double film_duration;
	private double film_price;
	private String film_genre;
	
	// CONSTRUCTORS
	public Films() {
		
	}
	
	public Films(int film_number, double film_duration, double film_price, String film_genre) {
		this.film_number = film_number;
		this.film_duration = film_duration;
		this.film_price = film_price;
		this.film_genre = film_genre;
	}
	
	public Films(String film_number, String film_duration, String film_price, String film_genre) {
		this.film_number = CheckConstructors.stringToInt(film_number);
		this.film_duration = CheckConstructors.stringToDouble(film_duration);
		this.film_price = CheckConstructors.stringToDouble(film_price);
		this.film_genre = film_genre;
	}
	
	public boolean equals(Films object) {
        if (this.film_number  == object.film_number &&
            this.film_duration == object.film_duration &&
            this.film_price == object.film_price &&
            this.film_genre.equals(object.film_genre)) {
            
            return true;
        }
        
        return false;
    }

	// GETTERS & SETTERS
	public int getFilm_number() {
		return film_number;
	}
	public void setFilm_number(int film_number) {
		this.film_number = film_number;
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
