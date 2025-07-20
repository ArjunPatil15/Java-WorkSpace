package package1;

import java.util.Scanner;

public class StringOperation5 {
	public static void main(String[] args) {
		
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first string :");
		str1=sc.next();
		System.out.println("enter secound string :");
		str2=sc.next();
		
		System.out.println("enter character :");
		char element = sc.next().charAt(0);
		
		System.out.println("Character for separation is : "+ element);
		
		int i=0;
		for(i=0;i<str1.length();i++) {
			if(str1.charAt(i)==element) {
				break;
			}
		}
		
		System.out.println("element found at :"+ i);
		
		String subpart="";
		
		subpart =str1.substring(i+1);
		str1=str1.substring(0,i+1);
		
		String newString = str1 +str2 +subpart;
		
		System.out.println("Output String is :"+ newString);
				
	}
}
