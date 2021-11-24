import java.util.Scanner;

public class AnnualClimate1 {

	public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("Please use 1 (for Fahrenheit) Or 2 (for Celsius): ");
	        
	        int selection = in.nextInt();
	        String [] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
	        double [] tempF =  {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2} ;
	        double [] precipIn = {4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6 ,3.5}; 
	        double averageT = 0;
	        double averageP = 0;

	        if(selection == 1) {
	        	System.out.println("\t\tClimate Data");
	        	System.out.println("\tLocation: Apalachicola, FL");
	        	System.out.println("");
	        	System.out.println("Month\t Temperature (F) \t Precipitation (in.)");
	        	System.out.println("****************************************************");
	        	for (int counter = 0; counter <= 11;) {
	        		System.out.println(month[counter]+ "\t\t"+ tempF[counter]+ "\t\t\t"+ precipIn[counter]);
	        		averageT += tempF[counter]; 
	        		averageP += precipIn[counter]; 
	        		counter++;
	        	}
	        	averageT = averageT/12;
	        	System.out.println("****************************************************");
	        	System.out.println("Average: "+ averageT + "\tAnnual: " + averageP);
	        }
	        if(selection == 2) {
	        	
	        }
	        
	        
	}

}
