package package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHandling1 {
	public static void main(String[] args)throws Exception {
		int [] key =new int [5];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Elements :");
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter elements :");
			key[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Array Elements are :");
		
		for (int x: key) {
			System.out.println((x));
		}
	}
}
