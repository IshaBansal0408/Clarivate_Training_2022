package day04;

import java.util.*;

public class ArrayListIntro {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(23);
		a1.add("second");
		a1.add(false);
		a1.add(23.5);
		a1.add(23.5);
		a1.add(null);
		a1.add(4,45);
		System.out.println(a1);
		
		System.out.println("Size of array : "+a1.size());
		System.out.println("Get the 2nd index element :"+a1.get(2));
		System.out.println("Check if false in in the list or not : "+a1.contains(false));
		System.out.println("Check if 'first' in in the list or not : "+a1.contains("first"));
		a1.remove(2);
		System.out.println("Remove 2nd element from list : "+a1);
		System.out.println("Is array empty? "+a1.isEmpty());
		System.out.println("Get first occurence of 23.5 : "+a1.indexOf(23.5));
		System.out.println("Get last occurence of 23.5 : "+a1.lastIndexOf(23.5));
		a1.clear();
		System.out.println("After clearing array :"+a1);
		System.out.println("Is array empty? "+a1.isEmpty());
		
		ArrayList A1 = new ArrayList();
		ArrayList A2 = new ArrayList();
		
		for(int i=0;i<=10;i++)
			A1.add(i);
		for(int i=20;i<=30;i++)
			A2.add(i);
		
		System.out.println("A1 : "+A1);
		System.out.println("A2 : "+A2);
		A1.addAll(A2);
		System.out.println("A1 : "+A1);
		A2.add(A1);
		System.out.println("A2 : "+A2);
		
		
		
	}

}
