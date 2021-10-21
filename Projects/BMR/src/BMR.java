import java.util.Scanner;

/*
 * Devin Spears
 * 10/19/2021
 * This program will take your name, gender, age,height, and weight to figure out what your Basal Metabolic Rate is.
 */
class BMR {
	public static void main(String[] args) {
	
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        
        System.out.print("Gender (M or F): ");
        char gender = in.next().charAt(0);
        
        System.out.print("Enter your age: ");
        int age = in.nextInt();
		
        System.out.print("Height in inches: ");
        int height = in.nextInt();
        
        System.out.print("Weight in pounds: ");
        int weight = in.nextInt();       
        
        System.out.println("\n\nCalculate Your Basal Metabolism\n\n");
        
        double heightCM = height * 2.54;
        double weightKG = weight / 2.2046;
        boolean isMale = gender == 'M';
        double bmr = 0;
        if (isMale) 
            bmr = (13.7516 * weightKG / 1) + (5.0033 * heightCM / 1) - (6.7550 * age / 1) + 66.4730;
        else
        	bmr = (9.5634 * weightKG / 1) + (1.8496 * heightCM / 1) - (4.6756 * age / 1) + 655.0955;
      
        System.out.println("Name: "+name);
        System.out.println("Gender: "+ gender);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ heightCM);
        System.out.println("Weight: "+ weightKG);
        System.out.println("Basal Metabolic Rate: "+ bmr +" calories per day");
	}
}
