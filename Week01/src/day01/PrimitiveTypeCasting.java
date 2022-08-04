package day01;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		//widening
		// convert float to double
		System.out.println("WIDENING");
		float f1 = 0.3f;
		double d1 = f1;
		System.out.println("Float value is : "+f1);
		System.out.println("Double value is : "+d1);
		
		//narrowing
		//typecast operator
		//convert double to int
		System.out.println("NARROWING");
		double d2 = 45.23;
		int i1 = (int)d2;
		System.out.println("Double value : "+d2);
		System.out.println("Int value : "+i1);
		
	}

}
