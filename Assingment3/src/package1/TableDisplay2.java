package package1;

import java.util.Scanner;

public class TableDisplay2 {
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number :");
		number=sc.nextInt();
		
		int i=1;
		while(i<=10) {
			System.out.println(number + "X" + i + " = "+(number*i));
			i++;
		}
	}
}
