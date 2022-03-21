package lab5_exercise2;

public class GasBill {
   
	private String accountNumber;
	private double amount;
	private Customer customer;
	
	
	public GasBill(String accountNumber, double amount, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customer = customer;
		
	}

	public boolean checkAccountAccuracy() {
		
		boolean foundMatch = this.accountNumber.matches("[0-9]{4}(-)[0-9]{4}(-)[0-9]{4}");
		
		if(foundMatch) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String displayAccountDetails() {
		String b= "Gas Bill\n"+ " Account Number:"+ this.getAccountNumber()+ "\n"+ " Customer:"+ this.getCustomer()+ "\n" + this.displayAmountDue()+ "0";
		return b;
		
	}
	
	private String displayAmountDue() {
		String a = " Amount due:" + this.amount;
		return a;
	}
	
	public String getAccountNumber() {
		
        String a = "";
        
        if(this.checkAccountAccuracy()) {
        	a = accountNumber;
        }
        else {
        	a = "Invalid Account";
        }
		
		
		return a;
     }
    
	public String getCustomer() {
		return this.customer.toString();
	}
	
	
	
	
	
	
}
