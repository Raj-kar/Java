import java.util.Scanner;


public class Class_Prime {
	public static void main(String [] args) {
		PrintPrime p1 = new PrintPrime(5, 100);
		p1.find_primes();
	}
}

class PrintPrime {
	private int start, stop;
	
	public PrintPrime() {
		
	}
	
	public PrintPrime(int start, int end) {
		this.start = start;
		this.stop = end;
	}
		
	void input_data() {
		System.out.println("Enter start and ending pos : ");
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.nextInt();
	}
	
	boolean is_prime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	void find_primes() {
		while(start <= stop) {
			if(is_prime(start) == true) {
				System.out.print(start + " ");
			}
			start++;
		}
	}
}

