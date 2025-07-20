package package1;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		number=sc.nextInt();
		
		System.out.println("Factors of number are :");
		
		for(int i =1;i<=number/2;i++) {
			if(number%i==0) {
				System.out.print(" " + i);
			}
		}
		System.out.print(" " + number);
	}
}
