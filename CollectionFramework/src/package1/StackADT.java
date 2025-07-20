package package1;

import java.util.Stack;

public class StackADT {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		
		System.out.println(s1.empty());
		
		s1.push(23);
		s1.push(22);
		s1.push(35);
		s1.push(52);
		s1.push(43);
		s1.push(63);
		System.out.println("Staxck sixe is : " + s1.size());
		System.out.println("Top Element is : "+ s1.peek());
		System.out.println("Stack Size : "+s1.size());
		System.out.println("Top Element is : "+ s1.peek());
		System.out.println("Stack Size : "+s1.size());
		
		System.out.println("Element Searching 22 "+ s1.search(22));
		
		System.out.println("Stack elements are :");
		
		while(!s1.empty()) {
			System.out.println(s1.pop());
		}
		

		
	}
}
