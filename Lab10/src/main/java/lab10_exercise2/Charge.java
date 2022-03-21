package lab10_exercise2;

public class Charge {

	private Service service;
	private double charge;
	
	
	public Charge(Service service, double charge) {
		super();
		this.service = service;
		this.charge = charge;
	}


	
	public double calculateVAT() {
		
		return this.service.getRate().getVatRates();
	}
	
	public Service getService() {
		return service;
	}


	public double getCharge() {
		return charge;
	}




}
