package package1;

import java.util.Scanner;

public class ArrayHandling1 {
	public static void main(String[] args) {
	
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many ele :");
		n=sc.nextInt();
		
		int [] key = new int[n];
		
		System.out.println("Enter Array Ele :");
		for(int i=0;i<n;i++) {
			System.out.print("Enter Ele :");
			key[i]=sc.nextInt();
		}
		
		System.out.print("Entered Array is :");
		for(int i=0;i<n;i++) {
			System.out.print(key[i] + " ");
		}
		
		int low =key[0];
		
		for(int i=1;i<key.length;i++) {
			if(low>key[i]) {
				low = key[i];
			}
		}
		
		System.out.println("\nLowest Ele in Array is :" + low);
		
		int high =key[0];
		
		for(int i=1;i<key.length;i++) {
			if(high<key[i]) {
				high = key[i];
			}
		}
		
		System.out.println("Highest Ele in Array is :" + high);
		
		int total=0;
		
		for(int i=0;i<key.length;i++) {
			total = total + key[i];
		}
		
		System.out.println("Total of Array Ele is :" + total);
		
		System.out.print("Reverse Array  is :");
		for(int i=key.length-1;i>=0;i--) {
			System.out.print(key[i] + " ");
		}
	}
	
}
