class count 
{
	int count=0;
	public synchronized void increment()
	{
		count++;
		}
	}

public class ThreadSynchronisation 
{
	public static void main(String[] args) throws InterruptedException {
		count c = new count();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<1000;i++)
				{
					c.increment();
				}
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<1000;i++)
				{
					c.increment();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count); // my count value should be 2000 but im getting value 1456 like random other than 
		//2000 so synchronised keyword is used to sync both thread
		
		
	}
}
