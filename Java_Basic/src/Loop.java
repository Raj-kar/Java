import java.util.Scanner;

public class Loop {
//	Even and odd numbers between 1 to user_input
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter stop range ! ");
		int stop = sc.nextInt();
		
		for(int i = 1; i <= stop; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}

		sc.close();
	}
}
