package package1;

interface Eatable{
	void eat();	
}

class Animal implements Eatable{

	@Override
	public void eat() {
		System.out.println("Animal Eats");
	}
	
	void run() {
		System.out.println("Animal Runs");
	}
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("Dog Eat Pedegree");
	}
	
	void run() {
		System.out.println("Dog Runs Fast");
	}
	
	void bark() {
		System.out.println("Dog Barks");
	}
}

public class TestPolymorphism2 {
	public static void main(String[] args) {
		
		//case 1
		Animal a1 =  new Animal();
		a1.eat();
		a1.run();
		System.out.println("----------------------------");
		
		//case 2
		Dog d1 = new Dog();
		d1.eat();
		d1.run();
		d1.bark();
		System.out.println("----------------------------");
		
		//case 3
	//	Dog d2 = new Animal();
		
		//case 4
		//dynamic polymorphism
		Animal a2= new Dog();
		a2.eat();
		a2.run();
		System.out.println("----------------------------");
		
		//case 5
		Eatable e1 = new Animal();
		e1.eat();
		System.out.println("----------------------------");
		
		
		//case 6
		Eatable e2 = new Dog();
		e2.eat();
		System.out.println("----------------------------");
	}

}
