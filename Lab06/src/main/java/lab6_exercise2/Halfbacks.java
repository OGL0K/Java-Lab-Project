package lab6_exercise2;

public class Halfbacks {

	
 private Player[] halfbacks = new Player[2];
 
 
 public Halfbacks() {
	 super();
	 this.halfbacks = new Player[2];
	 
 }
 
 public void assignHalfback(Player player) {
	 
	 this.halfbacks[0] = player;
	 
	 for(int index = 0; index < halfbacks.length; index++) {
	 
		 if(player.getPosition().equals(RugbyPosition.SCRUMHALF)) {
		 this.halfbacks[0] = new Player(player.getName(), RugbyPosition.SCRUMHALF);
	}
		 if(player.getPosition().equals(RugbyPosition.FLYHALF)) {
		this.halfbacks[1] = new Player(player.getName(), RugbyPosition.FLYHALF);
		
	}
		 
	 }
		 
 }
	 
	 public String displayElements() {
	 String  buffer = "" ;
	 
	 for(int index = 0; index < halfbacks.length; index++) {
		
	if(halfbacks[0].getPosition().equals(RugbyPosition.SCRUMHALF)) {	 
		 buffer = "0" + " - " + halfbacks[0].getName() + " " +  halfbacks[0].getPosition() + "\n" + index + " - " + halfbacks[index].getName()  + " " + halfbacks[index].getPosition() + "\n";
		}
	
	else {
		 buffer = "0" + " - \n" + index + " - " + halfbacks[index].getName()  + " " + halfbacks[index].getPosition() + "\n";
		
	}
	
	 }
	 
	 return buffer;

 }
 
 public String getPlayerBad(int number) {
	 String result =null;
	 if(number == 0) {
		 result =this.halfbacks[0].getName();
		 }
	 if(number == 1) {
		 result =this.halfbacks[1].getName();
		 }
	 return result;
 }
 
 public String getPlayer(RugbyPosition position) {
	 
	 String a = null;
	 
	 switch(position) {
	 
	 case LOOSEHEAD:
		 break;
		 
	 case HOOKER:
	     break;
	 
	 case TIGHTHEAD:
	     break;
	 
	 case NUMBER4LOCK:
	 break;
	 
	 case NUMBER5LOCK:
     break;
     
	 case BLINDSIDEFLANKER:
	 break;
	 
	 case OPENSIDEFLANKER:
	 break;
	 
	 case NUMBER8:
	 break;
	 
	 case SCRUMHALF:
	 a = "Willi Heinz";
		 break;
	 
	 case FLYHALF:
	 a = "Jacob Umaga";
		 break;
	 
	 case LEFTWING:
	 break;
	 
	 case INSIDECENTER:
	 break;
	
	 case OUTSIDECENTER:
	 break;
	 
	 case  RIGHTWING:
	 break;
	 
	 case FULLBACK:
		 break;
}
	 return a;
 
 }
 
 

 }
 
 
