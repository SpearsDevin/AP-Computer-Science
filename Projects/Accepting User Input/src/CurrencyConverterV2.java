/*
 * Devin Spears
 * 10/12/2021
 * This program will take Us dollar and change the currency based on the countries currency
 * 
 */
import java.util.Scanner;

public class CurrencyConverterV2
{   
    public static void main(String [ ] args)
    {
    	Scanner in;
    	in = new Scanner(System.in);
    	System.out.print("Please Enter an amount for USD to be Converted to Pesos,Yen, and Euro's\n");
        double startingUsDollars = in.nextDouble();      // local variable for US Dollars
        double pesosSpent = 5210.25;             // local variable for Mexican pesos spent
        double totalPesos = 0;                   // local variable for total pesos
        double remainingPesos = 0;               // local variable for pesos remaining after purchases
        double dollarsSpentInMexico;             // local variable for dollars spent in Mexico
        //remaining variables below here

        // purpose of program
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println();
        
        // convert US dollars to Mexican pesos
        // code goes below here
        
        dollarsSpentInMexico = 478.0;
        double pesoExchangeRate = 20.60960;
        
        pesosSpent = dollarsSpentInMexico * pesoExchangeRate;
        double dollarToPeso = startingUsDollars * pesoExchangeRate;
        double totalDollars = startingUsDollars - dollarsSpentInMexico;
        
        // convert Mexican pesos to Japanese yen
        // code goes below here
        double dollarsSpentInJapan = 824.00;
        double yenExchangeRate = 113.60;
        
        double yenSpent = dollarsSpentInJapan * yenExchangeRate;
        double dollarToYen = totalDollars * yenExchangeRate;
        double dollarsLeft = totalDollars - dollarsSpentInJapan;
        
        
        // convert Japanese yen to Euros
        // code goes below here
        double dollarsSpentInEurope = 1100.00;
        double euroExchangeRate = 0.87;
        
        double dollarToEuro = dollarsLeft * euroExchangeRate;
        double euroSpent = dollarsSpentInEurope * euroExchangeRate;
        
        // convert Euros to US Dollars
        // code goes below here
        double remainingDollars = dollarsLeft - dollarsSpentInEurope;

        //print output to the screen
        // code goes below here  
        System.out.println("Started with " + startingUsDollars + " American dollars");
        System.out.println(" ");
        System.out.println(startingUsDollars + " American dollars = " + dollarToPeso + " Mexican pesos");
        System.out.println("Dollars Spent: " + dollarsSpentInMexico + "	Pesos spent: " + pesosSpent);
        System.out.println(" \n ");
        System.out.println(totalDollars + " American dollars = " + dollarToYen + " Japanese yen");
        System.out.println("Dollars Spent: " + dollarsSpentInJapan + "	Yen spent: " + yenSpent);
        System.out.println(" \n ");
        System.out.println(dollarsLeft + " American dollars = " + dollarToEuro + " European euro");
        System.out.println("Dollars Spent: " + dollarsSpentInEurope + "	Euro spent: " + euroSpent);
        System.out.println(" \n ");
        System.out.println("Remaining amount of American dollars: " + remainingDollars);
    } // end of main method
} // end of class     
