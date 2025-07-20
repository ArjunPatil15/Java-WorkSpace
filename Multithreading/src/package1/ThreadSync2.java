package package1;

class Account{
	private int balance=50;
	
	int getbalance () {
		return this.balance;
		
	}
	
	void withdraw (int amount) {
		balance = balance - amount;
	}
	
}



public class ThreadSync2 implements Runnable{
	
	private Account ac = new Account();
	
	public static void main(String[] args) {
		ThreadSync2 ts = new ThreadSync2();
		
		
		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);
		
		t1.setName("Ram");
		t2.setName("Shyam");
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5 ;i++) {
			makeWithdrawal(10);
			if(ac.getbalance()<0) {
				System.out.println("Acc is overdrawan");
			}
		}
	}
	
	private synchronized void makeWithdrawal(int amount) {
		System.out.println(Thread.currentThread().getName() + " Checks the balance and balance is : " + ac.getbalance());
		
		if(ac.getbalance()>=amount) {
			System.out.println(Thread.currentThread().getName() + " Wants to Withdraw ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ac.withdraw(amount);
			
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		}else {
			System.out.println("Not Sufficient Balance for " + Thread.currentThread().getName() + " to withdraw");
		}
	}
	
}