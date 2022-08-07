package day04;
import java.util.*;
public class HashSetIntro {
	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		
		hs1.add(34);
		hs1.add(52);
		hs1.add(89);
		hs1.add(72);
		
		System.out.println("Size of HashSet : "+hs1.size());
		
		for(Object i:hs1) {
			System.out.print(i+" ");
		}
		
	}
}
