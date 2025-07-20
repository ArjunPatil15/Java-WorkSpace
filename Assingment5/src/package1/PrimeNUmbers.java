package package1;

public class PrimeNUmbers {
	public static void main(String[] args) {
		System.out.println("Prime Number from 1 to 100 are : ");
		System.out.print("2 ");
		
		int number=3;
		boolean flag=true;
		int count=1;
		
		while(number<=100) {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					flag=false;
					break;
				}else {
					flag=true;
					continue;
				}
			}
			if(flag==true) {
				count++;
				System.out.print(number + " ");
			}
			number++;
		}
		System.out.println("\nTotal Prime number in rang are : "+count);
	}
}
