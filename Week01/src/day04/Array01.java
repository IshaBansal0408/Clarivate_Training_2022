package day04;

public class Array01 {
	public static void main(String[] args) {
		//method 1
		int[] a = new int[6];
		a[4] = 34;
		a[2] = 12;
		a[5] = 23;
		//address of array
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[5]);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//method 2
		int[] a1 = {2,3,45,42,12};
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
	}

}
