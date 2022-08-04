package day01;

public class LoopingIntro {
	public static void main(String[] args) {
		//for loop
		System.out.println("Forward Loop");
		for(int i=1;i<=5;i++) {
			System.out.println("Value of i : "+i);
		}
		System.out.println("-------------------------------");
		System.out.println("Backword Loop");
		for(int i=5;i>0;i--) {
			System.out.println("Value of i : "+i);
		}
		System.out.println("-------------------------------");
		
		//while loop
		System.out.println("WHILE LOOP");
		int i = 6;
		while(i<=6) {
			System.out.println("Value of i : " + i);
			i++;
		}
		
		//do-while loop
		i=6;
		do {
			System.out.println("Value of i : "+i);
			i--;
		}while(i>0);
		System.out.println("-------------------------------");
		
		//nested for loop
		for(int x=1;x<=3;x++) {
			for(int y=3;y>=0;y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
	}

}
