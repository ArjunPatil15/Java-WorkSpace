package package1;

import java.util.ArrayList;
import java.util.Collections;

import utilities.MyUtil;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(12);
		list1.add(23);
		list1.add(43);
		list1.add(32);
		list1.add(53);
		list1.add(65);
		list1.add(24);
		list1.add(14);
		
		System.out.println("List elements are :");
		
//		for(Integer temp : list1) {
//			System.out.println(temp);
//		}
		MyUtil.displayLisr(list1);
		
		Collections.sort(list1);
		
		System.out.println("List Elements are :");
		
//		for(Integer temp : list1) {
//			System.out.println(temp);
//		}
		MyUtil.displayLisr(list1);
		
		ArrayList<String> list2 = new ArrayList<>();
		
		
		list2.add("Arjun");
		list2.add("Adi");
		list2.add("Ram");
		list2.add("Rudra");
		list2.add("Kunal");
		
		System.out.println("List elements are :");
		
//		for(String temp : list2) {
//			System.out.println(temp);
//		}
		MyUtil.displayLisr(list2);
		
		Collections.sort(list2);
		
		System.out.println("List Elements are :");
//		
//		for(String temp : list2) {
//			System.out.println(temp);
//		}
		MyUtil.displayLisr(list2);
		
		ArrayList<Float> list3 = new ArrayList<>();
		list3.add(12.23f);
		list3.add(124.53f);
		list3.add(18.33f);
		
		MyUtil.displayLisr(list3);
	}
}
