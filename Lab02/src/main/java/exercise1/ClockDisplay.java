package exercise1;

import java.text.DecimalFormat;

public class ClockDisplay {

/**
* @return
*  
* @see java.lang.Object#toString()
*/

    private NumberInfo hours;
	private NumberInfo minutes;
	private boolean b;
	
	public ClockDisplay(boolean b) {
	  super(); 
	
	  this.hours = new NumberInfo(24);
	  this.minutes = new NumberInfo(60);
	  this.b = b;
		
	}
	

	public String toString() {
		String a = "";
		if(this.b) {
			DecimalFormat s1 = new DecimalFormat("0");
			DecimalFormat s2 = new DecimalFormat("00");
			
			if(this.hours.getValue() < 12) {
				a = s1.format(this.hours.getValue()) + 
						":" + s2.format(this.minutes.getValue()) + "am";
			}
			
			else if(this.hours.getValue() > 12) {
				a = s1.format(this.hours.getValue() - 12) + 
						":" + s2.format(this.minutes.getValue()) + "pm";
			}
			
			else if(this.hours.getValue() == 12) {
				a = "12:00pm";
			}
	
		
		
	}
		
		if(this.b == false) {
			DecimalFormat s2 = new DecimalFormat("00");
			a = s2.format(this.hours.getValue()) + 
					":" + s2.format(this.minutes.getValue());
	}
	
		
	 return a;
				   
	}
 
	
	
	public void timeTick() {
   //Increment the minute
   this.minutes.increment();
   
	 if (minutes.getValue() == 0) {
	//The minutes just rolled over so we must increment the hours
	this.hours.increment();
	
	 }		 
    
	
}
}