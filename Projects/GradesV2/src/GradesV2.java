/*
 * Devin Spears
 * 9/16/2021
 * This program will give the Test Grade, Total amount of Points and Average score
 */


public class GradesV2 {

	public static void main(String[] args) {

		//local variables
		int totalPoints = 0; //total points for all tests
		int numTests = 0; //counts number of tests
		int testGrade = 0; //individual test grade
		double average = 0.0; //average grade 
		
		
		//Calculating the test grade, total amount of points and average
		testGrade = 97;
		totalPoints += testGrade; //adding the test grade to total points
		numTests++;	//Total number of Tests adding 1 each time to know exactly how many test.
		average = totalPoints / numTests; // average is equal to total points divided by the number of tests
		System.out.println("n = " + numTests + "  New Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average score: " + average);
		
		//Calculating the test grade, total amount of points and average. Same comments for lines 19-23
		testGrade = 79;
		totalPoints += testGrade;
		numTests++;
		average = totalPoints / numTests;
		System.out.println("n = " + numTests + "  New Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average score: " + average);
		
		//Calculating the test grade, total amount of points and average. Same comments for lines 19-23
		testGrade = 83;
		totalPoints += testGrade;
		numTests++;
		average = totalPoints / (double)numTests;
		System.out.println("n = " + numTests + "  New Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average score: " + average);
		
		//Calculating the test grade, total amount of points and average. Same comments for lines 19-23
		testGrade = 88;
		totalPoints += testGrade;
		numTests++;
		average = totalPoints / (double)numTests;
		System.out.println("n = " + numTests + "  New Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average score: " + average);
		
		//Calculating the test grade, total amount of points and average. Same comments for lines 19-23
		testGrade = 67;
		totalPoints += testGrade;
		numTests++;
		average = totalPoints / numTests;
		System.out.println("n = " + numTests + "  New Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average score: " + average);
		
		//Calculating the test grade, total amount of points and average. Same comments for lines 19-23
		testGrade = 89;
		totalPoints += testGrade;
		numTests++;
		average = totalPoints / (double)numTests;
		System.out.println("n = " + numTests + "  New Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average score: " + average);
		
		//Calculating the test grade, total amount of points and average. Same comments for lines 19-23
		testGrade = 99;
		totalPoints += testGrade;
		numTests++;
		average = totalPoints / (double)numTests;
		System.out.println("n = " + numTests + "  New Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average score: " + average);
		
	}

}
