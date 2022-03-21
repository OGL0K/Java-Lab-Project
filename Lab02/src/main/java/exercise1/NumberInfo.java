package exercise1;

public class NumberInfo {

	private int limit;
	private int value;
	
	
	public NumberInfo(int limit) {
       super();
     //add code here
      this.limit = limit;        
    		
   }

	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getValue() {
		return value;
	}
	public void increment() {
		
		this.value++;
		this.value = (this.value) % this.limit;
	}
	
}
