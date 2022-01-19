/*
 * Devin Spears
 * 1/19/2022
 * This program takes in the Piecewise functions and calculates them
 * 
 */
public class Recursion {

	Recursion()          //default constructor
    {
    }
    
    public int first(int x){
        if (x <= 10) {
            return -7;
        } else {
          return (x - 4)+2;
        }
    }   
    
    public int second(int x) {
    	if (x <= 25) {
            return 20;
        } else {
          return (x / 12 + 5) - 3;
        }
    }
    
    public int fourth(int x) {
    	if (x <= 20) {
            return -100;
        } else {
          return (x * 2) - 4;
        }
    }
}
