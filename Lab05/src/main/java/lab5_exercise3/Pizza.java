package lab5_exercise3;

public class Pizza {

private String[] toppings;
private int index;

public Pizza() {
	super();
	this.toppings = new String[10];
	
}

public void addToppings(String[] toppings) {
	
    for(int index = 0; index < toppings.length; index++) {
	this.index = toppings.length;
	this.toppings[index] = toppings[index];
	
	}
	
}

public String printToppings() { 
	String s = "";
	
	for(int i = 0; i < toppings.length; i++) {
		if(toppings[i]==null) {break;}
		s += toppings[i];
		if(toppings[i+1]!= null) {
			s += ",";
		}
}
        return s;
}

public double calculateCost() {
	 
	 double price;
     switch(index){
		
     case 1:
   
     case 2:
  
     case 3:
    
     case 4:
    	 price = 8.99;
    	 break;
    
     case 5:
    	 price = 9.99;
    	 break;
    	 
     case 6:
    	 price = 10.99;
    	 break;
    	 
     case 7:
    	 price = 11.99;
    	 break;
    		 
     case 8:
    	 price = 12.99;
    	 break;
    	 
     case 9:
    	 price = 13.99;
    	 break;
    	 
     case 10:
    	 price = 14.99;
    	 break;
    	 
     default:
         price = 0;
         break;
     }
     
     return price;
}

}
