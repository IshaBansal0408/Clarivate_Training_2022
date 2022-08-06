package day03;

public class EqualsMethodClass {
	
	int age;
	EqualsMethodClass(int a){
		this.age = a;
	}
	@Override
	public boolean equals(Object o) {
		EqualsMethodClass temp = (EqualsMethodClass)o;
		return this.age == temp.age;
	}

}
