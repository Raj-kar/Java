package multiThreading;

class Count {
	int count = 0;
	
	public void incrimentCount() {
		count++;
	}
}

public class Demo {
	public static void main(String[] args) throws Exception{
		Count c = new Count();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++)
					c.incrimentCount();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++)
					c.incrimentCount();
			}
		});
		
		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count " + c.count);
	}
}
