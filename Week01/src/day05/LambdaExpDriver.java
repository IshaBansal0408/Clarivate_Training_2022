package day05;

public class LambdaExpDriver {
	public static void main(String[] args) {
		String name = "john";
		LambdaExpInterface li =()->
		{
			System.out.println("Name of user is : "+name);
			System.out.println("I am Lambda Function!");
		};
		li.function1();
	}
}
