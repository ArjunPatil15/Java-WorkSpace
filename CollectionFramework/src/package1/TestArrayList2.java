package package1;

import java.util.ArrayList;
import java.util.Collections;

import utilities.MyUtil;

public class TestArrayList2 {
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<>();
		
		sList.add(new Student(18,"Virat", 9.8f));
		sList.add(new Student(7,"MS", 8.4f));
		sList.add(new Student(45,"Rohit", 7.2f));
		sList.add(new Student(21,"Rahul", 9.2f));
		sList.add(new Student(77,"Gill", 6.2f));
		
		System.out.println("List of Student is :");
		
		MyUtil.displayLisr(sList);
		
//		Collections.sort(sList);
		
		System.out.println("List of Student is :");
		
//		MyUtil.displayLisr(sList);
		
		//comparable for natural order sorting 
		//comparator for our own object sorting
		
		Collections.sort(sList,new SortByRollNumber());
		MyUtil.displayLisr(sList);
		System.out.println("-----------------------------");
		
		Collections.sort(sList,new SortByName());
		MyUtil.displayLisr(sList);
		System.out.println("-----------------------------");
	}
}
