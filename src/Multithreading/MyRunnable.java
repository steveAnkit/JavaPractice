package Multithreading;

public class MyRunnable extends Thread{

	
	private volatile boolean flag = true;
	
	public  void stopRunning()
	{
		flag = false;
	}
	
	@Override
	public void run() {
	
		while(flag)
		{
			System.out.println("I am running with "+ Thread.currentThread().getName() );
		}
		
		System.out.println("thread stopped");
		
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		MyRunnable runnable= new MyRunnable();
		runnable.setName("custom thread");
		runnable.start();
		
		Thread.sleep(100);
		
		 runnable.stopRunning(); 
		/* runnable.interrupt(); */
	}

}
