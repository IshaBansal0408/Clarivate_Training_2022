package day05;

public class ExceptionHandling02 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		int a = 10;
		int b = 0;
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println();
		try{
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program ends");
	}
}
