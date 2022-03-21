/**
 * 
 */
package exercise1;



/**
 * @author OG
 *
 */
public class ClockDisplayTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
	 ClockDisplay clock12 = new ClockDisplay(true);
     ClockDisplay clock24 = new ClockDisplay(false);
	 
     for (int i = 0; i < 1440; i++) { 
    	clock12.timeTick();
        clock24.timeTick();
	System.out.println(clock12.toString());	
     
    }
	}
}
