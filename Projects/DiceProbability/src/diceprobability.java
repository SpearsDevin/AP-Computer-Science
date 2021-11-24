import java.util.Random;
import java.util.Scanner;
public class diceprobability {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random randNum = new Random();
        
        int die1, die2; 
        int sum = 0;
        double diceS = 0;
        
        System.out.print("Number of Rolls: ");
        int rolls = in.nextInt();       
        
        System.out.println("Sum of Dice	Probability");
        

		for (sum = 2; sum <= 2 * 11; sum++) {
        	for(int counter = 1; counter <= rolls; counter++) {
        		die1 = randNum.nextInt(11) + 1;
            	die2 = randNum.nextInt(11) + 1;
            	diceS = die1 + die2;                	 
            }
        	double p = (1 / diceS) * 100;
         	System.out.println("    "+ sum + "s: \t" + p);
        }
	}

}
