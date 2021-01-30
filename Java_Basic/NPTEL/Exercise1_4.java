import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        int sum = 0, num = n, rem, pow;

        while(num != 0) {
            rem = num % 10;
            pow = (rem * rem * rem);
            sum += pow;
            num /= 10;
        }
        
        if(sum == n)
            result = 1;

        System.out.print(result);
    }
}