package day04;
import java.util.*;
public class TreeSetIntro {
	public static void main(String[] args) {
		TreeSet ts1 = new TreeSet();
		
		ts1.add(34);
		ts1.add(2);
		ts1.add(45);
		ts1.add(89);
		ts1.add(12);
		ts1.add(64);
		
		for(Object i:ts1) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
