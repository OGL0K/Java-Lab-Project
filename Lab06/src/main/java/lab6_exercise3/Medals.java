package lab6_exercise3;

public enum Medals {

BRONZE(0), SILVER(1), GOLD(2);

private int medalNumbers;

private Medals(int medalNumbers) {
this.medalNumbers = medalNumbers;

}


public int getIndex() {
	int a = this.medalNumbers;
	
	return a;
}


public int getMedalNumbers() {
	return medalNumbers;

}

public static Medals[] orderedMedals() {
	Medals[] medals =new Medals[Medals.values().length];
	for(Medals medal : Medals.values()) {
		medals[medal.getIndex()] = medal;
		}
	return medals;
}



}
