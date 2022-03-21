package lab11_exercise3;

public enum ProductType {
	  ITALIAN("Italian"), CHINESE("Chinese"), INDIAN("Indian"), TRADITIONAL("Traditional");
	
	  private String name;
	  
	  private ProductType(String name) {
		  
		  this.name = name;
	  }

	public String getName() {
		return name;
	}
	  
	  
	  
	  
	  
}

