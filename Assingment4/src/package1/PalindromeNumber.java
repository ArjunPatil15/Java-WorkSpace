package package1;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number;
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter any numbern: ");
		number=sc.nextInt();
		
		System.out.println("Number is : "+ number);
		
		
		int temp ,quo,rem;
		int reverse=0;
		temp=number;
		
		while(temp>0) {
			quo=temp/10;
			rem=temp%10;
			reverse = (reverse * 10) +rem;
			temp=quo;
		}
		System.out.println("Reverse Number is :"+ reverse);
		
		if(number==reverse) {
			System.out.println("wow :Its a palindrome");
		}else {
			System.out.println("Sorry :Its not a palindrome");
		}
		
	}

}
