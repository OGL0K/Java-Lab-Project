/**
 * 
 */
package exercise2;

/**
 * @author OG
 *
 */
public class MealTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
    Meal meal = new Meal(new Food("BLT Sandwich", 4.7), new Food("Dark Chocolate", 48));
    System.out.println(meal.toString());
    System.out.println("Total amount of sugar" + ":" + meal.calculateTotalSugarLevel() + "g");

	
	}
   
    
}


	

