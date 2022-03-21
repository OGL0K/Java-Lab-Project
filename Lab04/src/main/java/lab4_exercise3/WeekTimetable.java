package lab4_exercise3;

public class WeekTimetable {

 Day[] days = new Day[5];
 
 
 public WeekTimetable() {
	 super();
	 this.days = new Day[5];
 }

  public void addDailySessions(int index, Day day) {
	
    days[index] = day;
    
    
}
 
 public String printTimetable() {
	      String moduleHours = "";
	      for (Day array : days) {
	      moduleHours += (array.getName() + "\n" + array.toString() + "\n");
	      
	      
	}
	      
  return moduleHours;
 }
 
 



}




