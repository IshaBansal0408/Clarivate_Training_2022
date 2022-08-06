package day03;

public class MethodOverridingChild extends MethodOverridingParent{
	int sAge = 23;
	@Override
	public void marry() {
		System.out.println("I will marry Jane.");
	}

}
