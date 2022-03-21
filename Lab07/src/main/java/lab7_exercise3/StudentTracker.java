package lab7_exercise3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTracker {

private List<Student> studentList;
private Map <Integer, String> modulelist;



public StudentTracker() {
	super();
	this.studentList = new ArrayList<Student>();
	this.modulelist = new HashMap<Integer, String>();
}

public void addStudent(Student student, List<Module> moduleList) {
	
	for(int i = 0; i < moduleList.size(); i++) {
	student.addModuleList(moduleList.get(i));
	}
	this.studentList.add(student);
}

public String printStudents() {
		String a = "";
		for(int i = 0; i < studentList.size(); i++)
		a += this.studentList.get(i).getName() + "(" + this.studentList.get(i).getUrn() + ")" + "\n";
		
		return a;
	}
	

private void initiliseMap() {

	for(int i = 0; i < studentList.size(); i++) {
		this.modulelist.put(this.studentList.get(i).getUrn(), this.studentList.get(i).printModules());
		}
	
}


public String printModules(int urn) {
	initiliseMap();
	String a = "";
	
	a = "URN " + urn + " is enrolled in:\n" + this.modulelist.get(urn);

	return a;

}





}
