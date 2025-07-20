package package1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int terms;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("How many terms :");
		terms =sc.nextInt();
		
		int n1=0;
		int n2=1;
		int n3;
		
		System.out.print(n1 +" "+ n2);
		
		for(int i=3;i<=terms;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
