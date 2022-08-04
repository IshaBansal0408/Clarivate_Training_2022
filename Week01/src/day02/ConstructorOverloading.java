package day02;

public class ConstructorOverloading {
	String name;
	int length;
	String singer;
	int year;
	
	ConstructorOverloading(String name,int length){
		this.name = name;
		this.length = length;
	}
	ConstructorOverloading(String name,int length,String singer){
		this.name = name;
		this.length = length;
		this.singer = singer;
	}
	
	public void songDetails() {
		System.out.print("Name of song : ");
		System.out.print(name);
		System.out.println();
		
		System.out.print("Length of song (in min) : ");
		System.out.print(length);
		System.out.println();
		
		System.out.print("Singer of song : ");
		System.out.print(singer);
		System.out.println();
		
		System.out.print("Year of song Release : ");
		System.out.print(year);
		System.out.println();
	}

}
