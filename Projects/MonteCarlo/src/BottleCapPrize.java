import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;
public class BottleCapPrize {

	public static void main(String[] args)  throws IOException{

		 Scanner in = new Scanner(System.in);
	        
	        PrintWriter file = new PrintWriter(new File("trials.txt"));
	        Random randNum = new Random();
	        int rNumber = randNum.nextInt(5) + 1;
	        int counter = 0;
	        
	        System.out.print("Number of trials: ");
	        int trials = in.nextInt();
	        
	        for(int count = 1; count <= trials; count++) {
	        	rNumber = randNum.nextInt(5) + 1;
		        
		        	if(rNumber == 1) {
		        		counter++;
		        }
	        }
    		file.println(counter + " caps would be winners out of "+ trials);
    		
	        double average = (trials / counter);
	        file.println("The average was " + average);
	        file.close();
	        
	        Scanner sameFile = new Scanner(new File("trials.txt"));
	        while(sameFile.hasNextLine()) {
	        	String text = sameFile.nextLine();
	        	System.out.println(text);
	        }
	        sameFile.close();
	}

}
