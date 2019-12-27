/**
 * Project Euler Problem 1 - Multiples of 3 and 5:
 * If we list all the natural numbers below 10
 * that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author  Nathan Tsai
 * @version 1.0, 3 Jan 2018
 * @since   13 Sep 2016
 */

public class Problem1 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {

    // Prints sum of multiples of 3 or 5 under 10
    // System.out.println(multiples(10));

    // Prints sum of multiples of 3 or 5 under 1000
    System.out.println("The sum of all multiples of 3 or 5 below 1,000 is: " +
      multiples(1000));
  }

  /**
   * Returns the sum of the multiples of 3 or 5 under the specified integer
   * parameter.
   *
   * @param  n the integer bound under which to find multiples of 3 or 5
   * @return   the sum of the multiples of 3 or 5
   */
  public static int multiples(int n) {
    // Initialzes sum
    int sum = 0;

    // Iterates through all numbers from [0,n).
    for (int i = 0; i < n; i++) {

      // Adds number to sum if it is a multiple of 3 or 5
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }
   }

   // Returns final sum
   return sum;
  }
} // End class Problem1
