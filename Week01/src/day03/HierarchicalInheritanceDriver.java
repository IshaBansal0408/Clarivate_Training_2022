package day03;

public class HierarchicalInheritanceDriver {
	public static void main(String[] args) {
		//create object of son
		HierarchicalInheritanceChild01 son = new HierarchicalInheritanceChild01();
		
		//create object of daughter
		HierarchicalInheritanceChild02 daughter = new HierarchicalInheritanceChild02();
		
		System.out.println("Name of father through son : "+son.parentName);
		System.out.println("Name of father through daughter : "+daughter.parentName);
	}

}
