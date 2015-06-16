
public class writesleep extends Thread{
	public void run(){  
		for (int i = 0; i < 10000; i++) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println("sleep");
		}
		}
	}


