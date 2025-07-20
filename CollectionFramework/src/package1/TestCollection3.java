package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class TestCollection3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(23);
		list1.add(3);
		list1.add(13);
		list1.add(43);
		list1.add(12);
		list1.add(35);
		list1.add(56);
		
		System.out.println("Array list  is : ");
		
		for(Integer temp : list1) {
			System.out.println(temp);
		}
		
		System.out.println("----------------------");
		System.out.println("Using Enumeration");
		
		Enumeration<Integer> e1 = Collections.enumeration(list1);
		
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
		System.out.println("----------------------");
		System.out.println("Using Iterator");
		
		Iterator<Integer> itr = list1.iterator();
		
		while(itr.hasNext()) {
			Integer i1 = itr.next();
			System.out.println("Element is : "+ i1 + " at Index : "+ list1.indexOf(i1));
			System.out.println("Size of List is : "+ list1.size());
//			itr.remove();
		}
		
		System.out.println("----------------------");
		System.out.println("Using ListIterator");
		
		ListIterator<Integer> ltr2 = list1.listIterator(3);
		
		while(ltr2.hasPrevious()) {
			Integer i1 = ltr2.previous();
			System.out.println("element is : "+ i1);
		}
	}
}
