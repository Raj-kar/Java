import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age -");
		int age = sc.nextInt();
		
		if (age >= 65) {
			System.out.println("You can't vote !");
		} else if (age >= 18) {
			System.out.println("You can vote !");
		} else {
			System.out.println("you can't vote now !! ");
		}
		
		sc.close();
	}

}
