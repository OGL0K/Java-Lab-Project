package lab3;

public class Email {

	private String sender;
	private String recipient;
	private String message;
	
	private static final String DEFAULT_ADDRESS = "unknown@unknonw";
	private String emailAddress;
	
public Email(String sender, String recipient, String message) {
	super();
	this.sender = sender;
	this.recipient = recipient;
	this.message = message;
	
}

public Email(String emailAddress) {
	super();
	this.emailAddress = emailAddress;
}


public static String getDefaultAddress() {
	return DEFAULT_ADDRESS;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getSender() {
	return sender;
}
public String getRecipient() {
	return recipient;
}
public String getMessage() {
	return message;
}


}
