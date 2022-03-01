public class Circle2
{
	// instance variables 
	private int x;
	private int y;
	private int radius;

	/**
	 * Constructor for objects of class circle
	 */
	public Circle2(int p_x, int p_y, int r)
	{
		x = p_x;
		y = p_y;
		radius = r;
	}

	public int getRadius()
	{
		
		return radius;
	}
	public String getCenter()
	{
	     return " center is at (" + x + "," + y + ")";
	}
}