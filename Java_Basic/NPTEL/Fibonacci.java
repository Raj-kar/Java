import java.util.Scanner; //This package for reading input
public class Fibonacci {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Read an integer
        System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
        //number
        sc.close();
    }
    static int fib(int n) {
        //complete the code segment to find the nth Fibonacci number in the Fibonacci sequence and return the value. Write the function recursively.
    	int[] f = new int[n+1];
    	f[0] = 0;
    	f[1] = 1;
  
    	for(int i=2; i<n; i++) {
    		f[i] = (f[i-1] + f[i-2]);
    	}
    	return f[n-1];
    }
}