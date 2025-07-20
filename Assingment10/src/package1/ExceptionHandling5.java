package package1;

import java.util.Scanner;

class WrongInput extends Exception{
	int number;
	WrongInput(int number){
		this.number = number;
	}
	
	int correctNumber() {
		return -number;
	}
}

public class ExceptionHandling5 {
	public static void main(String[] args) {
		int number;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter positive number");
		number=sc.nextInt();
		
		if(number>0) {
			System.out.println("Thank you for entering positive number");
		}else {
			System.out.println("Pls enter positive number");
			try {
				throw new WrongInput(number);
			}catch(WrongInput w){
				number = w.correctNumber();
				System.out.println("I converted it to positive number");
			}
			
		}
		
		System.out.println("number considered is : "+ number);
	}
}
