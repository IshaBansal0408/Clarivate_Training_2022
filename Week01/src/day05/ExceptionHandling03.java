package day05;

public class ExceptionHandling03 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		int a = 10;
		int b = 0;
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero!");
		}
		finally {
			System.out.println("Inside finally block!");
		}
		System.out.println("Program ends");
	}

}
