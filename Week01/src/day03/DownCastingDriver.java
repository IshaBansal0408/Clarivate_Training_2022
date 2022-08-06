package day03;

public class DownCastingDriver {
	public static void main(String[] args) {
		
		//downCasting
		// parent explicitly converted to child
		
		DownCastingParent p = new DownCastingChild();
		DownCastingChild c = (DownCastingChild) p;
		
		System.out.println("Downcasting value of a in Child : "+c.xChild);
		System.out.println("Downcasting value of a in Parents : "+c.xParent);
	}

}
