package model;

import model.methods.Converters;

public class Customers {
	// VARIABLES
	private int id_card_number;
	private String customer_name;
	private String customer_surname;
	private String password;
	
	// CONSTRUCTORS
	public Customers() {
		
	}
	
	public Customers(int id_card_number, String customer_name, String customer_surname, String password) {
		this.id_card_number = id_card_number;
		this.customer_name = customer_name;
		this.customer_surname = customer_surname;
		this.password = password;
	}
	
	public Customers(String id_card_number, String customer_name, String customer_surname, String password) {
		this.id_card_number = Converters.stringToInt(id_card_number);
		this.customer_name = customer_name;
		this.customer_surname = customer_surname;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customers [id_card_number=" + id_card_number + ", customer_name=" + customer_name
				+ ", customer_surname=" + customer_surname + ", password=" + password + "]";
	}

	public boolean equals(Customers object) {
        if (this.id_card_number == object.id_card_number) {
            return true;
        }
        return false;
    }
	
	// GETTERS & SETTERS
	public int getId_card_number() {
		return id_card_number;
	}
	public void setId_card_number(int id_card_number) {
		this.id_card_number = id_card_number;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_surname() {
		return customer_surname;
	}
	public void setCustomer_surname(String customer_surname) {
		this.customer_surname = customer_surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// METHODS
	
}