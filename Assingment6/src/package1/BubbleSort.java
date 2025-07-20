package package1;

import java.util.Scanner;

public class BubbleSort {
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
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(key[j]>key[j+1]) {
					int temp;
					temp = key[j];
					key[j]=key[j+1];
					key[j+1]=temp;
				}
			}
		}
		System.out.print("\nSorted Array in Ascending order is :");
		for(int i=0;i<n;i++) {
			System.out.print(key[i] + " ");
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(key[j]<key[j+1]) {
					int temp;
					temp = key[j];
					key[j]=key[j+1];
					key[j+1]=temp;
				}
			}
		}
		System.out.print("\nSorted Array in Descending order is :");
		for(int i=0;i<n;i++) {
			System.out.print(key[i] + " ");
		}
		
	}
}
