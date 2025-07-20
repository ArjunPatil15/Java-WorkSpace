package package1;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many ele :");
		n=sc.nextInt();
		
		int [] key = new int[n];
		
		System.out.println("Enter Array Ele :");
		for(int i=0;i<n;i++) {
			System.out.print("Enter Ele :");
			key[i]=sc.nextInt();
		}
		
		System.out.print("Entered Array Ele is :");
		for(int i=0;i<n;i++) {
			System.out.print(key[i] + " ");
		}
		
		int element;
		System.out.print("\nWhich ele to search :");
		element=sc.nextInt();
		
		int count=0;
		for(int i=0;i<n;i++) {
			if(key[i]==element) {
				System.out.println("Found at index :" + i);
				count++;
			}			
		}
		System.out.println("Element present for " + count + " times " );
	}
}
