package package1;

class OuterClass2{
	
	static int number= 7;
	
	static class StaticInnerClass{
		
		void method1() {
			System.out.println("Number is : " + number);
		}
	}
}


public class TestStaticInnerClass {
	public static void main(String[] args) {
		System.out.println(OuterClass2.number);

		OuterClass2.StaticInnerClass ic = new OuterClass2.StaticInnerClass();
		
		ic.method1();
	}
}
