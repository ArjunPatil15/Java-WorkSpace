package package1;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread name is : "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread name is : "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class TestMultithreading {
 public static void main(String[] args) {
	 MyRunnable r1 = new MyRunnable();
	 Thread t2=new Thread(r1);
	 t2.setName("MyRunnable");
	 t2.start();
	 
	 
	MyThread t1 = new MyThread();
	System.out.println(t1.isAlive());
	
	t1.setName("My thread");
	t1.start();
	System.out.println(t1.isAlive());
	
	for(int i=1;i<=10;i++) {
		System.out.println("Thread name is : "+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
}
