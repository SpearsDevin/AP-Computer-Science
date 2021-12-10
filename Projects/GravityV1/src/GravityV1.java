/*
 * Devin Spears
 * 12/10/2021
 * this program will take the diameter and mass then calculate the gravitational force.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class GravityV1 {
	
	    public static void results(String [] planet, double [] diameter, double [] kg, double[]gravityForce) {   
	        System.out.printf("%32s\n","Planetary Data");
	        System.out.printf("%-12s %-17s %7s %11s\n","Planet","Diameter(Km)","Mass(Kg)","g(m/s^2)");
	        System.out.println("--------------------------------------------------");    
	        
	        for(int count = 0; count < 9; count++) {
	            System.out.printf("%-14s %-14.0f %5.2e %11.2f\n", planet[count], diameter[count], kg[count], gravityForce[count]);
	        }
	    }
	
	    public static double[] gravityForce( double []kg, double[]km){
	    	double gConstant = 6.67E-11;
	        double []gravity= new double[9];
	        
	        for(int count = 0; count < gravity.length; count++) {
	            gravity[count] = ((gConstant * kg[count]) / (Math.pow(km[count]/2,2)));
	        }
	        return gravity;
	    }
	
	    public static void output(double[] gForce)throws IOException {
	       PrintWriter outFile = new PrintWriter(new File("gravity1.txt"));
	       double []gravity= gForce; 
	       
	       for(int count = 0; count < gravity.length; count++) {
	           outFile.println(gravity[count]);
	       }
	       outFile.close();
	    }
	    
	    public static void main(String[]args) throws IOException {
	        String [] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
	        double [] kg = {3.30E23,4.869E24,5.972E24,6.4219E23,1.900E27,5.68E26,8.683E25,1.0247E26,1.27E22};
	        double [] km = {4880000,12103600,12756300,6794000,142984000,120536000,51118000,49532000,2274000};
	        double [] diameter = {4880,12103.6,12756.3,6794,142984,120536,51118,49532, 2274};
	        
	        double [] gravityForce = gravityForce(kg, km);
	        results(planet, diameter, kg, gravityForce);
	        output(gravityForce);
	    }
}
