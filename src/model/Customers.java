package model;

import java.util.Objects;

import model.methods.Converters;

public class Customers {
	// VARIABLES
	private int id_card_number;
	private String customer_name;
	private String customer_surname;
	private String password;
	private int age;
	
	// CONSTRUCTORS
	public Customers() {
		
	}
	
	public Customers(int id_card_number, String customer_name, String customer_surname, String password, int age) {
		this.id_card_number = id_card_number;
		this.customer_name = customer_name;
		this.customer_surname = customer_surname;
		this.password = password;
		this.age = age;
	}
	
	public Customers(String id_card_number, String customer_name, String customer_surname, String password, String age) {
		this.id_card_number = Converters.stringToInt(id_card_number);
		this.customer_name = customer_name;
		this.customer_surname = customer_surname;
		this.password = password;
		this.age = Converters.stringToInt(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return age == other.age && Objects.equals(customer_name, other.customer_name)
				&& Objects.equals(customer_surname, other.customer_surname) && id_card_number == other.id_card_number
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "Customers [id_card_number=" + id_card_number + ", customer_name=" + customer_name
				+ ", customer_surname=" + customer_surname + ", password=" + password + ", age=" + age + "]";
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	
	// METHODS
	
}