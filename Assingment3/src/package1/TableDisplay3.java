package package1;

import java.util.Scanner;

public class TableDisplay3 {
	public static void main(String[] args) {
		int sNum,lNum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number :");
		sNum=sc.nextInt();
		System.out.println("Enter Last Number :");
		lNum=sc.nextInt();
		
		sc.nextLine();
		
		int number;
		
		for(number=sNum;number<=lNum;number++) {
			System.out.println("TAble of : " + number);
			for(int i=1;i<=10;i++) {
				System.out.println(number + " X " + i + " = " + (number*i));
			}
			sc.nextLine();
		}
	}
}
