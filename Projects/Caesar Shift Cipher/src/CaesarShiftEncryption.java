import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CaesarShiftEncryption {
	private String option;
	private String input;
	private ArrayList<String> letter = new ArrayList<>();
 	private ArrayList<String> a = new ArrayList<>();
 	
	public CaesarShiftEncryption(String m, String c, int n)throws IOException{
		option = m;
		input = c;
		File fileName = new File("letters.txt");
	    Scanner inFile = new Scanner(fileName);
		while(inFile.hasNext()) {
	    	letter.add(inFile.nextLine());
	    }
	    inFile.close();
	}
	
	public String encrypt(int n){
		final int num = n;
		if(option.equals("E")) {
			for(int i = 0; i <= input.length() - 1; i++) {
		   		 char c = input.charAt(i);
		   		if (Character.isWhitespace(c)){
					a.add(" ");
				} 
			    	 for(int l = 0; l <= letter.size() - 1;l++) {	
			    		 String w = letter.get(l);
			    		 char d = w.charAt(0);
			    		if (c == d) {
			    			l += num;
			    			if(l >= 26) {	
			    				a.add(letter.get(l - 26));
			    			} else {
			    				a.add(letter.get(l));
			    			}
			    		} 
			    	}
			    }
		    for(int i = 0; i <= a.size() - 1; i++) {
		    	System.out.print(a.get(i));
		    }	
		}
		return "";
	}
	
}
