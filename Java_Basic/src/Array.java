import java.util.Scanner;

public class Array {
//	Take user input and stored to an array
	
	static void printArray(Scanner sc, int marks[]) {
		System.out.println("Are you want to print the subject marks ? [y/n]");
		if(Character.toLowerCase(sc.next().charAt(0)) == 'y') {
			for (int i = 0; i < marks.length; i++) {
				System.out.println("marks of subject " + (i+1) + " = " + marks[i]);	
			}
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter marks for subject " + (i+1));
			marks[i] = sc.nextInt();	
		}
		
		// print marks
		printArray(sc, marks);
		
//		we can also declare array by this !
		int marks1[] = {89,98,96,87,97};
		printArray(sc, marks1);
		
		sc.close();
	}
}
