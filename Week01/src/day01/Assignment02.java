package day01;

public class Assignment02 {
	public static void main(String[] args) {
		//salary validation
		double salary = 47000;
		if(salary>100000) {
			System.out.println("Wrong salary! Error!");
		}
		else if(salary<=100000 && salary>50000) {
			System.out.println("Manager");
		}
		else if(salary<=50000 && salary>25000) {
			System.out.println("Developer");
		}
		else if(salary<=25000 && salary>10000) {
			System.out.println("Tester");
		}
		else {
			System.out.println("Helper");
		}		
	}

}
