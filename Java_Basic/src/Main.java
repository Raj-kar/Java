
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(19, "Raj");
		p1.eat();
		
		Person p2 = new Person(18, "Rai");
		p2.walk();
		p2.eat("pizza");
		
		p2.display_data();
		
		System.out.println("Number of object of Person class is = " + Person.count);
	
		Developer d1 = new Developer(23, "Rahul");
		d1.eat("Burger");

	}

}


//Inheritance from Person class
class Developer extends Person {
	String name;
	public Developer(int age, String name) {
		super(age, name); // pass values to Person class !
		this.name = name;
	}
	
	@Override
	void eat(String food) { // Runtime polymorphism
		System.out.println("Developer "+ name + " eating " + food + " !");
	}
}

class Person {
	// property of object
	private String name;
	private int age;
	
	// property of Person class.
	static int count;
	
	// Default Constructor
	public Person() {
		count +=1; 
	}
	
	// Parameterized Constructor
	public Person(int age, String name) {
		// calling default constructor using this()
		this();
		// we can also use this for access object properties. 
		this.name = name;
		this.age = age;
	}
	
	// class method
	void walk()	{
		System.out.println(name + " walking !");
	}
	
	// class method
	void eat() {
		System.out.println(name + " eating !");
	}
	
	// method overloading - compile time polymorphism
	void eat(String food) {
		System.out.println(name + " eating " + food + " !");
	}
	
	void display_data() {
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}
}
