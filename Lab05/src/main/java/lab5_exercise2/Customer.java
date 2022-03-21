package lab5_exercise2;

public class Customer {

	private String name;
	private String surname;
	
	
	public Customer(String name , String surname) {
	super();
	this.name = name;
	this.surname = surname;
	}


	public char getName() {
		return name.charAt(0);
	}


	public String getSurname() {
		return surname;
	}

	public String toString() {
		
		return this.getName() + ". " + this.getSurname();
	}
	








}
