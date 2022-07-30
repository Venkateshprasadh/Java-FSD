class hii implements Runnable
{

	
	public void run() {
		// TODO Auto-generated method stub
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

class helllo implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
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
public class ThreadRunnable 
{
	public static void main(String[] args) 
	{
		Runnable obj1 = new hii();
		Runnable obj2 = new helllo();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try {
			Thread.sleep(100);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		t2.start();
		
	}
}
