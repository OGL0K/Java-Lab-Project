package lab7_exercise3;

public class Module {
	
	private String name;
	
	
	public Module(String name) {
		super();
		this.name = name;
}

	
	public String getName() {
		
		String a = "Error";
		 if(this.name.contains("COM")) {
			 return name;
		 }
		 else {
			 return a;
		 }
	}
}
