package exercise2;

public class Meal {

	private Food mainCourse;
	private Food dessert;
	
	

	public Meal(Food mainCourse, Food dessert) {
		super();
		this.mainCourse = mainCourse;
		this.dessert = dessert;
		
	}

	
	@Override
	public String toString() {
		return "Meal [mainCourse=" + "BLT Sandwich"+ ", dessert=" + "Dark Chocolate" + "]";
	}


	public double calculateTotalSugarLevel() {
	return this.mainCourse.getAmountOfSugar() + this.dessert.getAmountOfSugar();
	}



	



	
	
	
	
	
		
	}



