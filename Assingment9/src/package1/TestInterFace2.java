package package1;

//Marker interface
interface Week{
	int MONDAY =1;
	int TUESDAY =2;
	int WEDNESDAY =3;
}

class Day implements Week{
	void showDay(int number) {
		switch(number) {
		case MONDAY:
			System.out.println("day 1 is monday");
			break;
		case TUESDAY:
			System.out.println("day 2 is tuesday");
			break;
		case WEDNESDAY:
			System.out.println("day 3 is wednesday");
			break;
		default:
			System.out.println("enter number between 1 to 7");
			break;
		}
	}
}


public class TestInterFace2 {
	public static void main(String[] args) {
		Day d1 =new Day();
		d1.showDay(4);
	}
}
