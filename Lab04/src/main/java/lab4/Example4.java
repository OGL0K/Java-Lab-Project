package lab4;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple class to introduce ArrayLists
 * 
 * @author Stella Kazamia
 * 
 */

public class Example4 {

	// Add a field
	private List<String> names = null;

	// Add a default constructor
	public Example4() {
		super();
		this.names = new ArrayList<String>();
	}

	// A user defined method that adds two String values in the array list
	public void addNames() {
		this.names.add("Helen");
		this.names.add("Stella");
	}

	// A user defined method that displays the values of the array list
	public String displayNames() {
		String output = "";
		for (String temp : this.names) {
			output += temp;
		}
		return output;
	}
}
	

