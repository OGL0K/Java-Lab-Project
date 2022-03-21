/**
 * 
 */
package lab2;



/**
 * @author OG
 *
 */
public class ClockDisplayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClockDisplay clock = new ClockDisplay();
    
    for (int i = 0; i < 101; i++) {
    
    	clock.timeTick();
    	System.out.println(clock.toString());
    }
	}

}
