import java.util.Scanner;
public class Exercise1_6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result, i, s;
        s = input.nextInt();
        int[] arr = new int[s];

        for(i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }

        result = s = arr[0];

        for(i=1;i<arr.length;i++) {
            if(arr[i] > result) {
                result = arr[i];
            }
            s += arr[i];
        }

        mark_avg = (float) (s / arr.length);

        System.out.print(result + "\n" + mark_avg);
        
        input.close();
    }
}