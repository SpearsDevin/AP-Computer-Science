/*
 * Devin Spears
 * 10/19/2021
 * This program will take your age, resting heart rate and exercising heart rate and determine whether or not it is above or below normal rate.
 */
import java.util.Scanner;

public class TargetZone {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

		//Output
		System.out.println("Determine your Target Heart Rate Zone for Cardiovascular Exercise (50% - 85%)\n");
		
		
		//Age input
		System.out.println("Enter your age: ");
		int age = in.nextInt();

		//Resting Heart Rate
		System.out.println("Enter your resting heart rate: ");
		int restingHeart = in.nextInt();
			
		//Heart rate after exercising
		System.out.println("Enter your heart rate after exercising: ");
		int exercisingHeart = in.nextInt();
		
		int mhr = 220 - age;
		int hrr = mhr - restingHeart;
		double l = 0.5 * hrr + restingHeart;
		double h = 0.85 * hrr + restingHeart;
		
		String info = "After just exercising, your heart rate is within your target zone.";
		if(exercisingHeart > h) {
			info = "Heart rate is above target zone.";
		}
		if(exercisingHeart < l) {
			info = "Heart rate is under target zone.";
		}
		
		System.out.println("Your heart rate target zone is between  " + (int)l + " and "+ (int)h);
		System.out.println(info);
		}

}
