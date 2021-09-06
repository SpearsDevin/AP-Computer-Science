/*	Devin Spears
	9/2/2021
	This program will run a addition and subtraction sequence then println into the console.
	another program sequence will run division and multiplication then println in the console.
*/


public class CalculationsV5 {
		 public static void main(String[ ] args) {
			 int iNum1 = 4;
			 int iNum2 = 8;
			 int iNum3 = 15;
			 int iNum4 = 23;
			 int iNum5 = 32;
			 int iNum6 = 56;
	
			 double dNum1 = 23.51;
			 double dNum2 = 8.9325;
			 double dNum3 = 15.30987;
			 double dNum4 = 23.3807;
			 double dNum5 = 32.8325;
			 double dNum6 = 56.2346;
	
			 // Addition and Subtraction of iNum1,2,3, and dNum1,2,3
			 System.out.println("Addition and Subtraction");
			 System.out.print(iNum1 + " plus " + iNum2 + " minus " + iNum3 + " = ");
			 System.out.println(iNum1 + iNum2 - iNum3);
			 System.out.print(dNum1 + " plus " + dNum2 + " minus " + dNum3 + " = ");
			 System.out.println(dNum1 + dNum2 - dNum3);
			 System.out.println(); 
			 
			// Multiplication and Division of iNum4,5,6, and dNum4,5,6
			 System.out.println("Multiplication and Division");
			 System.out.print(iNum4 + " multiplied " + iNum5 + " divided " + iNum6 + " = ");
			 System.out.println(iNum4 * iNum5 / iNum6);
			 System.out.print(dNum4 + " multiplied " + dNum5 + " divided " + dNum6 + " = ");
			 System.out.println(dNum4 * dNum5 / dNum6);
			 System.out.println(); 
			 

	}

}
