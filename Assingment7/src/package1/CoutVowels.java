package package1;

import java.util.Scanner;

public class CoutVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("Enter any string :");
		str=sc.nextLine();
		
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			count++;
				}
		}
		
		System.out.println("No. of vowels in String :"+ count);
	}
}
