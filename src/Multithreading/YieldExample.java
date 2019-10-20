package Multithreading;

public class YieldExample {

	public static void main(String[] args) throws InterruptedException {


		Runnable producer = () -> {
			
			for(int i = 0 ; i < 10 ; i++)
			{
				System.out.println("I have produced : " + i);
				Thread.yield();
			}
			
		};
		
		
		Runnable consumer = () -> {
			
			for(int i = 0 ; i < 10 ; i++)
			{
				System.out.println("I have Comsumed : " + i);
				Thread.yield();
			}
			
		};
		
		
		Thread t1 = new Thread(producer);
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(consumer);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t1.join();
		t2.start();
		
		
	}

}
