package lab3_exercise2;

public class AnnualSalary {
	
	private double salary;
	
   public AnnualSalary() {
      super();
      this.salary = 0;
    }
    
    public double calculateTax() {
		double totaltaxed = 0;
		double tax1 = 0.2;
		double tax2 = 0.4;
		
		if(this.salary <= 12500) {
			return 0;
		}
		double taxable;
		taxable = this.salary-12509.0;
		
		if(taxable <= 37500) {
		totaltaxed = (this.salary-12509.0)*tax1;
		}
		
		double taxable1;
		taxable1 = this.salary - 50009.0;
		
		if(taxable > 37500) {
			totaltaxed = (37500.0*tax1) + (taxable1*tax2);
		}
		return totaltaxed;
		}
    
    
    
    
    public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
		
		
		


	
	
	
	
	
	
		
	
    
    
	  
}
