package day02;

public class NonStaticMembers {
	//non-static initializer
	{
		System.out.println("Non-static initializer 1");
	}
	//non-static variable
	int x = 20;
	public static void main(String[] args) {
		System.out.println("main() starts");
		 //will give error cuz non-static
		//func1();
		//System.out.println("Value of x : "+x);
		
		// The non static variables and methods are local to variable
		// Hence create an object of the class to access
		NonStaticMembers nsm = new NonStaticMembers();
		nsm.func1();
		System.out.println("Value of x : "+nsm.x);
		System.out.println("main() ends");
	}
	public void func1() {
		System.out.println("You are inside non-static method.");
	}
	{
		System.out.println("Non-static initializer 2");
	}
	{
		System.out.println("Non-static initializer 3");
	}
}
