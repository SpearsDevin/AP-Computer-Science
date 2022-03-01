public class Rectangle3
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
	    return "Rectangle - " + length + " X " + width;
	}
	public boolean equals(Rectangle3 o)
	{
	    if (o instanceof Box3) {
	    	Rectangle3 c = (Rectangle3) o;
	        if (length == c.getLength() && width == c.getWidth()) return true;
	      }
	      return false;
	}
}