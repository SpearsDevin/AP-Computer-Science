/*
 * Devin Spears
 * 1/19/2022
 * This program takes in your word and tells you if its a Palindrome
 * 
 */
public class RecursivePalindrome {
	RecursivePalindrome(){
	}
	public String words(String word) {
		
		int amount = (word.length() / 2)+ 1;

		for (int i = 1; i <= amount; i++) {
			if (word.charAt(i - 1) == word.charAt(word.length() - i)) {
				return "is a Palindrome";
			} else {
				return "is not a Palindrome";
			}
		}
		return "error";
	}
}
