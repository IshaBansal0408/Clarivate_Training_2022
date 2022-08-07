package day04;

import java.util.*;

public class ArrayIteratorClass {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		for(int i=0;i<10;i++)
			a1.add(i);
		
		Iterator i = a1.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		ArrayList a2 = new ArrayList();
		for(int i1=20;i1<30;i1++)
			a2.add(i1);
		
		ListIterator i1 = a2.listIterator();
		
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");
		}
		System.out.println();
		
		while(i1.hasPrevious()) {
			System.out.print(i1.previous()+" ");
		}
		System.out.println();
			
	}
	

}
