class Outer {		// Outer.class
	int x;
	
	class Inner { 		// Outer$Inner.class
		public void display() {
			System.out.println("In Inner - display !");
		}
	}
	
	static class Inner1 { 		// Outer$1.class
		public void display() {
			System.out.println("In Inner1 - display !");
		}
	}
}


public class InnerClass {		// InnerClass.class
	public static void main(String args[]) {
		Outer obj = new Outer();
		
//		Access Inner class method.
		Outer.Inner obj1 = obj.new Inner();
		obj1.display(); 
		
//		Access Static Inner class method
		Outer.Inner1 obj2 = new Outer.Inner1();
		obj2.display(); 
	}
}
