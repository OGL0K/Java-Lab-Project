package lab3;

public class User {

private Email email = null;
private String name = null;


public String getName() {
	return this.name;
}

public Email getEmail() {
	return this.email;
}



public User(String name, Email email) {
	super();
	this.name = name;
	this.email = email;
}

public String toString() {
	return this.name +" <" + this.email.getEmailAddress() + ">";
}


}
