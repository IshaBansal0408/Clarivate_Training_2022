package day01;

public class Assignment01 {
	public static void main(String[] args) {
		//marks validation
		int marks = 56;
		if(marks>100) {
			System.out.println("Wrong marks! Error!");
		}
		else if(marks<=100 && marks>81) {
			System.out.println("Distinct");
		}
		else if(marks<=80 && marks>35) {
			System.out.println("First Class");
		}
		else {
			System.out.println("Opps:( Fail");
		}
	}

}
