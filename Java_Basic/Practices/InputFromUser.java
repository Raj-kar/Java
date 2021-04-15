import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fn, ln;
		
		System.out.println("Enter your first name : ");
		fn = sc.next();
		
		System.out.println("Enter your last name : ");
		ln = sc.next();
		
		
		
		System.out.println("Welcome " + fn + " " + ln);
		
		sc.close();
	}

}
