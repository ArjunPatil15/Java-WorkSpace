package package1;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		int line;
		Scanner sc =new Scanner(System.in);
		System.out.print("How many lines :");
		line = sc.nextInt();
		
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
