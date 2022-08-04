package day02;

public class ConstructorChainingDriver {
	public static void main(String[] args) {
		ConstructorChaining s1 = new ConstructorChaining("Mirrors",4,"Justin Timberlake",2013);
		ConstructorChaining s2 = new ConstructorChaining("Mean",4,"Taylor Swift",2010);
		ConstructorChaining s3 = new ConstructorChaining("One Last Time",3,"Ariana Grande",2017);
		ConstructorChaining s4 = new ConstructorChaining("Bam Bam",4,"Camila Cabello",2022);
		ConstructorChaining s5 = new ConstructorChaining("Lose You to Love Me",3,"Selena Gomez",2011);
		
		s1.songDetails();
		System.out.println("-----------------");
		s2.songDetails();
		System.out.println("-----------------");
		s3.songDetails();
		System.out.println("-----------------");
		s4.songDetails();
		System.out.println("-----------------");
		s5.songDetails();
		System.out.println("-----------------");
	}
}
