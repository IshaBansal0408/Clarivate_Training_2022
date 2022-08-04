package day02;

public class MethodOverloading {
	public static void main(String[] args) {
		add(2,3);
		add(3,5.5f);
		add(3,4,5);
		add(4.6f,3);
		
	}
	public static void add(int a,int b) {
		System.out.println("addition of two int");
	}
	public static void add(int a,int b,int c) {
		System.out.println("addition of three int");
	}
	public static void add(int a,float b) {
		System.out.println("addition of int and float");
	}
	public static void add(float b,int a) {
		System.out.println("addition of float and int");
	}

}
