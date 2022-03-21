package lab11_exercise3;

import java.util.ArrayList;
import java.util.List;

public class Item implements IItem {

	private List<Ingredient> ingredients = new ArrayList<Ingredient>();
	private Ingredient ingredient;

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	@Override
	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
		
		if(ingredient.getType().equals(IngredientType.MEAT)) {
			
		}
		
	}

	@Override
	public double getTotalWeight() {
		double a = 0;
		for(int i = 0; i < ingredients.size(); i++) {
			a += this.ingredients.get(i).getRawWeight() * 0.8;
		}
		return a;
	}

	@Override
	public double getTotalCalories() {
		double a = 0;
		for(int i = 0; i < ingredients.size(); i++) {
			a += this.ingredients.get(i).getCalories();
		}
		return a;
	}

	@Override
	public double getTotalFat(IngredientType ingredient) {
		
		double a = 0;
		for(int i = 0; i < ingredients.size(); i++) {
			a += this.ingredients.get(i).getFat();
		
		if(ingredient.equals(IngredientType.MEAT)) {
			
			a = 0;
		}
			
		}
		return a;
	}

	@Override
	public double getTotalSodium(IngredientType ingredient) {
		double a = 0;
		for(int i = 0; i < ingredients.size(); i++) {
			a += this.ingredients.get(i).getSodium();
		
			if(ingredient.equals(IngredientType.MEAT)) {
				
				a = 0;
			}
		}
		return a;
}
	
	public double getSodium(IngredientType ingredient) {
		double a = 0;
		for(int i = 0; i < ingredients.size(); i++) {
			a = this.ingredients.get(i).getSodium();
		
			if(ingredient.equals(IngredientType.MEAT)) {
				
				a = this.ingredients.get(i).getSodium();
			}
		}
		return a;
	}
	
	public double getFat(IngredientType ingredient) {
		double a = 0;
		for(int i = 0; i < ingredients.size(); i++) {
			a = this.ingredients.get(i).getFat();
			
			if(ingredient.equals(IngredientType.MEAT)) {
				a = this.ingredients.get(0).getFat();
				
			}
		}
		return a;
	}
	
}
