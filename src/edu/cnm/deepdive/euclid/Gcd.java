/**
 * 
 */
package edu.cnm.deepdive.euclid;

/**
 * @author natedaag
 *
 */
public class Gcd {

	public static void main(String[] args) {

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.printf("a=%d, b=%d %n", a, b);
			// TODO Auto-generated method stub
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			System.out.println("Your application requires" + 
		" two numbers typed to the command line.");
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("Your application requires two numbers typed to the command line.");
		}
		/**
		 * @param args
		 */

	}

}
