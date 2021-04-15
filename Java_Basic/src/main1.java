import java.util.Scanner;

public class main1 {

	static class add{
		int a, b;
		
	    void get_data() {
	        System.out.println("enter the first number:");
	        Scanner sc = new Scanner(System.in);
	        a = sc.nextInt();
	        System.out.println("enter the second number:");
	        b = sc.nextInt();
	        sc.close();
	    }
	    void disp() {
	            System.out.println("the sum of " +a+" and " +b+" is " +(a+b));
	    }
	}
	    
    public static void main(String[] args) {
        add obj=new add();
        obj.get_data();
        obj.disp();
    }
}

