/*
 * Devin Spears
 * 4/6/2022
 * This program takes an array and sorts it by either ascending or descending
 */

public class TestMovie2 {

	public static void main(String[] args) {

		Movie2[] myMovies = new Movie2[10];
		
		myMovies[0] = new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar");
		myMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
		myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
		myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
		myMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
		myMovies[5] = new Movie2("The Curse of the Were‐Rabbit", 2006, "Aardman");
		myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
		myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
		myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
		myMovies[9] = new Movie2("Monsters Inc.", 2001, "Pixar");
		
		System.out.println("Before Sorting:\n");
		printMovies(myMovies);
		System.out.println();
		
		sortTitle(myMovies, 2);
		printMovies(myMovies);
		  
		System.out.println();
		sortYear(myMovies, 1);
		printMovies(myMovies);
		
		System.out.println();
		sortStudio(myMovies, 2);
		printMovies(myMovies);
		
	}
	
	public static void printMovies(Movie2[] m) {
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
	}
	public static void sortTitle(Movie2[] m, int l) {
		if(l == 1) {

			for (int i = 0; i < m.length - 1; ++i) {
		        int min = i;
		        for (int j = i + 1; j < m.length; ++j) {
		            if (m[j].getTitle().compareTo(m[min].getTitle()) < 0) {
		                min = j;
		            }
		        }
		        Movie2 m2 = m[i];
		        m[i] = m[min];
		        m[min] =m2;
		    }			
			
		     System.out.println("Sorted by Title - Descending:\n");
			}
			else {
				
				for (int i = 0; i < m.length - 1; ++i) {
			        int min = i;
			        for (int j = i + 1; j < m.length; ++j) {
			            if (m[j].getTitle().compareTo(m[min].getTitle()) > 0) {
			                min = j;
			            }
			        }
			        Movie2 m2 = m[i];
			        m[i] = m[min];
			        m[min] =m2;
			    }			
				
			     System.out.println("Sorted by Title - Ascending:\n");

			}
	}
	public static void sortYear(Movie2[] m, int x) {
		if(x == 1) {
	     int i, l;
	     Movie2 year;

	     for(i=m.length-1; i>1; i--)
	       for(l=0; l<i; l++)
	        if( m[l].getYear() > m[l+1].getYear()){
	        	year = m[l + 1];
	              m[l + 1] = m[l];
	              m[l] = year;
	           }
	     System.out.println("Sorted by Year - Descending:\n");
		}
		else {
			int i, l;
		     Movie2 year;

		     for(i=m.length-1; i>1; i--)
		       for(l=0; l<i; l++)
		        if( m[l].getYear() < m[l+1].getYear()){
		        	year = m[l + 1];
		              m[l + 1] = m[l];
		              m[l] = year;
		        }
		     System.out.println("Sorted by Year - Ascending:\n");

		  }
	}
	public static void sortStudio(Movie2[] m, int x) {
		if(x == 1) {
		    
			for (int i = 0; i < m.length - 1; ++i) {
		        int min = i;
		        for (int j = i + 1; j < m.length; ++j) {
		            if (m[j].getStudio().compareTo(m[min].getStudio()) < 0) {
		                min = j;
		            }
		        }
		        Movie2 m2 = m[i];
		        m[i] = m[min];
		        m[min] =m2;
		    }			

		     System.out.println("Sorted by Studio - Descending:\n");
			}
			else {
				for (int i = 0; i < m.length - 1; ++i) {
			        int min = i;
			        for (int j = i + 1; j < m.length; ++j) {
			            if (m[j].getStudio().compareTo(m[min].getStudio()) > 0) {
			                min = j;
			            }
			        }
			        Movie2 m2 = m[i];
			        m[i] = m[min];
			        m[min] =m2;
			    }
				
			 System.out.println("Sorted by Studio - Ascending:\n");
		}
	}
}
