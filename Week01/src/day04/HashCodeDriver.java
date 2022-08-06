package day04;

public class HashCodeDriver {
	
	public static void main(String[] args) {
		HashCodeClass hc = new HashCodeClass(56);
		System.out.println("v Value is : " + hc.value);
		System.out.println("HashCode Value is : " + hc.hashCode());
	}

}
