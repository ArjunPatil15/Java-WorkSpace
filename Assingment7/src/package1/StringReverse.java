package package1;

import java.util.Scanner;

public class StringReverse {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str;
	
	System.out.print("Enter any string :");
	str=sc.next();
	System.out.println("Entered string is :"+ str);
	
	String revStr;
	
	revStr=reverse(str);
	
	if(str.equals(revStr)) {
		System.out.println("WOW : Its palindrome");
	}else {
		System.out.println("Sorry its not palindrome");
	}
	
}
 
 static String reverse(String str) {
	 String revStr = "";
	 for(int i=str.length()-1;i>=0;i--) {
		 revStr = revStr + str.charAt(i);
	 }
	 System.out.println("Reverse String is :"+ revStr);
	 return revStr;
 }
}
