package lab3_exercise3;

public class Employee {

	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;
	
	
	
	public Employee(int id, String forename, String surname, AnnualSalary salary, Position companyPosition) {
		super();
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.companyPosition = companyPosition;
	}
	
	
	public String displayEmployeeName() {
      return this.forename + "" + this.surname;
	}
	
	
	private boolean eligibleForBonus() {
		
		
		if(this.salary.getSalary() >= 40000) {
		 return true;
		}
		
		else {
			return false;
		}
	
	}
	
	
	
	
	public String toString() {
     if(this.eligibleForBonus()) {
    	 return this.surname + ", " + this.forename +" (" + this.id + "): " + this.companyPosition.getRoleName() + " at " + "£" + this.salary.getSalary() + " (" + "£" + this.salary.calculateTax()+ " "+ "tax" + ") " + "and is eligible for bonus."; 
     }
     
     else {
    	 return this.surname + ", " + this.forename + " (" + this.id + "): "+ this.companyPosition.getRoleName() + " at " + "£" +  this.salary.getSalary() + " (" + "£" + this.salary.calculateTax() +" "+ "tax"  + ") "+ "and is not eligible for bonus.";
     }
	
	}


	public int getId() {
		return id;
	}


	public String getForename() {
		return forename;
	}


	public String getSurname() {
		return surname;
	}


	public double getSalary() {
		return salary.getSalary();
	}


	public String getPositionName() {

		return companyPosition.getRoleName();
	}


	public void setCompanyPosition(Position companyPosition) {
		this.companyPosition = companyPosition;
	}
	
	
	
	
	
	
	
   
		
		


    


	
	
	
	
	
	
}
