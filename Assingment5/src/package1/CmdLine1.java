package package1;

public class CmdLine1 {
	public static void main(String[] args) {
		System.out.println("With simple for Loop");
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]+" ");
		}
		
		System.out.println("\n\nWith enhanced for Loop");
		
		for(String x: args) {
			System.out.println(x);
		}
	}

}
