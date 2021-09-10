/*
 * Devin Spears
 * 9/8/21
 * 
 * This program will convert: 
 * 	miles to feet,
 *  miles to kilometers,
 *  kilometers to miles,
 *  pounds to kilograms,
 *  kilograms to pounds,
 *  gallons to liters,
 *  liters to gallons
 *   
 */

class MeasurementConverterV1 {
	 public static void main(String[ ] args) {
		 
		 int miles = 12;
		 int kilometers = 19;
		 int pounds = 54;
		 int kilograms = 87;
		 int gallons = 32;
		 int liters = 36;
		 double mToF;
		 double mToK;
		 double kToM;
		 double kToP;
		 double pToK;
		 double gToL;
		 double lToG;
		 
		 mToF = miles * 5280; //Miles to Feet
		 mToK = miles * 1.60934; //Miles to Kilometers
		 kToM = kilometers * 0.621371; //Kilometers to Miles
		 kToP = pounds * 0.453592; //Pounds to Kilograms
		 pToK = kilograms * 2.20462; //Kilograms to Pounds
		 gToL = gallons * 3.78541; //Gallons to Liters
		 lToG = liters * 0.264172; //Liters to Gallons
		 
		 System.out.println(miles + " miles to feet is: "+ mToF +" feet"); //Miles to Feet
		 System.out.println(kilometers + " kilometers to miles is: "+ kToM + " miles"); // Kilometers to Miles
		 System.out.println(miles + " miles to kilomters is: "+ mToK + " kilometers"); //Miles to Kilometers
		 System.out.println(pounds + " pounds to kilograms is: "+ pToK + " kilograms"); //Pounds to Kilograms
		 System.out.println(kilograms + " kilograms to pounds is: "+ kToP + " pounds"); //Kilograms to Pounds
		 System.out.println(gallons + " gallons to liters is: "+ gToL + " liters"); //Gallons to Liters
		 System.out.println(liters + " liters to gallons is: "+ lToG + " gallons"); //Liters to Gallons

	 }
}
