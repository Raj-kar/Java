package multiThreading;

// Using lambdas in anonymous class 
public class AnonymousClass {
	public static void main(String[] args) {
		Runnable obj1 = () -> {
				for(int i=0; i<5; i++) {
					System.out.println("hi");
					try { Thread.sleep(500); } catch (Exception e) {}
				}
		};
		Runnable obj2 = () -> {
				for(int i=0; i<5; i++) {
					System.out.println("Hello");
					try { Thread.sleep(500); } catch (Exception e) {}
				}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try { Thread.sleep(10); } catch (Exception e) {}
		t2.start();
	}
}
