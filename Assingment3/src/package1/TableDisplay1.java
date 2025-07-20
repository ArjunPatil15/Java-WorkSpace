package package1;

import java.util.Scanner;

public class TableDisplay1 {
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number :");
		number=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(number + "X" + i + " = "+(number*i));
		}
		
	}

}
