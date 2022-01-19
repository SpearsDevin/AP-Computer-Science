
public class recursionTester {

	public static void main(String[] args) {
		int x;
		Recursion solve = new Recursion();
		
		System.out.println("---------------------------------");
        System.out.println("      | f(x - 4) + 2    if x >  10");
        System.out.println("f(x) =|");
        System.out.println("      | -7              if x <= 10");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 25;
        System.out.println("x = " + x);
        System.out.println("f(" + x + ") = " + solve.first(x));
        System.out.println("\n\n\n");
        
        
        
        System.out.println("---------------------------------");
        System.out.println("      | f(x / 12 +5) - 3    if x >  25");
        System.out.println("f(x) =|");
        System.out.println("      | 20	            if x <= 25");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 30;
        System.out.println("x = " + x);
        System.out.println("f(" + x + ") = " + solve.second(x));
        System.out.println("\n\n\n");
        
        
        
        System.out.println("---------------------------------");
        System.out.println("      | f(x * 2) - 4    if x >  20");
        System.out.println("f(x) =|");
        System.out.println("      | -100	        if x <= 20");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 500;
        System.out.println("x = " + x);
        System.out.println("f(" + x + ") = " + solve.fourth(x));
        System.out.println("\n\n\n");
	}

}
