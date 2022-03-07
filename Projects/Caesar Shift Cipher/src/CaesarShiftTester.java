/*
 * Devin Spears
 * 3/7/2022
 * This program takes in user input then moves the letters 3 to right and also decrypts messages
 */

import java.io.IOException;
import java.util.Scanner;

public class CaesarShiftTester {
	public static void start() throws IOException{
		
		String m = "";
		Scanner in = new Scanner(System.in);
		while(!m.equals("Q")) {
			Scanner i = new Scanner(System.in);
			System.out.print("Please enter D for Decrypt and E for Encrypt (q to exit): ");
			 m = i.nextLine();
			m = m.toUpperCase();
			if(m.equals("Q"))break;

			System.out.print("Please enter message: ");
			String c = i.nextLine();
			System.out.print("Please enter a shift key: ");
			int n = i.nextInt();
			c = c.toUpperCase();
			CaesarShiftDecryption decode = new CaesarShiftDecryption(m, c, n);
			CaesarShiftEncryption encode = new CaesarShiftEncryption(m, c, n);
			System.out.println(encode.encrypt(n) + decode.decrypt(n));
			
		}
		
	}

	public static void main(String[] args) throws IOException  {
		start();
	}

}
