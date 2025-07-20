package package1;

import java.util.Scanner;

public class LargestNumber {
 public static void main(String[] args) {
	int num1,num2,num3;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number 1 :");
	num1=sc.nextInt();
	System.out.println("Enter number 2 :");
	num2=sc.nextInt();
	System.out.println("Enter number 3 :");
	num3=sc.nextInt();
	
	
	if((num1>num2)&&(num1>num3)) {
		System.out.println("Largest num is :" + num1);
	}else if((num2>num1)&&(num2>num3)) {
		System.out.println("Largest num is :" + num2);
	}else {
		System.out.println("Largest num is :" + num3);
	}
	
	int temp=0;

	temp=(num1>num2)?num1:num2;

	int result=0;

	result=(temp>num3)?temp:num3;

	System.out.println("Largest num is :" + result);
}
}

