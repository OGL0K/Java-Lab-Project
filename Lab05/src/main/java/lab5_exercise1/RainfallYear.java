package lab5_exercise1;

public class RainfallYear {

 private int year;
 private double[] rainfallMonths;
 
 
public RainfallYear(int year) {
	 super();
	 this.year = year;
	 this.rainfallMonths = new double[12]; 
 }
 


public double calculateMeanRainfall() {
	
	double a = (this.rainfallMonths[0] + this.rainfallMonths[1] + this.rainfallMonths[2] + this.rainfallMonths[3] + this.rainfallMonths[4] + this.rainfallMonths[5] + this.rainfallMonths[6] +
			this.rainfallMonths[7] + this.rainfallMonths[8] + this.rainfallMonths[9] + this.rainfallMonths[10] + this.rainfallMonths[11])/12;
	
	
	return a;

	
	

}

public double calculateHighestRainfall() {
	
	double a = 0;
		for(int i = 0; i < rainfallMonths.length; i++) {
			if(rainfallMonths[i] < rainfallMonths[i]) {
				a = rainfallMonths[i];			
		}
		
		else {
			   a = rainfallMonths[i];
		}
}
	return a;
	
	
}

public void enterData(double[] rainfall) {

	this.rainfallMonths = rainfall;
	
		
	}
	

public double getRainfallMonth(String month) {
	
	int index = 0;
	
	switch(month) {
	
	case "JANUARY":
		index = 0;
		break;
		
	case "FEBRUARY":
		index = 1;
		break;
	
	case "MARCH":
		index = 2;
		break;
		
	case "APRIL":
	    index = 3;
	    break;
	
	case "MAY":
		index = 4;
		break;
		
	case "JUNE":
		index = 5;
		break;
	
	case "JULY":
		index = 6;
		break;
		
	case "AUGUST":
	    index = 7;
	    break;
		
	case "SEPTEMBER":
		index = 8;
		break;
		
	case "OCTOBER":
		index = 9;
		break;
		
	case "NOVEMBER":
		index = 10;
		break;
		
	case "DECEMBER":
		index = 11;
		break;
		
	}
	
	return rainfallMonths[index];
	 
	
	
}

public int getYear() {
	return year;
}






}
