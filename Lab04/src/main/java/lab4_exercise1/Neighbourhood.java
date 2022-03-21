package lab4_exercise1;

import lab4.House;

public class Neighbourhood {
  
   private House[] houses;
     
	    public Neighbourhood() {
    	super();
    	
    	this.houses = new House[3];
    	
    	House h1 = new House(3, 4);
	    House h2 = new House(5, 1);
	    House h3 = new House(7, 2);
    	
	    houses[0] = h1;
	    houses[1] = h2;
	    houses[2] = h3;
     }
	    
	    
	    public int calculateTotal() {
	    int total = 0;
	    for(int i = 0; i < houses.length; i++) {
	    total += houses[i].getNumberBottles();	
	 }
	    return total ;
	    }
	    
	    
	    
	   public String displayArray() {
	    String text = "";
	    	for(House array: houses) {
	    		text += array + "\n";
	    	}
	    	 
	    		text += "Total number of bottles to be delivered: " + calculateTotal();;
	    		
	    	
	    	return text;
	    	
	    	
	    			
	    }
	    
	    
	   
	   
	    
	   public House getHouses(int index) {
			return  houses[index] ;
		
	   
	   }

		public void setHouses(int i, int numberOfHouse, int numberBottles) {
			
		    this.houses[i] = new House(numberOfHouse, numberBottles);
		
		
		}
   
   
   
   
   
   
   
}
