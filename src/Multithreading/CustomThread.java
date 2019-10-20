package Multithreading;

public class CustomThread {
	
	public static void main(String[] args) {
		
		Runnable r = () -> {
			
			for(int i = 1; i< 10; i++)
			{
				System.out.println("Run By "+ Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};

		
		Thread t1 = new Thread(r);
		t1.setName("tom");
		

		Thread t2 = new Thread(r);
		t2.setName("harry");
		
		t1.start();
		t2.start();
		
	}
	

}
