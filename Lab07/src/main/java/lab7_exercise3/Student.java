package lab7_exercise3;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private int urn;
	private List<Module> module = new ArrayList<Module>();
	
	public Student(String name, int urn) {
		super();
		this.name= name;
		this.urn = urn;
		
	}
	
	public int getUrn() {
		return urn;
	}
	
	public String getName() {
		return name;
	}

	public void addModuleList(Module module) {
		this.module.add(module);
	}
	
	public String printModules() {
     String a = "";
     
     for(int i = 0; i < this.module.size(); i++) {
    	 a += this.module.get(i).getName() + ", ";
        
     }
        a = a.replaceAll(", $", "");
    	
     return a;
		
	}
	
     
	
}
