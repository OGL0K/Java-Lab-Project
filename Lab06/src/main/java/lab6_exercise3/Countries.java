package lab6_exercise3;

public enum Countries {

CANADA(0, false), CHINA(1, false), FRANCE(2, true),  RUSSIA(3, false), BRITAIN(4, false); 

private int countryNumber;
private boolean europe;

private Countries(int countryNumber, boolean europe) {
	
	this.countryNumber = countryNumber;
    this.europe = europe;
	
}

public int getIndex() {
	
	int a = this.countryNumber;
    return a;
}

public boolean isEU() {

     boolean a = this.europe;
     return a;
}


public int getCountryNumber() {
	return countryNumber;
}

public boolean isEurope() {
	return europe;
}

public  static Countries[] orderedCountries() {
	Countries[] output =new Countries[Countries.values().length];
	for(Countries country : Countries.values()) {
		output[country.getIndex()] = country;
		}
	return output;
}

}
