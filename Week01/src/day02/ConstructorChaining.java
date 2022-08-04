package day02;

public class ConstructorChaining {
	String name;
	int length;
	String singer;
	int year;
	
	ConstructorChaining(String n){
		this.name = n;
	}
	
	ConstructorChaining(String n,int l){
		this(n);
		this.length = l;
	}
	
	ConstructorChaining(String n,int l,String s,int y){
		this(n,l);
		this.singer = s;
		this.year = y;
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
