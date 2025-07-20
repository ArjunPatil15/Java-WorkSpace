package package1;

import java.io.IOException;

public class MethodCallStackDemo {
	public static void main(String[] args) {
		System.out.println("Start of main");
		try{
			method1();
		}catch(IOException e) {
			System.out.println("Atlast exception is handled");
		}finally {
			System.out.println("Event done");
		}
		System.out.println("End of main");
	}
	
	static void method1()throws IOException {
		System.out.println("Start of method 1");
		method2();
		System.out.println("End of method 1");
	}
	
	static void method2()throws IOException {
		System.out.println("Start of method 2");
		method3();
		System.out.println("End of method 2");
	}

	static void method3()throws IOException {
		System.out.println("Start of method 3");
		throw new IOException();
		//System.out.println("End of method 3");
	}

}
