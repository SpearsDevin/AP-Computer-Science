
public class Movie2 {
	private String title;
	private int year;
	private String studio;
	
	public Movie2(String t, int  y, String s) {
		title = t;
		year = y;
		studio = s;
	}
	
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public String getStudio() {
		return studio;
	}
	
	public String toString() {
	return title + "," + year + ","+studio;
	}	
}
