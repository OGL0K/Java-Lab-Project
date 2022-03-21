package lab4_exercise3;

public class Session {
	
	private String sessionName;
	private int startTime;
	private int endTime;
	
	
	public Session (String sessionName, int startTime, int endTime) {
		super();
		
		this.sessionName = sessionName;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
	public String toString() {
		return  this.sessionName + ": " + this.startTime +" - "+ this.endTime;
	}
	
	public String getSessionName() {
		return sessionName;
	}
	
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	
	public int getStartTime() {
		return startTime;
	}
	
	
	public int getEndTime() {
		return endTime;
	}
	

	
}
