/*
 * Project Euler Problem 5 - Smallest Multiple:
 * 2520 is the smallest number that can be divided by each of the numbers
 * from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by
 * all of the numbers from 1 to 20?
 *
 * @author  Nathan Tsai
 * @version 1.0, 1 Jan 2018
 * @since   28 Dec 2017
 */
public class Problem5 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    // System.out.println(smallestDiv(1, 10));

    System.out.println("The smallest positive number that is evenly divisible" +
    " by all of the numbers from 1 to 20 is: " + smallestDiv(1, 20));
  }

  /**
   * Returns the smallest positive number that is evenly divisible by all of the
   * numbers between a and b.
   *
   * @param  a one of the number bound
   * @param  b the other number bound
   * @return   the integer of the smallest positive number that is evenly
   *           divisible by all of the numbers from a to b or b to a.
   */
  public static int smallestDiv(int a, int b) {

    // Handles negative parameters.
    if (a < 0) {
      a *= -1;
      System.out.printf("Setting negative parameter %d to %d.\n", a, (-1 * a));
    }
    if (b < 0) {
      b *= -1;
      System.out.printf("Setting negative parameter %d to %d.\n", b, (-1 * b));
    }

    // Handles 0 case.
    if (a == 0 || b == 0) {
      System.out.println("Error: Invalid Input: 0 cannot be a parameter.");
      System.exit(1);
    }

    // Use ternary operators to find min and max to account for b < a.
    int min = (a < b) ? a : b; // 1
    int max = (a > b) ? a : b; // 3

    // Initialize the case to min.
    int n = min;

    // Iterate from min to min and find lcm of consecutive pairs.
    // Logic: lcm(1, 2) = 2
    //        lcm(1, 2, 3) = lcm( lcm(1,2), 3)
    //        lcm(1, 2, 3, 4) = lcm( lcm( lcm(1,2), 3), 4) and so on.
    while (min < max) {
      n = leastCommonMultiple(n, ++min);
    }
    return n;
  }

  /**
	 * Returns the least common multiple of the two specified integer parameters.
	 *
	 * @param  a the number to use to find lcm
   * @param  b the other number to use to find lcm
	 * @return   the boolean true or false if the number is prime or not
	 */
	public static int leastCommonMultiple(int a, int b) {

    // The LCM of any number and 0 is 0.
    if (a == 0 || b == 0) {
      return 0;
    }

    // Use a ternary operator to set n to the larger number a or b.
    int n = (a > b) ? a : b;

    // Use a forever loop to increment n until both a and b are factors of n.
    while (true) {
      if (n % a == 0 && n % b == 0) {
        return n;
      }
      n++;
    }
  }
}
