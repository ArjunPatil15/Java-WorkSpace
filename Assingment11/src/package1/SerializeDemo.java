package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	transient int rollNumber;
	String name;
}

public class SerializeDemo {
	public static void main(String[] args)throws Exception {
		Student s1 = new Student();
		s1.rollNumber = 7;
		s1.name = "Arjun";
		
		System.out.println("Object Before Serialization :");
		System.out.println("RollNummber : "+ s1.rollNumber);
		System.out.println("Name : " + s1.name);
		System.out.println("---------------------------------");
		
		File f1 = new File("serial.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.close();
		
		System.out.println("Object Serialized");
		System.out.println("---------------------------------");
		
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s2;
		s2 = (Student)ois.readObject();
		ois.close();
		
		System.out.println("Object Deserialization :");
		System.out.println("RollNummber : "+ s2.rollNumber);
		System.out.println("Name : " + s2.name);
		System.out.println("---------------------------------");
		
		
	}

}
