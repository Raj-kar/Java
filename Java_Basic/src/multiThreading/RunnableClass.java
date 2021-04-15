package multiThreading;

class Hi implements Runnable {
	public void run() {	 	// Threads initially call run 
		for(int i=0; i<5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Hello implements Runnable {
	public void run() {		// Threads initially call run 
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
 

public class RunnableClass {
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
//		obj1.start();
//		obj2.start();
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
	}
}
