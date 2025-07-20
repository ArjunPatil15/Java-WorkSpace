package package1;

import java.util.Enumeration;
import java.util.Vector;

public class TestCollections {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		
		v1.add(12);
		v1.add(4);
		v1.add(64);
		v1.add(23);
		v1.add(78);
		v1.add(61);
		v1.add(32);
		v1.add(5);
		
		System.out.println(v1.size());
		
		System.out.println("Elements of vector");
		
		for(Integer temp : v1) {
			System.out.print(temp + " ");
		}
		
		Vector<Integer> v2 = new Vector<>();
		v2.add(3);
		v2.add(1);
		v2.add(2);
		
		System.out.println("\n\n" + v2.size());
		
		System.out.println("Elements of vector");
		
		for(Integer temp : v2) {
			System.out.print(temp + " ");
		}
		
		Enumeration<Integer> e1 = v1.elements();
		
		System.out.println("\nVector elements are :");
		
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}
}
