package package1;

class Myadder{
	int add(int a,int b) {
		int r;
		r=a+b;
		return r;
	}
	
	int add(int a,int b,int c){
		int r;
		r=a+b+c;
		return r;
	}
	
	double add(double d1,double d2) {
		double r;
		r=d1+d2;
		return r;
	}
	
	String add(String s1, String s2) {
		return  s1 + s2;
	}
	
}

public class TestPolymorphism {
	public static void main(String[] args) {
		Myadder m1 =new Myadder();
		int result = m1.add(4, 5);
		System.out.println("Addition is : "+ result);
		System.out.println("Addition is : "+ m1.add(5, 6, 7));
		System.out.println("Addition is : "+ m1.add(1.23, 2.34));
		System.out.println("Concat is : "+ m1.add("Arjun ", "Patil"));
		
	}
}
