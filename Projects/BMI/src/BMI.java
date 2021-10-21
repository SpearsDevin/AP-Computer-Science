import java.util.Scanner;

/*
 * Devin Spears
 * 10/21/2021
 * This program will take your name, weight, and height and determine your BMI.
 */
public class BMI {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name (first last): ");
        String name = in.nextLine();
        
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        int weight = in.nextInt();
        
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        int feet = in.nextInt();
        int inches = in.nextInt();
        
        double heightM = feet * 0.3048 + inches * 0.0254;
        double weightKG = weight / 2.2046;
        double bmi = weightKG / (heightM * heightM);
        boolean underBMI = bmi < 18.5;
        boolean normalBMI = bmi >= 18.5 && bmi < 25;
        boolean overBMI = bmi >= 25 && bmi < 30;
        boolean obeseBMI = bmi >= 30;
        String bmiWeight = "";
        
        if (underBMI) 
            bmiWeight = "Under Weight";
        
        else if (normalBMI) 
        	 bmiWeight = "Normal Weight";       

        else if (overBMI) 
        	 bmiWeight =  "Over Weight";      

        else if (obeseBMI) 
        	 bmiWeight =  "Obese";     

        System.out.println("\nBody Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: "+ name);
        System.out.println("Height (m): "+ (float)heightM);
        System.out.println("Weight (kg): "+ (float)weightKG);
        System.out.println("BMI: " + bmi);
        System.out.println("Catagory: "+ bmiWeight);
	}

}
