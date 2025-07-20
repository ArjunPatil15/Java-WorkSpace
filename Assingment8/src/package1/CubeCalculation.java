package package1;

public class CubeCalculation {
	public static void main(String[] args) {
		System.out.println("Argument Passed is :"+ args[0]);
		
		int number = Integer.parseInt(args[0]);
		
		System.out.println("Cube of Passed Arguments is :"+(number*number*number));
		
	}
}
