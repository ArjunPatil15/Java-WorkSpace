package package1;

class TestThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
	}
}

public class TestPriorities {
	public static void main(String[] args) {
		System.out.println("Priority is :"+ Thread.currentThread().getPriority());
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		TestThread t1=new TestThread();
		t1.setName("One");
		t1.setPriority(2);
		TestThread t2=new TestThread();
		t2.setName("Two");
		t2.setPriority(7);
		TestThread t3=new TestThread();
		t3.setName("Three");
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
