package day03;

public class SingleInheritanceDriver {
	public static void main(String[] args) {
		
		//create a child class
		SingleInheritanceChild child = new SingleInheritanceChild();
		
		// call parent class attributes and methods
		System.out.println("Name of Father : "+child.fatherName);
		System.out.println("Age of Father : "+child.fatherAge);
		System.out.println("Messaage from father...");
		child.fatherMessage();
		
		System.out.println();
		
		// call child class attributes and methods
		System.out.println("Name of Son : "+child.sonName);
		System.out.println("Age of Son : "+child.sonAge);
		System.out.println("Messaage from son...");
		child.sonMessage();;
	}

}
