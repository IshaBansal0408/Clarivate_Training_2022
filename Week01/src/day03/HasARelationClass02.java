package day03;

public class HasARelationClass02 {
	
	// Car has a engine
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// creating an engine inside the car
	private HasARelationClass01 e1 = new HasARelationClass01(1000);

	public HasARelationClass01 getE1() {
		return e1;
	}

	public void setE1(HasARelationClass01 e1) {
		this.e1 = e1;
	}
	
	//pass value with help of constructor
	HasARelationClass02(String c){
		this.color = c;
	}

}
