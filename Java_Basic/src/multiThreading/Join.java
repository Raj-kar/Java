package multiThreading;

public class Join {
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(() -> {
			for(int i=0; i<5; i++) {
				System.out.println("hi");
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i=0; i<5; i++) {
				System.out.println("Hello");
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		});
		
		t1.start();
		try { Thread.sleep(10); } catch (Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
//		After t1 and t2 complete, then Bye will Print
		System.out.println("Bye Bye");
	}
}
