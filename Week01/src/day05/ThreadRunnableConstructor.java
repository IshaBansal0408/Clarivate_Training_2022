package day05;

public class ThreadRunnableConstructor implements Runnable{
	public void run() {
		System.out.println("Thread is in running state...");
	}
	public static void main(String[] args) {
		Runnable tr1 = new ThreadRunnableConstructor();
		Thread t1 =  new Thread(tr1);
		t1.start();
		System.out.println("Name of Thread : "+t1.getName());
		Runnable tr2 = new ThreadRunnableConstructor();
		Thread t2 =  new Thread(tr2,"Runnable Tread");
		t2.start();
		System.out.println("Name of Thread : "+t2.getName());
	}
}
