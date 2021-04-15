import java.util.Scanner;
import java.lang.Math;

public class ArmstrongRange {
	public static boolean isAmstrong(int num) {
	    int temp = num, rem, sum = 0;
	    int length = String.valueOf(num).length();
		
	    while (temp > 0) {
                rem = temp % 10;
                sum += (int)Math.pow(rem, length);
                temp = temp / 10;
            }
            if (sum == num)
                return true;
            return false;
	}
	
    public static void main(String[] args) {
    	int stNum, enNum;
    	Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter starting num:");
        stNum = scan.nextInt();
        System.out.println("Enter ending num:");
        enNum = scan.nextInt();
        
        System.out.println("Amstrong numbers between " + stNum + " and " + enNum + " are = ");
        for(int i =stNum; i<=enNum; i++) {
            if(isAmstrong(i)) {
            	System.out.println(i + " ");
            }
        }
        scan.close();
    }
}
