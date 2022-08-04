package day01;

public class SwitchIntro {
	public static void main(String[] args) {
		int i = 3;
		
		System.out.println("WITHOUT USING break STATEMENT");
		switch(i) {
		case 1:{
			System.out.println("Case 1 working");
		}
		case 2:{
			System.out.println("Case 2 working");
		}
		case 3:{
			System.out.println("Case 3 working");
		}
		default:{
			System.out.println("Default case working");
		}
		System.out.println("-------------------------------");
		
		System.out.println("USING break STATEMENT");
		}
		switch(i) {
		case 1:{
			System.out.println("Case 1 working");
		}break;
		case 2:{
			System.out.println("Case 2 working");
		}break;
		case 3:{
			System.out.println("Case 3 working");
		}break;
		default:{
			System.out.println("Default case working");
		}break;
		}
		System.out.println("-------------------------------");
		
		System.out.println("Grouping OF SWITCH CASE");
		char ch = 'i';
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		{
			System.out.println("ch is a vowel!");
		}break;
		default:{
			System.out.println("ch is not a vowel!");
		}
		}
		System.out.println("-------------------------------");
	}
}
