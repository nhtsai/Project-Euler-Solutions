/**
 * Project Euler Problem 20 - Factorial Digit Sum:
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!
 *
 * @author  Nathan Tsai
 * @version 1.0, 13 Jan 2018
 * @since   13 Jan 2018
 */

import java.math.BigInteger;

public class Problem20 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.println("The sum of the digits in the number 100! is " +
      sumDigits(factorial(BigInteger.valueOf(100))));
  }

  /**
   * Returns the factorial value of the parameter n by using a recursive case to
   * find the factorial.
   *
   * @param  n the number of which to find its factorial
   * @return   the factorial of the BigInteger n
   */
  public static BigInteger factorial(BigInteger n) {

    // Base case if n == 1.
    if (n.equals(BigInteger.ONE)) {
      // return 1;
      return BigInteger.ONE;
    }
    // Recursive case to calculate factorial.
    else {
      // return n * factorial(n - 1);
      return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
  }

  /**
   * Returns the sum of the digits of the specified BigInteger number by
   * using modulus and division to add the units digits one by one.
   *
   * @param  sum the BigInteger number to calculate sum of it digits
   * @return     the sum of the digits of the specified BigInteger
   */
	private static BigInteger sumDigits(BigInteger num) {

    // Initialize sum of 0.
    BigInteger sum = BigInteger.ZERO;

    // Execute continuously while number is still greater than 0.
    while (num.compareTo(BigInteger.ZERO) == 1) {

      // Add the units place digit.
      sum = sum.add((num.mod(BigInteger.TEN)));

      // Divide by 10 to move tens place to units place.
      num = num.divide(BigInteger.TEN);
    }

    return sum;
	}
} // End class Problem20
