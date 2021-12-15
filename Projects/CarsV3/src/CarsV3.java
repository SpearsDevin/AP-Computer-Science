/*
 * Devin Spears
 * 12/15/2021
 * This program takes yours car mileage data and gives you the mpg and distance traveled. 
 */
public class CarsV3 {
	
	private String model;
	private int sMiles1;
	private int eMiles1;
	private double gals1;
	private int dist1;
	private double mpg1;
	
	//Default constructor
	CarsV3(String car, int sMiles, int eMiles, double gals, int dist, double mpg){
		model = car;
		sMiles1 = sMiles;
		eMiles1 = eMiles;
		gals1 = gals;
		dist1 = dist;
		mpg1 = mpg;
		
		
	}
	
	public static int calcDistance(int sMiles, int eMiles) {
		return eMiles - sMiles;
	}
	public static double calcMPG(int dist, double gals) {
		return dist/gals;
	}
	
	public static void main(String[] args) {
		
		String car = "04 Volvo S60R";
		double gals = 18.5;
		int sMiles = 97865;
		int eMiles = 98217;
		int dist = calcDistance(sMiles, eMiles);
		double mpg = calcMPG(dist, gals);		

		CarsV3 car1 = new CarsV3(car, sMiles, eMiles, gals, dist, mpg);

		 System.out.println("\t\t\t\t\tGas Mileage Calculations");
	     System.out.println("Type of Car\tStart Miles\tEnd Miles\tDistance\tGallons\t\tMiles/Gal");
	     System.out.println("============================================================================================");
	     System.out.printf("%10s %8d %15d %14d %15.1f %16.1f", car1.model , car1.sMiles1, car1.eMiles1, car1.dist1, car1.gals1, car1.mpg1);
		
	}
	
}
