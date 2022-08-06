package day03;

public class MultiLevelInheritanceDriver {
	
	public static void main(String[] args) {
		// create the child class - can access son, father and grandfather
		MultiLevelInheritanceChild son = new MultiLevelInheritanceChild();
		
		// create the father class - can access father and grandfather
		MultiLevelInheritanceSubParent father = new MultiLevelInheritanceSubParent();
		
		// create the grandfather class - can access only grandfather
		MultiLevelInheritanceParent grandfather = new MultiLevelInheritanceParent();
		
		System.out.println("Name of Grandfather through son - "+son.grandfatherName);
		System.out.println("Name of Grandfather through father - "+father.grandfatherName);
		System.out.println("Name of Grandfather through grandfather - "+grandfather.grandfatherName);
		System.out.println();
		
		System.out.println("Age of father through son - "+son.fatherAge);
		System.out.println("Age of father through father - "+father.fatherAge);
//Error-System.out.println("Age of father through grandfather - "+grandfather.fatherAge);
		System.out.println();
		
		System.out.println("Name of son through son - "+son.childName);
//Error-System.out.println("Name of son through grandfather - "+grandfather.childName);
	}
	
}
