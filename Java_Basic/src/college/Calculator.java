package college;

import java.util.Scanner;

public class Calculator {
	public static void print(String type, int num1, int num2, int ans) {
		System.out.println(type +" of " + num1 + " and " + num2 + " is " + ans);
	}
	
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		num2 = sc.nextInt();
		
		print("Addition", num1, num2, num1+num2);
		print("Subtraction", num1, num2, num1-num2);
		print("Multiplication", num1, num2, num1*num2);
		print("Divsion", num1, num2, num1/num2);
		print("Modulation", num1, num2, num1%num2);
		sc.close();
	}
	
}

