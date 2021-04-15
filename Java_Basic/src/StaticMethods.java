class Emp {
	int id;
	int salary;
	static String ceo;
	
//	Declaring static variables
	static {
		ceo = "Raj";
	}
	
//	Parameterized Constructor
	public Emp(int id, int salary) {
		this.id = id;
		this.salary = salary;
	}
	
	public void show() {
		System.out.println(id + " : " + salary + " : " + ceo);
	}
}


public class StaticMethods {
	public static void main(String args[]) {
		Emp Rai = new Emp(1, 8790);
		Emp Rahul = new Emp(2, 9810);
		
//		Emp.ceo = "RAIMA"; we can also declared static variables using class name.
//		Rai.ceo = "MONAI"; we can also use Object for assign values, but it's illegal. 
		
		Rai.show();
		Rahul.show();
	}
}
