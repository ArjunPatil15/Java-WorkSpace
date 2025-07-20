package package1;

 abstract class Myclass{
	abstract void method();
}

 interface Eatable{
	 void eat();
 }
 
public class TestAnonymousClass {
	public static void main(String[] args) {
		Myclass m1 = new Myclass() {
			
			@Override
			void method() {
				// TODO Auto-generated method stub
				System.out.println("I am inside Anonymous class");
			}
		};
		
		m1.method();
		
		Eatable e1 = new Eatable() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("I am Eatable Interface implementer");
			}
		};
		
		e1.eat();
	}
}
