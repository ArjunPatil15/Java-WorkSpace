package package1;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		int line;
		
		Scanner sc =new Scanner(System.in);
		System.out.print("How many lines :");
		line=sc.nextInt();
		
		System.out.println(" Image ");
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			for(int k=line;k>i;k--) {
				System.out.print("  ");
			}
			System.out.println();
					
		}
		
		System.out.println();
		System.out.println(" Mirror Image");
		for(int i=1;i<=line;i++) {
			
			for(int k=line;k>i;k--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
					
		}
		
		
	}
}
