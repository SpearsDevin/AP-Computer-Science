/*
 * Devin Spears
 * 10/12/2021
 * This program will take in a message and replace words that can be abreviated along with telling how the message is
 * 
 */
import java.util.Scanner;

class TextMessageV2 {

	public static void main(String[] args) {

		Scanner in;
    	in = new Scanner(System.in);
    	System.out.print("Please write a message and include a few of the following words in your message (i don't know, be right back, laughing out loud, because, rightnow)\n");
       
		
		String text = in.nextLine();
		String textTwo = in.nextLine();

		System.out.println("Original Message:\n" + text + textTwo);
		int text1 = text.length();
		int text3 = textTwo.length();
		int add = text1 + text3;
		System.out.println(" message length: " + add + " characters \n");

		String abreviations = text.replace("i don't know", "404");
		abreviations = abreviations.replace("be right back", "BRB");
		abreviations = abreviations.replace("laughing out loud", "LOL");
		abreviations = abreviations.replace("because", "cuz");
		abreviations = abreviations.replace("right now", "rn");
		int text2 = abreviations.length();
		
		String abreviations2 = textTwo.replace("i don't know", "404");
		abreviations = abreviations.replace("be right back", "BRB");
		abreviations = abreviations.replace("laughing out loud", "LOL");
		abreviations = abreviations.replace("because", "cuz");
		abreviations = abreviations.replace("right now", "rn");
		int text4 = abreviations2.length();
		
		int add2 = text2 + text4;
		System.out.println("New Message:\n" + abreviations + abreviations2 + "\n message length: " + add2 + " characters");
		

	}
}
