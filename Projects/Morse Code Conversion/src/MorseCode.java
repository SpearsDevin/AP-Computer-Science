import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class MorseCode {
	private String message;
    
    public MorseCode(String m){	
		message = m.toUpperCase();
    }
	
	public String decode() throws IOException{
		ArrayList<String> letter = new ArrayList<>();
		ArrayList<String> morse = new ArrayList<>();
		ArrayList<String> a = new ArrayList<>();
		File fileName = new File("letters.txt");
	    Scanner inFile = new Scanner(fileName);

	    while(inFile.hasNext()) {
	    	letter.add(inFile.nextLine());
	    }

	    File fileNam = new File("morsecode.txt");
	    Scanner inFil = new Scanner(fileNam);
	    while(inFil.hasNext()) {
	    	morse.add(inFil.nextLine());
	    }
	    for(int i = 0; i <= message.length() - 1; i++) {
   		 char c = message.charAt(i);
   		if (Character.isWhitespace(c)){
			a.add("/");
		} 
			//System.out.print(message.substring(i));
	    	 for(int l = 0; l <= letter.size() - 1;l++) {	
	    		 String w = letter.get(l);
	    		 char d = w.charAt(0);
	    		if (c == d) {
	    			a.add(morse.get(l));
	    		} 
	    	}
	    }
	    for(int i = 0; i <= a.size() - 1; i++) {
	    	System.out.print(a.get(i));
	    }
	    inFil.close();
	    inFile.close();
		return "";
	}
}

