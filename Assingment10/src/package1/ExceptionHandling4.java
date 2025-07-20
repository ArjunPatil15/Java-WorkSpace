package package1;

import java.util.Scanner;

class BadFoodException extends Exception{
	
}

public class ExceptionHandling4 {
	public static void main(String[] args) {
		System.out.println("what is there to eat??");
		Scanner sc = new Scanner(System.in);
		String foodName = sc.next();
		
		try {
			checkFood(foodName);
		}catch(BadFoodException be) {
			System.out.println("i dont like this food ");
		}finally {
			System.out.println("Eating done ");
		}
	}
	
	static void checkFood(String foodName) throws BadFoodException {
		if(foodName.equalsIgnoreCase("paneer")) {
			System.out.println("i like this food");
		}else {
			throw new BadFoodException();
		}
	}
}

