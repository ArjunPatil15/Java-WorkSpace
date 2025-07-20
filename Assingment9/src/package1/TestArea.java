package package1;

interface Area{
	float PI_Value = 3.14f;
	
	double computeArea(int...a);
	void displayArea(double area);
}

class Rectangle implements Area{

	@Override
	public double computeArea(int... a) {
		double area;
		area = a[0]*a[1];
		return area;
	}

	@Override
	public void displayArea(double area) {
		System.out.println("Area of Rectangle :" + area);
	}
	
}

class Circle implements Area{

	@Override
	public double computeArea(int... a) {
		double area;
		area = PI_Value * a[0] *a[0];
		return area;
	}

	@Override
	public void displayArea(double area) {
		System.out.println("Area of Circle :"+ area);
	}
	
}

public class TestArea {
	public static void main(String[] args) {
		double result;
		
		Circle c1 = new Circle();
		result = c1.computeArea(10);
		c1.displayArea(result);
		
		Rectangle r1 = new Rectangle();
		result = r1.computeArea(10,20);
		r1.displayArea(result);
	}
}
