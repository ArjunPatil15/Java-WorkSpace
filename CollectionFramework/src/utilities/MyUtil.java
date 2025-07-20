package utilities;

import java.util.ArrayList;
import java.util.Iterator;

public class MyUtil {
	public static <E> void displayLisr(ArrayList<E> anyList) {
		
		for(E temp : anyList) {
			System.out.println(temp);
		}
	}
}
