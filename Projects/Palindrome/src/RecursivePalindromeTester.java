import java.util.Scanner;

public class RecursivePalindromeTester {

	public static void main(String[] args) {
		String word = "";
		Scanner in = new Scanner(System.in);
		while(!word.equals("q")) {
			System.out.print("Please provide a word to see if its a Palindrome (Enter 'q' to exit): ");
			word = in.next();
			word = word.toLowerCase();
			if(word.equals("q"))break;
			RecursivePalindrome phrase = new RecursivePalindrome();
			
			System.out.println(phrase.words(word));
		}
	}

}
