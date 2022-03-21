package lab10_exercise2;

public enum VATRate {


	ZERO(0.0), LOW(5), STANDARD(17.5);
	
	private double vatRates;
	
	private VATRate(double vatRates) {
		this.vatRates = vatRates;
	}

	public double getVatRates() {
		return vatRates;
	}

	public void setVatRates(double vatRates) {
		this.vatRates = vatRates;
	}



}
