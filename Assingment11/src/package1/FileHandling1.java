package package1;

import java.io.File;
import java.io.FileWriter;

public class FileHandling1 {
	public static void main(String[] args) throws Exception{
		
		File f1 = new File("MyFile.txt");
		System.out.println(f1.exists());
		
		f1.createNewFile();
		System.out.println(f1.exists());
		
		FileWriter fw = new FileWriter(f1);
		fw.write("i love java becoz java is simple");
		fw.close();
	}

}
