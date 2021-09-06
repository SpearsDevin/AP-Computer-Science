import java.util.Scanner;

public class PoundsToKilos {
    public static void main(String[] args) {
        // Declare a constant for converting pounds to kilograms
        final double POUNDS_TO_KILOS = 0.454;
        
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a radius
        System.out.print("Enter a number in pounds: ");
        double pounds = sc.nextDouble();
        
        // Compute kilograms
        double kilos = pounds * POUNDS_TO_KILOS;
        
        // Display results
        System.out.println(pounds + " pounds is " +
            kilos + " kilograms");
    }
}
 