import java.util.Scanner;

public class WhileLoop {
//	Fizz-Buzz
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		System.out.println("Enter stop range ! ");
		int stop = sc.nextInt();
		
		while(count <= stop) {
			if(count % 3 == 0 && count % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (count % 3 == 0) {
				System.out.println("Fizz");
			} else if (count % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(count);
			}
			count += 1;
		}
		
		
		sc.close();
	}
	
}
