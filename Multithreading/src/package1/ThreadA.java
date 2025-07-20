package package1;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b= new ThreadB();
		b.start();
		
		synchronized(b) {
			System.out.println("I am waiting for your calcilation to get over.....");
		
			
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Total of calculation is :"+b.total);
	}
}

class ThreadB extends Thread{
	int total ;
	
	public void run() {
		
		synchronized(this) {
		
			for(int i=1;i<=10;i++) {
				total =total +i;
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			System.out.println("My calculations are over. pls print result");
			notify();
		}
	}
}