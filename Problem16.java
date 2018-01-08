/**
 * Project Euler Problem 16 - Power Digit Sum:
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 *
 * @author  Nathan Tsai
 * @version 1.0, 8 Jan 2018
 * @since   8 Jan 2018
 */

import java.math.BigInteger;

public class Problem16 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.println("The expression 2^1000 contains digits that add up to " +
      sumDigits(twoPower(1000)));
  }

  /**
   * Returns the desired calculation of base 2 and power n by using the methods
   * of the BigInteger.
   *
   * @param  n the exponent two be calculated with 2 as a base
   * @return   the exponential expression calculation
   */
  public static BigInteger twoPower(int n) {

    // Initialize BigInteger expression value of 2.
    BigInteger exp = BigInteger.valueOf(2);

    // Use the power method to take the expression to the nth power.
    exp = exp.pow(n);

    return exp;
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
} // End class Problem16
