package package1;

public class CmdLine2 {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i+=2) {
			System.out.print(args[i]+ " ");		
		}
		System.out.println();
		
		for(int i=1;i<args.length;i+=2) {
			System.out.print(args[i] + " ");		
		}
		
		
	}

}
