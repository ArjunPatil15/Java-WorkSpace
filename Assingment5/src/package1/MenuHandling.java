package package1;

import java.util.Scanner;

public class MenuHandling {
	public static void main(String[] args) {

		int choice ;
		String str=null;
		
		int num1,num2,result,quo,rem;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Menu\n1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.EXIT\nEnter your choice :");
			choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter number 1 :");
				num1=sc.nextInt();
				System.out.println("Enter number 2 :");
				num2=sc.nextInt();
				result=num1+num2;
				System.out.println("Result is :"+ result);
				break;
			case 2:
				System.out.println("Enter number 1 :");
				num1=sc.nextInt();
				System.out.println("Enter number 2 :");
				num2=sc.nextInt();
				result=num1-num2;
				System.out.println("Result is :"+ result);
				break;
			case 3:
				System.out.println("Enter number 1 :");
				num1=sc.nextInt();
				System.out.println("Enter number 2 :");
				num2=sc.nextInt();
				result=num1*num2;
				System.out.println("Result is :"+ result);
				break;
			case 4:
				System.out.println("Enter number 1 :");
				num1=sc.nextInt();
				System.out.println("Enter number 2 :");
				num2=sc.nextInt();
				quo=num1/num2;
				rem=num1%num2;
				System.out.println("quo is :"+ quo);
				System.out.println("rem is :"+ rem);
				break;
			case 5:
				System.out.println("Thankyou for using Claculator");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter valid choice ");

			}
			System.out.println("Do you want to continue (y/n):");
			str=sc.next();
		}while(str.equals("y"));
	}
}
