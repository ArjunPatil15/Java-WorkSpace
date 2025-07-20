package package1;

@FunctionalInterface
interface MyInterface2{
	int doAddition(int x,int y);
}

interface MyInterface3{
	String display(String name);
}

@FunctionalInterface
interface MyInterface4{
	void display();
}

public class TestLambdaExpression2 {
	public static void main(String[] args) {
		MyInterface2 i1 = (a,b)->{return a+b;};
		
		System.out.println(i1.doAddition(4, 6));
		
		MyInterface3 i2 = (s1)->{return "Hello "+ s1;};
		
		System.out.println(i2.display("Arjun"));
		
		MyInterface4 i4 = ()->{
			System.out.println("Hello");
			System.out.println("Everyoune");
			System.out.println("!!!!!!!!");
		};
		
		i4.display();
	}
}
