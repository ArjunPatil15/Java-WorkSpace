package package1;

public class TestWrappers {
	public static void main(String[] args) {
		
		Character c1 = new Character('A');
		System.out.println(c1);
		
		Byte b1 = new Byte((byte)123);
		System.out.println(b1);
		System.out.println(b1.MAX_VALUE);
		System.out.println(b1.MIN_VALUE);
		
		Integer i1 =new Integer(123);
		System.out.println(i1);
		System.out.println(i1.MAX_VALUE);
		System.out.println(i1.MIN_VALUE);
		
		Double d1 = new Double("1.23");
		System.out.println(d1);
		
		Boolean b2 = new Boolean(true);
		System.out.println(b2);
		
		
		//Integer i2 = new Integer("arjun");   number format exeption
		
		Boolean b3 = new Boolean("arjun");
		System.out.println(b3);
		
	}

}
