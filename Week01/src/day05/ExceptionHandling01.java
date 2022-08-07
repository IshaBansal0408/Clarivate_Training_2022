package day05;

public class ExceptionHandling01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Trying to divide by 0");
		}
		
		try{
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Some exception occured!");
		}
		System.out.println("Program ends");
	}
}
