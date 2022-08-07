package day05;

public class ThreadStringClass {
	public static void main(String[] args) {
		Thread t1 = new Thread("First Thread");
		t1.start();
		
		System.out.println("Name of String: "+t1.getName());
	}

}
