package package1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		short number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number :");
		number =sc.nextShort();
		
		short factorial=1;
		
		while(number>=1) {
			factorial= (short)(factorial*number);
			number--;
		}
		System.out.println("Factorial is :"+ factorial);
	}
}
