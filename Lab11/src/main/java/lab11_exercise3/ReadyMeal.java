package lab11_exercise3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadyMeal {

	private String name;
	private ProductType type;
	private Factory factory;
	private Date productionDate = null;
	private List<IItem> items = new ArrayList<IItem>();


	public ReadyMeal(String name, ProductType type, Factory factory) {
		super();
		this.name = name;
		this.type = type;
		this.factory = factory;
	}
	
	public void addItem(IItem biscuit) {
		this.items.add(biscuit);
	}

	
	public String printContent() {
	String a = "";
	
	for(int i = 0; i < items.size(); i++) {
		a = this.type.getName()+ " " + this.name + " Ready Meal " + this.items.get(i).getTotalWeight() + " g\n" + "\n"
			+ "Contents\n" + "Calories: " + this.items.get(i).getTotalCalories() + "kcal\n" + "Meat (fat): " + this.items.get(i).getFat(IngredientType.MEAT) 
			+ "g\nVegetable (sodium): "+ this.items.get(i).getSodium(IngredientType.VEGETABLE) + "g\n\n" + this.factory.getAddress();
	}
	return a;
	
}

	public String getName() {
		return name;
	}

	public ProductType getType() {
		return type;
	}

	public Factory getFactory() {
		return factory;
	}

	
	
	
}



