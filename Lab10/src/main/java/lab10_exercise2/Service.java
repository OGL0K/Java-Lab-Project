package lab10_exercise2;

public class Service {

	
	
		private String code;
		private String name;
		private VATRate rate;
		private double standardCharge;
		
		
		public Service(String code, String name, VATRate rate , double standardCharge) {
			super();
			
			if(code.matches("([A-Z]{4}([0-9]){4})")) {
				}
			
			else {
				throw new IllegalArgumentException();
			}
		
			if(standardCharge < 0) {
				throw new IllegalArgumentException();
				}
		
			if(code == null || name == null) {
				throw new NullPointerException();
			}
			
			this.code = code;
			this.name = name;
			this.rate = rate;
			this.standardCharge = standardCharge;
		}


		public String getCode() {
			return code;
		}


		public String getName() {
			return name;
		}


		public VATRate getRate() {
			return rate;
		}


		public double getStandardCharge() {
			return standardCharge;
		}


}
