import java.util.Scanner;

public class GuessingGameV1 {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  

		System.out.print("Enter your guess: ");
		int guess = in.nextInt();
		int number =  1 + (int) (Math.random() * 100);
		int count= 0;
		
		while(number > guess) {		
			System.out.println("Too low");
			System.out.print("Enter your guess: ");
			guess = in.nextInt();
			count++;
		}
		
		while(number < guess) {		
			System.out.println("Too High");
			System.out.print("Enter your guess: ");
			guess = in.nextInt();
			count++;
		}
		
		count++;
		System.out.println("\nCongratulations!");
		System.out.println("The random number was: "+ number);
		System.out.println("Number of guesses: " + count);
		
	}
}
