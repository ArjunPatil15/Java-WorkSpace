package package1;

class Table {
	void printTable(int number) {
		for(int i =1;i<=10;i++) {
			System.out.println(number + " X "+i+" = "+(number *i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class Thread1 extends Thread{
	Table t;
	
	Thread1(Table t){
		this.t= t;
	}
	
	public void run() {
		t.printTable(7);
	}
}

class Thread2 extends Thread{
	Table t;
	
	Thread2(Table t){
		this.t= t;
	}
	
	public void run() {
		t.printTable(9);
	}
}

public class ThreadSync1 {
	public static void main(String[] args) {
		Table tab = new Table();
		
		Thread1 t1 = new Thread1(tab);
		Thread2 t2 = new Thread2(tab);
		
		t1.start();
		t2.start();
		
		
	}
}
