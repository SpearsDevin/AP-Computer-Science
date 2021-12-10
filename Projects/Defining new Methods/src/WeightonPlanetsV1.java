import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class WeightonPlanetsV1 {
	
	 public static void results(String [] planet, double [] gravity, double [] formula) {   
	        System.out.printf("\n%30s\n","My Weight on Planets");
	        System.out.printf("%-10s %-10s %15s\n","Planet","Gravity","Weight(lbs)");
	        System.out.println("--------------------------------------------------");    
	        
	        for(int count = 0; count < 9; count++) {
	            System.out.printf("%-12s %-10.2f %10.2f\n", planet[count], gravity[count], formula[count]);
	        }
	    }
	 
	 public static double[] calculate(double[] gravity, double pounds) { 
		 double [] weight = new double [9];
		 
		 for (int count = 0; count < gravity.length; count++) {
			 weight[count] = pounds* gravity[count];
		 }
	        return weight;
	    }
	 
	 public static void output(String [] planet, double[] formula)throws IOException {
	       PrintWriter outFile = new PrintWriter(new File("gravity2.txt"));
	       double []gravity= formula; 
	       
	       for(int count = 0; count < gravity.length; count++) {
	           outFile.printf("Your weight on %1s will be %.2f\n", planet[count] , formula[count]);
	       }
	       outFile.close();
	    }	 
	 
	public static void main(String[] args) throws IOException {
		String token;
	    File file = new File("gravity1.txt");
	    Scanner inFile = new Scanner(file);
	    double[] gravity = new double[9];
		Scanner in = new Scanner(System.in);

	    System.out.print("Calculate your amongst the other planets: ");
	   double pounds = in.nextDouble();
	    for (int count= 0; count <= 8; count++) {
	    	gravity[count] = inFile.nextDouble() * .1;
	    }
	    
	    
        String [] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

        double[] formula = calculate(gravity, pounds);
        results(planet, gravity, formula);
        output(planet, formula);
	}

}
