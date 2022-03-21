package lab11_exercise3;

public interface IItem {

	public void addIngredient(Ingredient ingredient);
	
	public double getTotalWeight();
	
	public double getTotalCalories();
	
	public double getTotalFat(IngredientType ingredient);
	
	public double getTotalSodium(IngredientType ingredient);
	
	public double getSodium(IngredientType ingredient);
	
	public double getFat(IngredientType ingredient);
}
