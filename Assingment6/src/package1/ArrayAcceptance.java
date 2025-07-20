package package1;

import java.util.Scanner;

public class ArrayAcceptance {
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
	}
}
