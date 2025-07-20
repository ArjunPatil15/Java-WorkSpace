package package1;

abstract class Princi{
	abstract void doOneEvent();
	abstract void doOneMoreEvent();
//	abstract int a=10;
	void method1() {
		System.out.println("Non abstract method in princi");
	}
	
	Princi(){
		System.out.println("Constructor of Princi");
	}
}

abstract class Hod extends Princi{

	@Override
	void doOneEvent() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Staff extends Hod{
	
}

class Student extends Staff{

	@Override
	void doOneMoreEvent() {
		// TODO Auto-generated method stub
		
	}
	
}

public class college {
	public static void main(String[] args) {
		Student s1 = new Student();
//		Hod h1 = new Hod();
	}
}
