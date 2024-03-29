public class ErrorHandling {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		
		// array index error
		try {			
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound !");
			System.out.println(e.getLocalizedMessage());
		}
		
		// division error
		try {
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide any number");
			System.out.println(e.getMessage());
		}
		
		// any error catch
		try {
			System.out.println(arr[9]);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
