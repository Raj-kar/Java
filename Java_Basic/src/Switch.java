import java.util.Scanner;

public class Switch {
	public static void main(String [] main) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter grade ~ ");
		char grade = Character.toUpperCase(sc.next().charAt(0)) ;
		
		switch(grade) {
		case 'O' :
			System.out.println("Outstanding !");
			break;
		case 'A' :
			System.out.println("Very Good !");
			break;
		case 'B' :
			System.out.println("Good !");
			break;
		case 'C' :
			System.out.println("Bad !");
			break;
		case 'D' :
			System.out.println("Very bad !");
			break;
		default:
			System.out.println("grades are = [O/A/B/C/D]");
		}
		sc.close();
	}
}
