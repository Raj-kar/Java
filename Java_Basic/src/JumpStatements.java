import java.util.Scanner;

public class JumpStatements {
//	print only even numbers !
	public static void main(String [] args) {

		for (int i = 1; i <= 10; i++) {
			if(i % 2 != 0) continue;
			else System.out.println(i);
		}

//		Find a number !
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What number you want to find between 1 to 10 -");
		int find_num = sc.nextInt();	
		boolean is_found = false;
		
		for (int i = 1; i <= 10; i++) {
			if(find_num == i) {
				System.out.println(find_num + " found !!");
				is_found = true;
				break;
			}
		}
		
		if(!is_found)
			System.out.println(find_num + " not present between 1 to 10 !");
		
		sc.close();
	}
	
}
