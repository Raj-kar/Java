package multiThreading;

public class IsAlive {
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(() -> {
			for(int i=0; i<5; i++) {
				System.out.println("hi");
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		}, "Hi Thread"); // set a name of thread
		Thread t2 = new Thread(() -> {
			for(int i=0; i<5; i++) {
				System.out.println("Hello");
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		});
			
		System.out.println(t1.getName()); // get name
		t2.setName("hello Thread"); // set name
		System.out.println(t2.getName()); // get name
		
		System.err.println(t1.getPriority()); // get priority
		t1.setPriority(1); // set priority
		System.err.println(t2.getPriority()); // get priority
		t2.setPriority(Thread.MAX_PRIORITY); // set priority
		
		System.err.println(t1.getPriority()); // get priority
		System.err.println(t2.getPriority()); // get priority
		
		t1.start();
		try { Thread.sleep(10); } catch (Exception e) {}
		t2.start(); 
		
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
	}
}
