package package1;

public class String1 {
	public static void main(String[] args) {
		String s1 = "Arjun";
		String s2;
		s2= s1;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("*********");
		
		s2=s2.concat(" Patil");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("*********");
		
		StringBuffer sb1 =new StringBuffer("Arjun");
		StringBuffer sb2;
		sb2=sb1;
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println("*********");
		
		sb2.append(" Pune");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println("*********");
		

	}
}
