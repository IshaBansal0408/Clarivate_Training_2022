package day05;

public class ExceptionHandling06 {
	public static void main(String[] args) {
		try {
			divison();
		}catch(Exception e) {
			System.out.println("Exception found");
		}
	}
	public static void divison() {
		System.out.println(13/0);
	}
}