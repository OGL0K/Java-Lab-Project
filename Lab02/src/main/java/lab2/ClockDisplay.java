package lab2;

import java.text.DecimalFormat;

public class ClockDisplay {

/**
* @return
*  
* @see java.lang.Object#toString()
*/
@Override
	public String toString() {
	 DecimalFormat style = new DecimalFormat("00");
	return ( style.format(this.hours.getValue())) +
			":" + style.format(this.minutes.getValue());
	}
	private NumberInfo hours;
	private NumberInfo minutes;
	
	public ClockDisplay() {
	  super(); 
	
	  this.hours = new NumberInfo(12);
	  this.minutes = new NumberInfo(60);
		
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