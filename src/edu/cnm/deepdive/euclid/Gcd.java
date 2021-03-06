/**
 * 
 */
package edu.cnm.deepdive.euclid;

/**
 * @author natedaag
 */
public class Gcd {

	public static void main(String[] args) {

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = gcd(a, b);

			System.out.printf("a=%d, b=%d, GCD=%d %n", a, b, result);
			// TODO Auto-generated method stub
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			System.out.println("Your application requires" + " two numbers typed to the command line.");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Your application requires two numbers typed to the command line.");
		}

		/**
		 * @param args
		 */

	}

	public static int gcd(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);

		if (a == 0)
			return b;
		if (b == 0)
			return a;

		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}

		return a;

	}
}
