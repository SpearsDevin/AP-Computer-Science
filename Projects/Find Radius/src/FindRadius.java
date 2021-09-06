 import java.util.Scanner;
 
 
/*class FindRadius {
	public static void main(String[] args) {
		double radius;
		double area;
		
		radius = 20;
		area = radius * radius * 3.14159;
		
		System.out.println("The area for the circle is " + radius + " is " + area);
	}
}
*/







 class FindRadius {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for Radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * 3.14159;
        
        System.out.println(radius + " area is " + area);
	}
}
