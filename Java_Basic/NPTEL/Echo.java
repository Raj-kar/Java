public class Echo {
    public static void main (String[] args) {
    	int i = 10;
    	int n = i++ % 5; //11 + 0
    	int m = ++i % 5; // 12 + 2 = 14
    	System.out.println(i+n+m);
    }
}