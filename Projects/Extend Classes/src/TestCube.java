/*
 * Devin Spears
 * 2/12/2022
 * this program is extending the classes of the Cube
 */
public class TestCube {

	public static void main(String[] args) {	
		Cube one = new Cube(4, 4, 4);
		cube(one);
	}
	public static void cube(Cube c) {
		System.out.println("One's dimensions are "+ c.getOnes()+ " X "+ c.getLength());
		System.out.println();
		System.out.println("Cube's dimensions are "+c.getLength()+ " X " + c.getWidth()+ " X " + c.getHeight());
	}
}
