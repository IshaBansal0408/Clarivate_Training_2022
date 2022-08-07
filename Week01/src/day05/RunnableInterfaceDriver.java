package day05;

public class RunnableInterfaceDriver {
	public static void main(String[] args) {
		RunnableInterfaceClass rt = new RunnableInterfaceClass();
		Thread t1 = new Thread(rt);
		t1.start();
		
	}

}
