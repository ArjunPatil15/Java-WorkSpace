package package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Editor {
	public static void main(String[] args)throws Exception {
		String[] lines = new String[50];
		
		System.out.println("enter string in editor (stop to end input ):");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i =0 ; i<lines.length;i++) {
			lines[i]=br.readLine();
			if(lines[i].equalsIgnoreCase("stop")) {
				break;
			}
		}
		
		System.out.println("Editors contents are :");
		for(String x : lines) {
			if(x.equalsIgnoreCase("stop")) {
				break;
			}
			System.out.println(x);
		}
	}

}
