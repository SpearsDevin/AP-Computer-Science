/*
 * Devin Spears
 * 3/11/2022
 * This program will take user input and find the prime number in between 1 and there input
 */
import java.io.IOException;
import java.util.Scanner;

public class primeNumbers {

	public static void start() throws IOException{
	    Scanner in = new Scanner(System.in);
	    int i = 0;
	    int num = 0;
	    String  primeNum = "";
	    
		System.out.print("Please enter a Upper Limit (exp: 100, 1000, ect.): ");
		int n = in.nextInt();
	    
	    for (i = 1; i <= n; i++) { 		 		  
	       int l=0; 		  
	       for(num = i; num>=1; num--) {
	    	   if(i%num==0) {
	    		   l = l + 1;
	    	   }
	       }
	       if (l ==2) {
		    primeNum = primeNum + i + " ";
	       }	
	    }	
	    System.out.println(primeNum);
	}

	public static void main(String[] args) throws IOException  {
		start();
	}
}
