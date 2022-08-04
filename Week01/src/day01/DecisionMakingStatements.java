package day01;

public class DecisionMakingStatements {
	public static void main(String[] args) {
		// if statement
		int age = 20;
		if(age>18){
			System.out.println("Age is greater than 18");
		}
		//else statement
		age = 16;
		if(age>18){
			System.out.println("Age is greater than 18");
		}
		else {
			System.out.println("Age is less than 18");
		}
		//if-else-if ladder
		age = 8;
		if(age==10){
			System.out.println("Age equal to 10");
		}
		else if(age<10) {
			System.out.println("Age is less than 10");
		}
		else {
			System.out.println("Age is greater than 10");
		}
	}

}
