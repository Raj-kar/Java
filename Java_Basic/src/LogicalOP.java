import java.util.Scanner;

public class LogicalOP {
	
	public static void main(String [] args) {
//		&& , || , ! (and, or, not)
		Scanner sc = new Scanner(System.in);
		int age, ticket_price = 0;
		String name;
		char answer;
		boolean is_take_photo = false;
		
		System.out.println("What's your name ?");
			name = sc.nextLine();
		System.out.println("What's your age ? ");
			age = sc.nextInt();
		System.out.println("Are you want to take photos [y/n]");
			answer = Character.toLowerCase(sc.next().charAt(0));
			if (answer == 'y') {
				is_take_photo = true;
			}
		
			
		if(age < 18 || age > 60) {
			System.out.println("You are not eligible for the ride");
		}
		else if (age >= 18 && age <= 25) {
			ticket_price += 10;
			if(is_take_photo) {
				ticket_price += 5;
			}
			System.out.println(name + " your final ticket price is " + ticket_price);
		} else if (age > 25 && age <= 35) {
			ticket_price += 15;
			if(is_take_photo) {
				ticket_price += 5;
			}
			System.out.println(name + " your final ticket price is " + ticket_price);
		} else if (age > 35 && age <= 60) {
			System.out.println("All will be fine ! Have a free ride with us !");
			if(is_take_photo) {
				ticket_price += 5;
			}
			System.out.println(name + " your final ticket price is " + ticket_price);
		}
		sc.close();
	}
	
}
