//Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.

import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        while (count <= n * 2) {
            if (count % 2 == 0 && count % 3 == 0) {
                sum += count;
            }
            count += 1;
        }

        System.out.print(sum);
    }
}