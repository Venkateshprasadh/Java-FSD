/*class hi implements Runnable{// extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}*/
/*class hello implements Runnable {//extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}*/
public class ThreadsleepExample {
	public static void main(String[] args) throws Exception {
		Runnable obj1 = new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("hi");
					try {
						wait(10);
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		};// hi(); //using interface
		/*
		 * Runnable obj2 =() ->//using lamda expression { for(int i=1;i<=5;i++) {
		 * System.out.println("helo"); try { Thread.sleep(1000); } catch (Exception e) {
		 * // TODO: handle exception } } };
		 */
		// obj1.start();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(() ->//using lamda expression
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("helo");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("Hi_thread");
		t2.setName("hello_thread");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		//t1.setPriority(1);
		//t2.setPriority(5);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		;// obj1.start();///->>using extend thread
		try {
			Thread.sleep(10);
			t1.wait(1000);
			System.out.println("wait"+t1.isAlive());
		} catch (Exception e) {
			// TODO: handle exception
		}
		t2.start();// obj2.start();
		System.out.println(t1.isAlive());
		
		t1.join();
		
				
		t2.join();
		System.out.println("bye");
		System.out.println(t2.isAlive());
	}

}
