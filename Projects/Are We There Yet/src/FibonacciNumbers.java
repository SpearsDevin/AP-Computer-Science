import java.util.Scanner;

public class FibonacciNumbers {

	FibonacciNumbers() {	
	}

	public int calculate(int n) {
		if (n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return calculate(n - 1) + calculate(n - 2);
		}
	}
	public static void main(String[] args) {

		int n;
		String q = "";
		FibonacciNumbers solve = new FibonacciNumbers();
		Scanner in = new Scanner(System.in);
		while(!q.equals("q")) {
			System.out.print("Please provide a number to find the Fibonacci number (Enter 'q' to quit): ");
			q = in.next();
			if(q.equals("q"))break;
			n = Integer.parseInt(q);
			
			System.out.println("---------------------------------");
	        System.out.println("      | 0    			if n = 0");
	        System.out.println("f(x) =| 1	 		if n = 1");
	        System.out.println("      | f(n - 1) + f(n - 2)  	if n > 1");
	        System.out.println("---------------------------------");
	        System.out.println();
	        System.out.println("x = " + n);
	        System.out.println("f(" + n + ") = " + solve.calculate(n));
	        System.out.println("\n\n\n");
		}
	}
}
