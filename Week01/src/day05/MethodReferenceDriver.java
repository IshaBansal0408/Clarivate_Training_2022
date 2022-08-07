package day05;

public class MethodReferenceDriver {
	
	public static void fun1Ref() {
		System.out.println("Hello from method referring to fun1");
	}
	
	public static void main(String[] args) {
		MethodReferenceInterface i1 = MethodReferenceDriver::fun1Ref;
		i1.fun1();
		
	}

}
