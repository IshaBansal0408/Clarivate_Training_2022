package day05;

public class ThreadExample extends Thread{
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("Element value : "+i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		ThreadExample t = new ThreadExample();
		t.start();
	}

}
