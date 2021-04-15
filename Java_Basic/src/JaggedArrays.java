import java.util.Iterator;

public class JaggedArrays {
	public static void main(String args[]) {
		
//		2D arrays - all the columns are same. 
		int arr[][] = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}
				};
//		Jagged arrays - all the columns are not same
		int arr2[][] = {
				{1,2,3,4},
				{5,6,7},  // not same (3 elements)
				{9,10,11,12}
			};
		
//		Use length method for dynamically get length of array.
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
