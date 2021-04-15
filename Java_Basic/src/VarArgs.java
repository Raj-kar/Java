// VarArgs stands for variable length arguments 

class Calc {
	int result;
	
//	Accept 2 arguments and return their sum.
	public int add(int a, int b) {
		return a+b;
	}
	
//	Accepts a infinite numbers of arguments ...
	public int add(int ... i) { 
		result = 0;
		for(int k : i) {
			result += k;
		}
		return result;
	}
}

public class VarArgs { 
	public static void main(String args[]) {
		Calc obj = new Calc();
		
		System.out.println(obj.add(1, 2, 3, 4, 5));
		System.out.println(obj.add(1, 2, 3));
		
	}
}
