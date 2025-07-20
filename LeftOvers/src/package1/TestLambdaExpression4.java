package package1;

import java.util.ArrayList;
import java.util.List;

public class TestLambdaExpression4 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		a1.add(9);
		a1.add(10);
		
		System.out.println("Array List is :");
		System.out.println(a1);
		System.out.println("---------------------");
		
		a1.forEach((item)->{System.out.print(item + " ");});
		System.out.println("\n---------------------");
		
		List<Integer>newList = a1.stream().map((x)->x*x).toList();
		System.out.println(newList);
		System.out.println("----------------------");
		
		List<Integer> evenList= a1.stream().filter((x)->x%2==0).toList();
		System.out.println(evenList);
		System.out.println("----------------------");
	
		int sumofAll = a1.stream().reduce(0, Integer::sum);
		
		System.out.println("Sum of List Elements is : "+ sumofAll);
	}
}
