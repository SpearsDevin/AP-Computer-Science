
public class cube3 extends Box3{
	
	public cube3(int l, int w, int h)
	{
		super(l, w, h);
	}

	
	public String toString()
	{
	    return "Cube - " + getLength() + " X " + getWidth()+ " X " + getHeight();
	}
	public boolean equals(Box3 o)
	{
	    if (o instanceof cube3) {
	    	cube3 c = (cube3) o;
	        if (getHeight() == c.getHeight() && getWidth() == c.getWidth() && getHeight() == c.getHeight()) return true;
	      }
	      return false;
	}

}
