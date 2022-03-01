/*
 * Devin Spears
 * 3/1/2022
 * This program finds the box or cube that are equal to eachother.
 */
public class testNew {

	public static void main(String[] args) {
        Rectangle3 one = new Rectangle3(5, 20);
        Box3 two = new Box3(4, 4, 4);
        Box3 three = new Box3(4, 10, 5);
        cube3 four = new cube3(4, 4, 4);

        showEffectBoth(one);
        showEffectBoth(two);
        showEffectBoth(three);
        showEffectBoth(four);
        if (two.equals(four)) {
        	System.out.println(two.toString()+ " same size as "+four.toString() );
        } else {
        	System.out.println(two.toString()+ " is not the same size as "+four.toString() );
        }
        if (three.equals(four)) {
        	System.out.println(three.toString()+ " is same size as "+four.toString() );
        }else{
        	System.out.println(three.toString()+ " is not the same size as "+four.toString() );
        }

	}
	public static void showEffectBoth(Rectangle3 r)
	 {
	     System.out.println(r);
	 }
}
