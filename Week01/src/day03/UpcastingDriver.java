package day03;

public class UpcastingDriver {
	public static void main(String[] args) {
		
		// UpCasting
		// child object assigned to Parent reference variable
		UpcastingParent p = new UpcastingChild();
		System.out.println("Upcasting a value : "+p.aParent);
		
		// error because child UpCasted to Parent
		//System.out.println("Upcasting a value : "+p.aChild);
}

}
