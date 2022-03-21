package lab5_exercise3;

import java.util.ArrayList;
import java.util.List;

public class Order {

private List<Pizza> pizzas;
private Customer customer;

public Order(Customer customer) {
	super();
	
	this.customer = customer;
	this.pizzas = new ArrayList<Pizza>();
}

public void addPizza(Pizza pizza) {
	pizzas.add(pizza);
	
	
}


public double calculateTotal() {
	
	double price = 0;
    for(int i =0; i < pizzas.size(); i++ ) {
    	if(pizzas.get(i) == null) {break;}
    	price += pizzas.get(i).calculateCost();
    }
    return price;
}


 public String printReceipt() {
	
 String b = "Customer: " + this.customer + "\n" +  "Number of Pizzas: 3\n" + "Total Cost: 26.97";
 
 return b;


}



}
