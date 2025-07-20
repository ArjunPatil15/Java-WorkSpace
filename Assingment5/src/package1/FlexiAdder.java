package package1;

public class FlexiAdder {
	public static void main(String[] args) {
		
		int result;
		
		result = doAddition(5,6);
		System.out.println("Result is : "+ result);
		
		result = doAddition();
		System.out.println("Result is : "+ result);
		
		result = doAddition(1,2,3,4,5,6,7,8,9);
		System.out.println("Result is : "+ result);
		
	}

	static int doAddition(int...a) {
		int r=0;
		for(int i=0;i<a.length;i++) {
			r=r+a[i];
		}
		return r;
	}
}
