package multiThreading;

class SayHi extends Thread {
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

class SayHello extends Thread {
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
 

public class MThread {
	public static void main(String[] args) {
		SayHi obj1 = new SayHi();
		SayHello obj2 = new SayHello();
		
		obj1.start();
		obj2.start();
		
		try {
			Thread.sleep(50);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
