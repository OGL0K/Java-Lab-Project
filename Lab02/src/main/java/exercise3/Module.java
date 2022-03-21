package exercise3;

public class Module {

private Assessment assessment1;
private Assessment assessment2;


public Module(Assessment assessment1, Assessment assessment2) {
	super();
	this.assessment1 = assessment1;
	this.assessment2 = assessment2;
}


public String toString() {
	return "COM1027 Average" + " " +"=" + " " +(this.calculateAverage() + "%" + " " + "[" + (this.assessment1.getName()+ "(20%)"+ " " + "=" + " " + this.assessment1.getMark() + "%" +  " ," + this.assessment2.getName() + "(80%)" + " "+ "=" + " " + this.assessment2.getMark() + "%" + " " + "]"));
}


public double calculateAverage() {
 return this.assessment1.getMark()*20/100 + this.assessment2.getMark()*80/100;
}










}
