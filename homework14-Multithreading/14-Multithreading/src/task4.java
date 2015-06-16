
class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		int t=0;
		for (int i=0; i<=50000; i++){
			System.out.println(t);
			t=t+1;
		if (t==25000){
		
			try {
				wait();
			} catch (Exception e) {
			}
			}
		}
	
	}

	synchronized void deposit(int amount) {
		

		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {;
		System.out.println("Running…");
		notify();
			}
		
	}
		}
}

class task4 {
	public static void main(String args[]) {
		final Customer c = new Customer();

		new Thread() {
			public void run() {
				c.withdraw(150000000);
			}
		}.start();

		new Thread() {
			public void run() {
				c.deposit(1000000);
			}
		}.start();

	}
}