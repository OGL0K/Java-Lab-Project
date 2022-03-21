package lab6_exercise3;

public class MedalTable {


private int[][] medals;

public MedalTable() {
	super();
	
	this.medals = new int[Countries.values().length][Medals.values().length];
}


public void addMedal(Countries countries, Medals medal) {
	 
	this.medals[countries.getIndex()][medal.getIndex()] += 1;
	
}

public int getMedals(Countries countries, Medals medal) {
    
    return medals[countries.getIndex()][medal.getMedalNumbers()];
    
}

public int getEUMedalCount() {
    int euMedal = 0;
	for(int x = 0; x < medals.length; x++) {
       if(x == 1) {continue;}
	   if(x == 2) {continue;}
	   if(x == 3) {continue;}
		
	for(int y = 0; y < medals[x].length; y++) {
		
		euMedal += medals[x][y];
   } 
 }
     
   	return euMedal;

}


}


