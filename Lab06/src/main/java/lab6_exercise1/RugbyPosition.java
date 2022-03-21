package lab6_exercise1;

public enum RugbyPosition {
	
LOOSEHEAD(1), HOOKER(2), TIGHTHEAD(3), NUMBER4LOCK(4), NUMBER5LOCK(5), BLINDSIDEFLANKER(6), OPENSIDEFLANKER(7), NUMBER8(8), 

SCRUMHALF(9), FLYHALF(10), LEFTWING(11), INSIDECENTER(12), OUTSIDECENTE(13), RIGHTWING(14), FULLBACK(15);



private int positionNumbers;


private RugbyPosition(int positionNumbers) {
	
	this.positionNumbers = positionNumbers;
}


public int getPositionNumbers() {
	return this.positionNumbers;
}



}


