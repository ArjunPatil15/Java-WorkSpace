package package1;

interface MyInterface{
//	always public and abstract
	void display();
}

class MyClass implements MyInterface{
	public void display() {
		System.out.println("Success is Always with basics");
	}
}


public class TestLambdaExpression1 {
	public static void main(String[] args) {
		//implementation class
		MyInterface i1 = new MyClass();
		i1.display();
		System.out.println("-------------");
		
		//anonymous class
		MyInterface i2 = new MyInterface() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("This implementation is with Anonymous class");
			}
		};
		i2.display();
		System.out.println("------------------");
		
		//lambda expression
		MyInterface i3 = ()->{System.out.println("Implementation with Lambda expression");};
		i3.display();
	}
	
}
