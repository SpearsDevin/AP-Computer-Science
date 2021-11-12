import java.util.Scanner;

public class RectangleGenerator {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);  
        System.out.print("Please enter the Length of the Rectangle: ");
		int x = in.nextInt();
		
		System.out.print("Please enter the Height of the Rectangle: ");
		int y = in.nextInt();
		
		System.out.println("");
		for (int r = 1; r <= y; r++) {
			System.out.print("*");
			for (int j = 1; j < x; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");

		
		
		
		// Rectangle with spaces
		
        System.out.print("Please enter the Height of the Rectangle: ");
		int w = in.nextInt();
		
		System.out.print("Please enter the Width of the Rectangle: ");
		int v = in.nextInt();
		
		System.out.println("");
		for (int r = 1; r <= w;) {
			while ( r <= v) {
				System.out.print("*");
				r++;
			}
			for (int e = 1; e <= (w - 2); e++ ) {
				System.out.println("");
				System.out.print("*");
				for (int t = 1; t <= (v - 2); t++) {
					System.out.print(" ");
				}
			System.out.print("*");
			}
			System.out.println("");
			int k = 1;
			while ( k <= v) {
				System.out.print("*");
				k++;
			}
		}

	}

}
