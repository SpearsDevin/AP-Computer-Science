/*
 * Devin Spears
 * 10/ /2021
 * This program will take your data that you input in the console and give you information based on what you provide
 * 
 */
import java.util.Scanner;
public class NutritonLavelV1
{
    public static void main(String[] args)
    {
        String foodItem;                            //food item
        
        int dailyTotalCalories = 2000;              //max daily calories
        int dailyValueGramsTotalFat = 65;           //fat DRV    
        int dailyValueTotalCarbs = 300;             //carbohydrates DRV       
        int dailyValueFiber = 25;                   //fiber DRV
        int dailyProtein = 50;		                //protein DRV
  
        //object to use the keyboard input methods
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the name of the food item: ");
        foodItem = in.nextLine();
        System.out.println();
        
        //serving size
        System.out.print("How many servings will you eat? ");
        int servingSize = in.nextInt();
        
        
        //calories
        System.out.print("Enter Calories per Serving: ");
        int totalCalories = in.nextInt();
        totalCalories = totalCalories * servingSize;
        int percentTotalCalories = totalCalories * 100 / dailyTotalCalories;
        boolean isTotalCalories = totalCalories < dailyTotalCalories;
        
        //fat
        System.out.print("Enter grams of Total Fat per Serving: ");
        int totalGramsFat = in.nextInt();
        totalGramsFat = totalGramsFat * servingSize;
        int percentTotalFat = totalGramsFat * 100 / dailyValueGramsTotalFat;
        boolean isTotalFat = totalGramsFat < dailyValueGramsTotalFat;
        
        
        
        //carbs
        System.out.print("Enter grams of Carbohydrate per serving: ");
        int totalCarbs = in.nextInt();
        totalCarbs = totalCarbs * servingSize;
        int percentTotalCarbs = totalCarbs * 100 / dailyValueTotalCarbs;
        boolean isTotalCarbs = totalCarbs < dailyValueTotalCarbs;
        
        
        
        //fiber
        System.out.print("Enter Fiber per serving: ");
        int totalFiber = in.nextInt();
        totalFiber = totalFiber * servingSize;
        int percentTotalFiber = totalFiber * 100 / dailyValueFiber;
        boolean isTotalFiber = totalFiber < dailyValueFiber;
        
        
        //protein
        System.out.print("Enter Protein per serving: ");
        int totalProtein = in.nextInt();  
        totalProtein = totalProtein * servingSize;
        int percentTotalProtein = totalProtein * 100 / dailyProtein;
        boolean isTotalProtein = totalProtein < dailyProtein;
        
        //output
        System.out.println("");

        System.out.println("Food: " + foodItem);
        System.out.println("Serving Size: " + servingSize);    
        System.out.println();
        
        System.out.println("Component           Total          Percent          Less than Daily Value ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Calories              " + totalCalories + "             " + percentTotalCalories + "          " + isTotalCalories);
        System.out.println("Fat		      " + totalGramsFat + "             " + percentTotalFat + "          " + isTotalFat);
        System.out.println("Carbohydrates         " + totalCarbs + "             " + percentTotalCarbs + "          " + isTotalCarbs);
        System.out.println("Dietary Fat           " + totalFiber + "             " + percentTotalFiber + "          " + isTotalFiber);
        System.out.println("Protein               " + totalProtein + "             " + percentTotalProtein + "          " + isTotalProtein);

   
    }//end of main method    
}//end of class
		
