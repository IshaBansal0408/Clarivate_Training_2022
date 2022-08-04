package day02;

public class MethodIntro {
	
	public static void firstMethod() {
		System.out.println("Control is inside the method!");
	}
	
	public static void main(String[] args) {
		//calling method from main
		firstMethod();
		System.out.println("Control is inside the main method!");
	}

}
