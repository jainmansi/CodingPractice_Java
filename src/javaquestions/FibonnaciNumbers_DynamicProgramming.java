package javaquestions;

public class FibonnaciNumbers_DynamicProgramming {

	public static void main(String[] args) {
		System.out.println(getFibonnaci(10));
	}
	
	public static int getFibonnaci(int n) {
		return fibonnaci(n, new int[n+1]);
	}
	
	public static int fibonnaci(int n, int[] memo) {
		if(n == 0 || n == 1) return n;
		
		if(memo[n] == 0)
			memo[n] = fibonnaci(n-1, memo) + fibonnaci(n-2, memo);
		
		return memo[n];
	}
}
