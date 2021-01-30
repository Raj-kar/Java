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
        sc.close();
    }
}