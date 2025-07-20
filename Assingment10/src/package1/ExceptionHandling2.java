package package1;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println("Start of main");

		int a=10;
		int b;

		try {
			b= Integer.parseInt(args[0]);
			System.out.println("Division is :"+ a/b);

		}catch(ArithmeticException ae) {
			System.out.println("deno must not be zero");
		}catch(ArrayIndexOutOfBoundsException ab) {
			System.out.println("pls pass arguments");
		}catch(NumberFormatException nme) {
			System.out.println("pls pass argument in proper format");
		}finally {
			System.out.println("mmust execute");
		}


		System.out.println("End of main");
	}
}



