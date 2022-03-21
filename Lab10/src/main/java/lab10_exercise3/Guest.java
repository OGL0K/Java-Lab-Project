package lab10_exercise3;

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
		double a = 0;
		
		for(int i = 0; i < charges.size(); i++) {
			a += charges.get(i).getCharge();
		}
		
		return a;
}
	public double calculateVATChargeAtRate(VATRate rate) {
		double a = 0;
		
		for(int i = 0; i < charges.size(); i++) {
		if(rate.equals(VATRate.STANDARD)) {
			a += charges.get(i).getCharge() * 17.5/100;
		}
		if(rate.equals(VATRate.LOW)) {
			a += charges.get(i).getCharge() * 5/100;
		}
    }
		return a;
}
	
	public String toString() {
		
		return this.forename + " " + this.surname + ", " + this.address + ", " + this.telephone;
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
