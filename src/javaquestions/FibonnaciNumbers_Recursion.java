package javaquestions;

public class FibonnaciNumbers_Recursion {

	public static void main(String[] args) {
		System.out.print(fibonnaci(10));
	}
	
	public static int fibonnaci(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fibonnaci(n - 1) + fibonnaci (n - 2);
	}
}
