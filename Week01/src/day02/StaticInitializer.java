package day02;

public class StaticInitializer {
	//executes before main method
	static {
		System.out.println("Initializer 1 executes");
	}
	static {
		System.out.println("Initializer 2 executes");
	}
	public static void main(String[] args) {
		System.out.println("Main function starts");
	}
	
	static {
		System.out.println("Initializer 3 executes");
	}
	
	static {
		System.out.println("Initializer 4 executes");
	}
	
}
