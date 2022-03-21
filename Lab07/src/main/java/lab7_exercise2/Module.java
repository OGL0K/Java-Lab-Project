package lab7_exercise2;

public class Module {
	
	private String name;
	
	
	public Module(String name) {
		super();
		this.name = name;
		
		String a = "Error";
		if(this.name.matches("([A-Z]{3})([0-9]{4})")) {
	    this.name = name;
		}
		
		else {
			this.name = a;
 }
}
	
	public String getName() {
		return name;
}
}
