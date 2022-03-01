public class Oval2 extends Circle2
{
	// instance variables 
	private int radius2;
	private int X;
	private int Y;

	/**
	 * Constructor for objects of class oval
	 */
	public Oval2(int x, int y, int rad1, int rad2)
	{
		super(x, y, rad1);
		radius2 = rad2;
		X = x;
		Y = y;
	}

	public String getCenter()
	{
	     return " center is at (" + X + "," + Y + ")";
	}
	public int getRadius2()
	{
		
		return radius2;
	}
}