package package1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TestLambdaExpression3 {
	public static void main(String[] args) {
		ArrayList<String> friends = new ArrayList<>();
		friends.add("Arjun");
		friends.add("Ram");
		friends.add("Kunal");
		friends.add("Rohit");
		friends.add("Sahil");
		friends.add("Vishal");
		friends.add("Amey");
		friends.add("Rudra");
		
		System.out.println(friends);
		
		System.out.println("-----------------------");
		
		System.out.println("List with enhanced for loop");
		
		for(String x : friends) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		
		System.out.println("List with Lambda Expression");
		
		friends.forEach((item)->{System.out.println(item);});
		
		System.out.println("-----------------------");
		System.out.println("List using Consumer Interface and Lambda Expression");
		
		Consumer<String> flist = (item)->{System.out.println(item);};
		
		friends.forEach(flist);
	}
}
