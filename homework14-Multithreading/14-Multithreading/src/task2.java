
	public class task2 extends Thread {

		public void run() {
			
			System.out.println("The thread is strarted");
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					System.out.println(e);
					e.printStackTrace();
				}
				System.out.println("The thread is complete!");
			
		}

		public static void main(String[] args) {
			Thread t1 = new task2();
			Thread t2 = new task2();
			Thread t3 = new task2();
			Thread t4 = new task2();
			Thread t5 = new task2();
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t1.setName("Sonoo Jaiswal1");
			System.out.println("After changing name of t1:" + t1.getName());
			t2.setName("Sonoo Jaiswal2");
			System.out.println("After changing name of t2:" + t2.getName());
			t3.setName("Sonoo Jaiswal3");
			System.out.println("After changing name of t3:" + t3.getName());
			t4.setName("Sonoo Jaiswal4");
			System.out.println("After changing name of t4:" + t4.getName());
			t5.setName("Sonoo Jaiswal5");
			System.out.println("After changing name of t5:" + t5.getName());
		}

	}
