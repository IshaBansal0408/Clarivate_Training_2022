package day02;

public class ConstructorOverloadingDriver {
	public static void main(String[] args) {
		ConstructorOverloading s1 = new ConstructorOverloading("Mean",4,"Taylor Swift");
		s1.songDetails();
		System.out.println("---------------------------");
		ConstructorOverloading s2 = new ConstructorOverloading("Bam Bam",4);
		s2.songDetails();
		System.out.println("---------------------------");
	}

}
