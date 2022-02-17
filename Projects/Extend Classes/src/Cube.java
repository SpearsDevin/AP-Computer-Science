
public class Cube {

	private int length;
	private int width;
	private int height;
	
	
	public Cube(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	public int getOnes() {
		return length/2;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}
