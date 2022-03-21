package lab10_exercise2;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest{

	
	private String forename;
	private String surname;
	private String address;
	private String telephone;
	private List<Charge> charges;
	
	
	public Guest(String forename, String surname, String address, String telephone){
		super();
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		this.charges = new ArrayList<Charge>();
	}
	
	public void addCharge(Service service, double charge) {	
		
		Charge charges = new Charge(service, charge);
		this.charges.add(charges);
		
	}
	
	public double calculateTotalChargeWithoutVAT() {
		
		return 0;
	}
	public double calculateVATChargeAtRate(VATRate rate) {
		
		return 0;
	}
	
	public String toString() {
		
		return "";
	}

	public String getForename() {
		return forename;
	}
	public String getSurname() {
		return surname;
	}

	public String getAddress() {
		return address;
	}
	public String getTelephone() {
		return telephone;
	}

	public List<Charge> getCharges() {
		return this.charges;
	}
	
	

}
