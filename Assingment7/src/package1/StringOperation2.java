package package1;

public class StringOperation2 {
	public static void main(String[] args) {
		String s1="Arjun";
		System.out.println(s1);
		
		System.out.println(s1.charAt(3));
		
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.replace('r', 'X'));
		
		System.out.println(s1.equals("arjun"));
		
		System.out.println(s1.equalsIgnoreCase("arjun"));
		
		System.out.println(s1.substring(2));
		
		System.out.println(s1.substring(2, 4));//(start index, nth char)
		
		String s2 = "    Arjun     Patil         ";
		System.out.println(s2.length());
		
		System.out.println(s2.trim().length());
		
		System.out.println(s2.trim());
	}

}
