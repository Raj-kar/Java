// This is the class named Printer
class Printer {
    // This are the methods in class Printer
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
    public void print(String s) {
        System.out.println(s);
    }
}

public class Question22 {
    public static void main(String[] args) {
        // Create an object of class Printer

        // Call 'print()' methods for desired output
        Printer p1 = new Printer();
        p1.print("Hi! I am class STUDENT");
        p1.print();
    }
}