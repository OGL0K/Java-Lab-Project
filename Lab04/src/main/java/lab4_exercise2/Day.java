package lab4_exercise2;

public class Day {

	private String name;
	
    Session[] sessions = new Session[4];
	

	public Day(String name) {
		super();
		this.name = name;
	}

	
    public String getName() {
		return name;
	}


	public void setSession(int index, String moduleName, int startTime, int endTime) {
		this.sessions[index] = new Session(moduleName, startTime, endTime);
	}
  
	public String toString() {
		String text = "";
		for(Session array : sessions) {
			if (array == null){ break; }
			text += array + "\n";
		}
		 return text;
	
	}
	
	public void display() {
        System.out.println(name + "\n" + sessions.toString());
    }
	
	
}
