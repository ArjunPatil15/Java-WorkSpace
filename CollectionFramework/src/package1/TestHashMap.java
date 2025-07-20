package package1;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> h1 = new HashMap<>();
		
		h1.put(101, "Arjun");
		h1.put(102, "Rahul");
		h1.put(103, "Karan");
		h1.put(104, "Om");
		h1.put(104, "Rudra");
		h1.put(105, "Aftab");
		h1.put(106, "Sahil");
		h1.put(107, "Soham");
		h1.put(108, "Arjun1");
		h1.put(109, "Rahul1");
		h1.put(110, "Karan1");
		h1.put(111, "Om1");
		h1.put(112, "Rudra1");
		h1.put(113, "Aftab1");
		h1.put(114, "Sahil1");
		h1.put(115, "Soham1");
		
		System.out.println(h1);
		
		for(Map.Entry<Integer, String>entry : h1.entrySet()) {
			System.out.println("Key is : "+entry.getKey() + " Value is : "+ entry.getValue());
		}
		
	}
}
