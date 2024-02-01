package model;


import java.util.Date;
import java.util.Objects;

public class Session {
	// VARIABLES
	private int session_id;
	private Date session_date;
	private String session_film_name;
	private String session_room_name;
	private String session_cinema_name;
	
	public Session() {
		
	}

	public Session(int session_id, Date session_date, String session_film_name, String session_room_name,
			String session_cinema_name) {
		this.session_id = session_id;
		this.session_date = session_date;
		this.session_film_name = session_film_name;
		this.session_room_name = session_room_name;
		this.session_cinema_name = session_cinema_name;
	}

	@Override
	public String toString() {
		return "Session [session_id=" + session_id + ", session_date=" + session_date + ", session_film_name="
				+ session_film_name + ", session_room_name=" + session_room_name + ", session_cinema_name="
				+ session_cinema_name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		return Objects.equals(session_cinema_name, other.session_cinema_name)
				&& Objects.equals(session_date, other.session_date)
				&& Objects.equals(session_film_name, other.session_film_name) && session_id == other.session_id
				&& Objects.equals(session_room_name, other.session_room_name);
	}

	public int getSession_id() {
		return session_id;
	}
	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}
	public Date getSession_date() {
		return session_date;
	}
	public void setSession_date(Date session_date) {
		this.session_date = session_date;
	}
	public String getSession_film_name() {
		return session_film_name;
	}
	public void setSession_film_name(String session_film_name) {
		this.session_film_name = session_film_name;
	}
	public String getSession_room_name() {
		return session_room_name;
	}
	public void setSession_room_name(String session_room_name) {
		this.session_room_name = session_room_name;
	}
	public String getSession_cinema_name() {
		return session_cinema_name;
	}
	public void setSession_cinema_name(String session_cinema_name) {
		this.session_cinema_name = session_cinema_name;
	}
	
	
}
