package lab11_exercise3;

public class Supplier {

		String name;
		String phone;
		
		
	public Supplier(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
		
		if(phone.matches("([0][1-9]{10})") || phone.matches("([0][1-9]{6})")) {
			
		}
		
		else {
			throw new IllegalArgumentException();
		}
		
	}


	public String getName() {
		return name;
	}


	public String getPhone() {
		return phone;
	}
	
}
