
	class hi extends Thread{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				try {
					Thread.sleep(1000);
					System.out.println("hi");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
	class hello extends Thread{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				try {
					Thread.sleep(1000);
					System.out.println("hello");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

public class ThreadExtends  extends Thread
{
	public static void main(String[] args) 
	{
		hi h = new hi();
		hello hel = new hello();
		h.start();
		try {
			h.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
		hel.start();
		
		
		
		
	}
}
