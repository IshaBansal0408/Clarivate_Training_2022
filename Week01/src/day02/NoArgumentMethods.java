package day02;

public class NoArgumentMethods {
	public static void main(String[] args) {
		System.out.println("Inside main function");
		fun1();
		fun2();
		fun3();
		fun4();
		System.out.println("Inside main function");
		
	}
	public static void fun1() {
		System.out.println("Inside Function 1");
		fun2();
	}
	public static void fun2() {
		System.out.println("Inside Function 2");
	}
	public static void fun3() {
		System.out.println("Inside Function 3");
		fun1();
	}
	public static void fun4() {
		System.out.println("Inside Function 4");
	}
}
