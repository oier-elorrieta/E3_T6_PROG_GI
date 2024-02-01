package model;

import java.util.Objects;

import model.methods.Converters;

public class Customers {
	// VARIABLES
	private String id_card_number;
	private String customer_name;
	private String customer_surname;
	private String password;
	private char customer_sex;
	private int age;

	// CONSTRUCTORS
	public Customers() {

	}

	public Customers(String id_card_number, String customer_name, String customer_surname, String password,
			char customer_sex, int age) {
		this.id_card_number = id_card_number;
		this.customer_name = customer_name;
		this.customer_surname = customer_surname;
		this.password = password;
		this.customer_sex = customer_sex;
		this.age = age;
	}

	public Customers(String id_card_number, String customer_name, String customer_surname, String password,
			String customer_sex, String age) {
		this.id_card_number = id_card_number;
		this.customer_name = customer_name;
		this.customer_surname = customer_surname;
		this.password = password;
		this.customer_sex = Converters.stringToChar(customer_sex);
		this.age = Converters.stringToInt(age);
	}

	@Override
	public String toString() {
		return "Customers [id_card_number=" + id_card_number + ", customer_name=" + customer_name
				+ ", customer_surname=" + customer_surname + ", password=" + password + ", customer_sex=" + customer_sex
				+ ", age=" + age + "]";
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
				&& customer_sex == other.customer_sex && Objects.equals(customer_surname, other.customer_surname)
				&& Objects.equals(id_card_number, other.id_card_number) && Objects.equals(password, other.password);
	}

	public String getId_card_number() {
		return id_card_number;
	}

	public void setId_card_number(String id_card_number) {
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

	public char getCustomer_sex() {
		return customer_sex;
	}

	public void setCustomer_sex(char customer_sex) {
		this.customer_sex = customer_sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}