import java.util.Scanner;

public class AnnualClimate2 {

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
	        
	        System.out.print("Please use 1 (for Fahrenheit & In.) Or 2 (for Celsius & cm): ");
	        
	        int selection = in.nextInt();
	        String [] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
	        double [] tempF =  {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2} ;
	        double [] precipIn = {4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6 ,3.5}; 
	        double averageT = 0;
	        double averageP = 0;

	        if(selection == 1) {
	        	System.out.printf("\tClimate Data");
	        	System.out.println("\tLocation: Apalachicola, FL");
	        	System.out.println("");
	        	System.out.println("Month\t Temperature (F) \t Precipitation (in.)");
	        	System.out.println("****************************************************");
	        	for (int counter = 0; counter <= 11;) {
	        		
	        		System.out.print(month[counter]);
	        		System.out.printf("\t\t%.1f\t\t\t%.1f\n", tempF[counter], precipIn[counter]);

	        		averageT += tempF[counter]; 
	        		averageP += precipIn[counter]; 
	        		counter++;
	        	}
	        	averageT = averageT/12;
	        	averageP = averageP/12;

	        	System.out.println("****************************************************");
	        	System.out.printf("Average: \t%.1f\t\t\t%.1f\n", averageT, averageP);
	        }
	        if(selection == 2) {
	        	System.out.println("\t\tClimate Data");
	        	System.out.println("\tLocation: Apalachicola, FL");
	        	System.out.println("");
	        	System.out.println("Month\t Temperature (C) \t Precipitation (cm)");
	        	System.out.println("****************************************************");
	        	for (int counter = 0; counter <= 11;) {
	        		double celcius = (tempF[counter] - 32) /1.8;
	        		double cm = precipIn[counter] * 2.54;
	        		System.out.print(month[counter]);
	        		System.out.printf("\t\t%.1f\t\t\t%.1f\n", celcius, cm);
	        		
	        		averageT += celcius;  
	        		averageP += cm; 
	        		counter++;
	        	}
	        	averageT = averageT/12;
	        	averageP = averageP/12;

	        	System.out.println("****************************************************");
	        	System.out.printf("Average: \t%.1f\t\t\t%.1f\n", averageT, averageP);
	        }
		
		
	}

}
