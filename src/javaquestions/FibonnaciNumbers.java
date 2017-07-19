package javaquestions;

public class FibonnaciNumbers {

	public static void main(String[] args) {
		System.out.println("Fibonacci of 15 numbers:");
		printFibonnaci(15);
		System.out.println();
		
		System.out.println("Fibonacci of 1 numbers:");
		printFibonnaci(1);
		System.out.println();
		
		System.out.println("Fibonacci of -5 numbers:");
		printFibonnaci(-5);
		System.out.println();
	}
	
	public static void printFibonnaci(int n){
		int a = 0;
		int b = 1;
		int c = 0;
		if(n < 0) {
			System.out.println(-1);
			return;
		}
		if(n == 0) {
			System.out.print(0);
			return;
		}
		else if(n == 1) {
			System.out.print(0 + " ");
			System.out.print(1);
			return;
		} else {
			System.out.print(a + " ");
			System.out.print(b + " ");
			for(int i = 0; i < n; i++) {
				c = a + b;
				a = b;
				b = c;
				System.out.print(c + " ");
			}
		}
	}
}
