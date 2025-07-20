package package1;

interface Flyable{
	void fly();
}

class Airplane implements Flyable{

	@Override
	public void fly() {
		System.out.println("I run fast and then fly");
		
	}
	
}

class Helicopter implements Flyable{

	@Override
	public void fly() {
		System.out.println("I use helipad to take off");
	}
	
}

class Kite implements Flyable{

	@Override
	public void fly() {
		System.out.println("My flying is different");
	}
	
}

public class TestInterFace {
	public static void main(String[] args) {
		
	}
}
