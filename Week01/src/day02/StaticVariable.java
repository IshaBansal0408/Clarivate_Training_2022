package day02;

public class StaticVariable {
	static int a = 34;
	public static void main(String[] args) {
		int a = 100;
		System.out.println("Value of a in main : "+a);
		printValue();
		a=200;
		System.out.println("Value of a in main after updation: "+a);
		printValue();
		System.out.println("Value of static a in main : "+StaticVariable.a);
		StaticVariable.a = 45;
		System.out.println("Static value updated!");
		System.out.println("Value of static a in main : "+StaticVariable.a);
		printValue();
	}
	public static void printValue() {
		System.out.println("Value of a in printValue : "+a);
	}
}
