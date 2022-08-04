package day01;

public class ScopeVariable {
	//static variable
		static int b = 100;
		public static void main(String[] args) {
			//local variable
			int a = 5;
			System.out.println("Value of local 'a' : "+a);
			System.out.println("Value of 'b' inside main : "+b);
			printValues();
			
		}
		public static void printValues() {
			System.out.println("Value of 'b' inside function : "+b);
			//System.out.println(a); //error
		}
}
