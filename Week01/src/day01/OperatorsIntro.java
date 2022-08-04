package day01;

public class OperatorsIntro {
	public static void main(String[] args) {
		
		System.out.println("> Arithmetic Operators");
		int a = 20;
		System.out.println("Original Value of a : "+20);
		System.out.println("Value of a+3 = "+a+3);
		int c = a-3;
		System.out.println("Value of a-3 = "+c);
		System.out.println("Value of a*3 = "+a*3);
		System.out.println("Value of a/3 = "+a/3);
		System.out.println("Value of a%3 = "+a%3);
		System.out.println("-------------------------------");
		
		System.out.println("> Assignment Operator");
		int b = 34;
		System.out.println("Value assigned to b is "+b);
		System.out.println("-------------------------------");
		
		System.out.println("> Assignment Operator");
		int n1 = 34;
		int n2 = 45;
		System.out.println("Value of n1 : "+n1);
		System.out.println("Value of n2 : "+n2);
		boolean r1 = n1>n2;
		boolean r2 = n1>=n2;
		boolean r3 = n1<=n2;
		boolean r4 = n1<=n2;
		boolean r5 = n1==n2;
		boolean r6 = n1!=n2;
		System.out.println("Is n1>n2? : "+r1);
		System.out.println("Is n1>=n2? : "+r2);
		System.out.println("Is n1<n2? : "+r3);
		System.out.println("Is n1<=n2? : "+r4);
		System.out.println("Is n1==n2? : "+r5);
		System.out.println("Is n1!=n2? : "+r6);
		System.out.println("-------------------------------");
		
		System.out.println("> Increment/Decrement Operator");
		int x = 20;
		System.out.println("Value of x : "+x);
		int y = x++; //first update then increment => y = 20 and x = 21
		System.out.println("y = x++");
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
		x = 20;
		y = ++x;	//first increment then update => y = 21 and x = 21
		System.out.println("y = ++x");
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
		x = 20;
		y = x--;	//y=20 and x=19
		System.out.println("y = x--");
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
		x = 20;
		y = --x;	//y=19 and x =19
		System.out.println("y = --x");
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
		System.out.println("-------------------------------");

		System.out.println("> Conditional Operator");
		String cond = 45>67 ? "45>67" : "45<67";
		System.out.println("Result of condition : "+cond);
		System.out.println("-------------------------------");
		
		System.out.println("> Logical Operator");
		int v1 = 45;
		int v2 = 56;
		System.out.println("Value of v1 : "+v1);
		System.out.println("Value of v2 : "+v2);
		r1 = v1>v2 && v1<v2;
		System.out.println("v1>v2 && v1<v2 : "+r1);
		r1 = v1>v2 || v1<v2;
		System.out.println("v1>v2 || v1<v2 : "+r1);
		r1 = !(v1>v2 && v1<v2);
		System.out.println("!(v1>v2 && v1<v2) : "+r1);
		r1 = !(v1>v2 || v1<v2);
		System.out.println("!(v1>v2 || v1<v2) : "+r1);
		System.out.println("-------------------------------");
		
	}
}
