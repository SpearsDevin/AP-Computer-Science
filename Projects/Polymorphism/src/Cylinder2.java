public class Cylinder2 extends Circle2
{
	// instance variables 
	private int height;
	private int X;
	private int Y;

	/**
	 * Constructor for objects of class cylinder
	 */
	public Cylinder2(int x, int y, int rad, int h)
	{
		super(x, y, rad);
		height = h;
		X = x;
		Y = y;
	}
	public String getCenter()
	{
	     return " center is at (" + X + "," + Y + ")";
	}
	public int getHeight()
	{
		
		return height;
	}
}