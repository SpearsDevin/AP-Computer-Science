import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CaesarShiftDecryption {
	private String option;
	private String input;
	private ArrayList<String> letter = new ArrayList<>();
 	private ArrayList<String> b = new ArrayList<>();

	public CaesarShiftDecryption(String m, String c, int n)throws IOException{
		option = m;
		input = c;
		File fileName = new File("letters.txt");
	    Scanner inFile = new Scanner(fileName);
		while(inFile.hasNext()) {
	    	letter.add(inFile.nextLine());
	    }
	    inFile.close();
	}
	
	public String decrypt(int n){
		final int num = n;
		if(option.equals("D")) {
			for(int i = 0; i <= input.length() - 1; i++) {
		   		 char c = input.charAt(i);
		   		if (Character.isWhitespace(c)){
					b.add(" ");
				} 
			    	 for(int l = 0; l <= letter.size() - 1;l++) {	
			    		 String w = letter.get(l);
			    		 char d = w.charAt(0);
			    		if (c == d) {
			    			
			    			if(l - num < 0) {	
			    				b.add(letter.get(l + (26 - num)));
			    			} else {
			    				b.add(letter.get(l - num));
			    			}			    		
			    		} 
			    	}
			    }
		    for(int i = 0; i <= b.size() - 1; i++) {
		    	System.out.print(b.get(i));
		    }	
		}
		return "";
	}
}
