/*
 * Devin Spears
 * 12/4/2021
 * This program will take the heat and humid from 2 seperate files and calculate the heat index.
 * 
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HeatIndex {

	public static void main(String[] args) throws IOException
	{
	    double token;
	    double averageF = 0;
	    double humidity;
	    double averageH = 0;
	    double[] temp = new double[13];
	    double[] humid = new double[13];
	    double high = 0;
	    double t = 0;
	    double rh = 0;
		File fileName = new File("KeyWestTemp.txt");
	    Scanner inFile = new Scanner(fileName);
	    
        String [] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.", "Avg"};
        System.out.println("\t\t\t\t\t\tHeat Index: Key West, Florida");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\tMonths");
        System.out.print("\t\t");
    	for (int counter = 0; counter <= 12;) { 		
    		System.out.print(month[counter] + "\t");
    		counter++;
    	}
        System.out.println("\n************************************************************************************************************************************");
       
        System.out.print("Temp(F):\t");
        for (int counter = 0; counter <= 11; counter++) {
        	token = inFile.nextDouble();
    		System.out.print(token + "\t");
    		averageF += token;
    		temp[counter] = token;
    	}
        
        averageF = averageF/12;
        temp[12] = averageF;
        System.out.printf("%.1f\n", averageF);
	    inFile.close();
     
	    
	    
	    
		File fileNew = new File("KeyWestHumid.txt");
	    Scanner in = new Scanner(fileNew);
	    
        System.out.print("Humidity(%)\t");
        
        for (int counter = 0; counter <= 11; counter++) {
        	humidity = in.nextDouble();
    		System.out.print(humidity + "\t");
    		humid[counter] = humidity;
    		averageH += humidity;
    	}
        
        averageH = averageH/12;
        humid[12] = averageH;
        System.out.printf("%.1f\n", averageH);
        
        
        
        System.out.print("Hi(F)\t\t");
        for (int counter = 0; counter <= 12; counter++) {
        	t = temp[counter];
        	rh = humid[counter];
        	high = -42.379 + (2.04901523 * t) + (10.14333127 * rh)
        			- (0.22475541 * t * rh) - (6.83783 * Math.pow(10, -3) * Math.pow(t, 2))
        			- (5.481717 * Math.pow(10, -2) * Math.pow(rh, 2)) + (1.22874 * Math.pow(10, -3) * Math.pow(t, 2) * rh)
        			+ (8.5282 * Math.pow(10, -4) * t * Math.pow(rh, 2)) - (1.99 * Math.pow(10, -6) * Math.pow(t, 2) * Math.pow(rh, 2));
        	
    		System.out.printf("%.1f\t", high );
    	}
  	}
}
