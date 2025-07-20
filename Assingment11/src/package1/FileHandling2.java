package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling2 {
	public static void main(String[] args) throws Exception{
		
		File dir = new File("mydir");
		dir.mkdir();
		File f1 = new File(dir,"test.txt");
		f1.createNewFile();
		
		FileWriter fw = new FileWriter(f1);
		fw.write("This is file inside directory");
		fw.close();
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		String s1 = br.readLine();
		System.out.println("file contents are : "+ s1);
		br.close();
		
	}

}
