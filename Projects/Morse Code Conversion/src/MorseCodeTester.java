/*
 * Devin Spears
 * 3/7/2022
 * This program takes in user input then converts it to morsecode
 */

import java.io.IOException;
import java.util.Scanner;

public class MorseCodeTester {
	public static void start() throws IOException{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a message without punctuation: ");
		String m = in.nextLine();
		
		MorseCode code = new MorseCode(m);
		System.out.println(code.decode());
	}

	public static void main(String[] args) throws IOException {
		start();
	}

}