package day03;

public class HasARelationDriver {
	public static void main(String[] args) {
		HasARelationClass02 c1 = new HasARelationClass02("blue");
		// fetching values is done using getter method
		System.out.println("Color of the Car : "+c1.getColor());
		System.out.println("The cc of Engine : "+c1.getE1().getCc());
	}
	
	

}
