package day02;

public class ParameterizedMethods {
	
	public static void main(String[] args) {
		printBookName("abscd");
		System.out.println("3 + 5 = "+addMethod(3,5));
		System.out.println("End of program");
	}
	public static void printBookName(String bname) {
		System.out.println("Name of Book is "+bname);
	}
	public static int addMethod(int a,int b) {
		return a+b;
	}

}
