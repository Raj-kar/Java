import java.util.Scanner;

public class TakingInput {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your age ? ");
		int age = sc.nextInt();
		
		System.out.println("What's your name ? ");
		String name = sc.nextLine();
		
		System.out.println("Your age is " + age);
		System.out.println("Your name is " + name);
		
		sc.close();
	}
}
