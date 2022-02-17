import java.util.Scanner;

public class CoffeeRecursion {
	
	CoffeeRecursion(){	
	}
	
	public double calculate(double x) {
		if (x >= 8) {
			return 1;
		} else if(x <= 4) {
			return calculate(x + 1) + 1.5;
		} else {
			return calculate(x + 1) + 1;
		}
	}
	
	public static void main(String[] args) {

		int x;
		String q = "";
		CoffeeRecursion solve = new CoffeeRecursion();
		Scanner in = new Scanner(System.in);
		while(!q.equals("q")) {
			System.out.print("Please provide a number to find the amount of coffee need based off how much sleep you got(Enter 'q' to quit): ");
			q = in.next();
			if(q.equals("q"))break;
			x = Integer.parseInt(q);
			
			System.out.println("---------------------------------");
	        System.out.println("      | 1    			if x >= 8");
	        System.out.println("f(x) =| f(x + 1) + 1  		if x <= 7");
	        System.out.println("      | f(x + 1) = 1.5  	if x <= 4");
	        System.out.println("---------------------------------");
	        System.out.println();
	        System.out.println("x = " + x);
	        System.out.println("f(" + x + ") = " + solve.calculate(x) + " Cups of Coffee needed!");
	        System.out.println("\n\n\n");
		}
		
		
	}

}
