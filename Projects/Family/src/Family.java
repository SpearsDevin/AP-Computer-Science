import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family {

	public static void main(String[] args) throws IOException
	   {
	      String token;
	      File fileName = new File("MaleFemaleInFamily.txt");
	      Scanner inFile = new Scanner(fileName);
	      
	      int size = 0;
	      int sizeB = 0;
	      int sizeBG = 0;
	      int sizeG = 0;
	      
	      while (inFile.hasNext())
	      {
	         token = inFile.next();;
	         
	         if (token.equals("BB")) {
	        	 sizeB++;
	         }
	         if (token.equals("BG")) {
	        	 sizeBG++;
	         }
	         if (token.equals("GG")) {
	        	 sizeG++;
	         }
	         size++;
	      }
	      
	      System.out.println("Sample Size: " + size);
	      System.out.println("Two Boys: " + sizeB);
	      System.out.println("One Boy One Girl: " + sizeBG);
	      System.out.println("Two Girls: " + sizeG);

	      inFile.close();
	}

}
