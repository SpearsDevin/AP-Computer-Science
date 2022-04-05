/*
 * Devin Spears
 * 4/5/2022
 * This program search through specific elements in an array
 */
public class TestMusic {

	public static void main(String[] args) {

		Music[] myMusic = new Music[10];
		
		myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
		myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
		myMusic[2] = new Music("What If It’s You", 1995, "Reba McEntire");
		myMusic[3] = new Music("Misunderstood", 2001, "Pink");
		myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
		myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
		myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
		myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
		myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
		myMusic[9] = new Music("White Flag", 2004, "Dido");
		
		System.out.println("Music library:");
		System.out.println("---------------");
		printMusic(myMusic);
		System.out.println();
		System.out.println();

		searchTitle(myMusic, "Let Go");
		System.out.println();
		System.out.println();

		searchTitle(myMusic, "Some Day");
		System.out.println();
		System.out.println();

		searchYear(myMusic, 2001);
		System.out.println();
		System.out.println();

		searchYear(myMusic, 2003);
		System.out.println();
		System.out.println();

		searchSinger(myMusic, "Avril Lavigne");
		System.out.println();
		System.out.println();

		searchSinger(myMusic, "Tony Curtis");
		
	}
	public static void printMusic(Music[] m) {
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
	}
	
	public static void searchTitle(Music[] m, String t) {
		System.out.println("Search - Title - "+ t);
		int found = -1; 
	    for(int i = 0; i < m.length; i++)
	       if (m[i].getTitle().compareTo(t) == 0) {
	               found = i;
	               break;
	           }
        if (found != -1) {
            System.out.println("We found "+ t +" in the Library:");
           System.out.println(m[found]);
        }
        else {
           System.out.println(t + " is not in the library");
        }
	}
	
	public static void searchYear(Music[] m, int y) {
		int found = -1; 
        System.out.println("Search - Year - "+ y);
        System.out.println("Find Results:");
        int l = 0;
	    for(int i = 0; i < m.length; i++)
	       if (y == m[i].getYear()) {
	               found = i;
	               if (found != -1) {
	                   System.out.println(m[found]);
	                   l++;
	                }
	               else {
	                   System.out.println("There were no listings for "+y);
	                }
	           }
        
        System.out.println("There were "+l+" listings for "+y);

	}
	
	public static void searchSinger(Music[] m, String s) {
		int found = -1; 
        System.out.println("Search - Singer - "+ s);
        System.out.println("Find Results:");
        int l = 0;
	    for(int i = 0; i < m.length; i++)
	       if (m[i].getSinger().compareTo(s) == 0) {
	               found = i;
	               if (found != -1) {
	                   System.out.println(m[found]);
	                   l++;
	                }
	               else {
	                   System.out.println("There were no listings for "+s);
	                }
	           }
        
        System.out.println("There were "+l+" listings for "+s);
	}
	
}
