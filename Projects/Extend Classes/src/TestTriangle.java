/*
 * Devin Spears
 * 2/12/2022
 * this program is extending the classes of the triangle
 */
public class TestTriangle {

	public static void main(String[] args) {
		Triangle one = new Triangle(4,5,6);
		Equilateral two = new Equilateral(4,5,6);
		IsoscelesRight three = new IsoscelesRight(1.5,1.5,1.5);
		triangle(one);
		System.out.println("");
		triangle(two);
		System.out.println("");
		triangle(three);
	}
	public static void  triangle(Triangle t) {
		System.out.println(t.getClass().getName() +" has side A = "+ t.getSideA()+ ",  B = "+ t.getSideB()+ ",  C = "+ t.getSideC());
	}
}
