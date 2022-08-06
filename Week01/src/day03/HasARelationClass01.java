package day03;

public class HasARelationClass01 {
	
	// Car has a Engine 
	// create engine before
	
	private double cc;
	
	// getter-setter is encapsulation rule not relation
	HasARelationClass01(double c){
		this.cc = c;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

}
