import java.util.Scanner;
/*
 * Devin Spears
 * 10/21/2021
 * This program will take your name, BMR, and gender and determine what your calorie intake should be base off your Activity
 */
public class TDEE {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        
		 System.out.print("Please enter your name: ");
		 String name = in.nextLine();
		 
		 System.out.print("Please enter your BMR: ");
		 int bmr = in.nextInt();
		 
		 System.out.print("Please enter your Gender (M/F): ");
		 String gender = in.next();
		 
		 System.out.println("");
		 System.out.println("Select Your Activity Level");
		 System.out.println("[0] Resting (Sleeping, Reclining)");
		 System.out.println("[1] Sedentary (Minmal Movement)");
		 System.out.println("[2] Light (Sitting, Standing)");
		 System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike)");
		 System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
		 System.out.println("[5] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
		 System.out.println("");

		 System.out.print("Enter the Number corresponding to your activity level: ");
		 int activity = in.nextInt();
		 double activityFactor = 0;
		 //Male
		 if (gender.equalsIgnoreCase("M") && activity == 0) {
			 activityFactor = 1.0;
		 }
		 else if (gender.equalsIgnoreCase("F") && activity == 0) {
			 activityFactor = 1.0;
		 }
		 
		 if (gender.equalsIgnoreCase("M") && activity == 1) {
			 activityFactor = 1.3;
		 }
		 else if (gender.equalsIgnoreCase("F") && activity == 1) {
			 activityFactor = 1.3;
		 }
		 
		 if (gender.equalsIgnoreCase("M") && activity == 2) {
			 activityFactor = 1.6;
		 }
		 else if (gender.equalsIgnoreCase("F") && activity == 2) {
			 activityFactor = 1.5;
		 }
		 
		 if (gender.equalsIgnoreCase("M") && activity == 3) {
			 activityFactor = 1.7;
		 }
		 else if (gender.equalsIgnoreCase("F") && activity == 3) {
			 activityFactor = 1.6;
		 }
		 
		 if (gender.equalsIgnoreCase("M") && activity == 4) {
			 activityFactor = 2.1;
		 }
		 else if (gender.equalsIgnoreCase("F") && activity == 4) {
			 activityFactor = 1.9;
		 }
		 
		 if (gender.equalsIgnoreCase("M") && activity == 5) {
			 activityFactor = 2.4;
		 }
		 else if (gender.equalsIgnoreCase("F") && activity == 5) {
			 activityFactor = 2.2;
		 }
		 else {
			 System.out.println("Incorrect option please try again");
		 }
		 
		 double tdee = bmr * activityFactor;

		 
		 
		 //Output
		 System.out.println("");
		 System.out.println("Name: " + name + "	Gender: " + gender);
		 System.out.println("BMR: " + bmr + " calories" + "	Activity Factor: " + activityFactor);
		 System.out.println("TDEE: "+ tdee +" calories");
		 
	}

}
