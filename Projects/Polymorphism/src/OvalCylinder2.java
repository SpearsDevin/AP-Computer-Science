
public class OvalCylinder2 extends Oval2
{
	// instance variables 
	private int height;
	private int X;
	private int Y;
	
	/**
	 * Constructor for objects of class ovalCylinder
	 */
	public OvalCylinder2(int x, int y, int rad1, int rad2, int h)
	{
		super(x, y, rad1, rad2);
		height = h;
		X = x;
		Y = y;
	}

	
	public String getCenter()
	{
	     return " center is at (" + X + "," + Y + ")";
	}
}