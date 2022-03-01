
public class Box3 extends Rectangle3
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
	    return getClass().getName()+" - " + getLength() + " X " + getWidth() + " X " + height;
	}
	public boolean equals(Box3 o)
	{
	    if (o instanceof Box3) {
	        Box3 c = (Box3) o;
	        if (height == c.getHeight() && getWidth() == c.getWidth() && getHeight() == c.getHeight()) return true;
	      }
	      return false;
	}

}
