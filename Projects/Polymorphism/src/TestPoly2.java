
/*
 * Devin Spears
 * 3/1/2022
 * This program finds the center of a each of these circle types that extend from Circle2.
 */
import java.util.ArrayList;

public class TestPoly2 {
	
	public TestPoly2() {
		
	}
	
	public static void showCenter(Circle2 c) {	    
		String id = c.getClass().getName();
		id = "@"+Integer.toHexString(System.identityHashCode(id));
	    System.out.println("For "+c.getClass().getName() + id + c .getCenter());

	}
	
	public static void main(String []args) {
	    ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(new Circle2(2, 4, 6));
        circles.add(new Cylinder2 (10, 15, 3, 4));
        circles.add(new Oval2(25, 10, 4, 7));
        circles.add(new OvalCylinder2(40, 10, 3, 7, 10));

        for (Circle2 circle : circles) {
            showCenter(circle);
            System.out.println();
        }

	}

}