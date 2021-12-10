/*
 * Devin Spears
 * 12/8/2021
 * This program will calculate the y coordinate with the Pythagorean Theorem
 */
public class PointsOnACircleV1 {

	public static void main(String[] args) {
		double r = 1.0;
		double x = 1.0;
		double y = 1.0;
		System.out.println("\t  Points on a Circle of a Radius " + r);
		System.out.println("\t  x1\ty1\t\tx2\ty2");
		System.out.println("--------------------------------------------------");
		
		for(int counter = 0; counter < 20; counter++){
            x-= 0.1;
            double sumY = Math.sqrt((Math.pow(r, 2) - Math.pow(x, 2)));
            System.out.printf("\t%5.2f\t%5.2f\t\t%5.2f\t%5.2f\n" , x, sumY, x, -1 * sumY);
        }
	}
}
