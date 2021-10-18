/*
 * Devin Spears
 * 10/18/2021
 * Input the month Number and year and it will give you the month name along with how many days are in it
 * 
 */
import java.util.Scanner;

public class NumberOfDaysInAMonth {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        //Input for Month
		System.out.println("Please enter a month, 1-12: ");
		int month = in.nextInt();	//input for Month number
		
		//Input for Year
		System.out.println("Please enter a year: ");
		int year = in.nextInt(); //Input for Year
		String monthName = "1"; //Initial String for Month executed to be changed later
		int days = 0;	//Initial Int for Days executed to be changed later
		
		//Determining if 
		if (month == 1) {
			 monthName = "January";
			 days = 31;
			 System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if(month == 2) {
			monthName = "February";
			days = 28;
			System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if(month == 3) {
			monthName = "March";
			days = 31;
			System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if (month == 4) {
			 monthName = "April";
			 days = 30;
			 System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if(month == 5) {
			monthName = "May";
			days = 31;
			System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if(month == 6) {
			monthName = "June";
			days = 30;
			System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if (month == 7) {
			 monthName = "July";
			 days = 31;
			 System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if(month == 8) {
			monthName = "August";
			days = 31;
			System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if(month == 9) {
			monthName = "September";
			days = 30;
			System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if (month == 10) {
			 monthName = "October";
			 days = 31;
			 System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if(month == 11) {
			monthName = "November";
			days = 30;
			System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if(month == 12) {
			monthName = "December";
			days = 31;
			System.out.println("\n"+ monthName +" "+ year + " has " + days + " days");
		}
		if(month >= 13) {
			monthName = "Invalid month " + month + ". Please try again.";
			System.out.println(monthName);
		}
		
		
		/* Please enter a month, 1-12: 13 Please enter a year: 1992 Invalid month 13. Please try again.
		 * 
		 * Please enter a month, 1-12: 9 Please enter a year: 2004 September 2004 has 30 days
		 * 
		 * Please enter a month, 1-12: 4 Please enter a year: 1776 April 1776 has 30 days
		 */
	}

}
