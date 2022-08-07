package day05;

public class ExceptionHandling04 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		int a = 10;
		int b = 0;
		try{
			System.out.println(a/b);
		}
		
		catch(ClassCastException e1) {
			System.out.println("FileNotFoundException Occurred.");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occurred.");
		}

	}
}
