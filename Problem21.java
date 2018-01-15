/**
 * Project Euler Problem 21 - Amicable Numbers:
 * Let d(n) be defined as the sum of proper divisors of n
 * (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and
 * each of a and b are called amicable numbers.
 *
 * For example, the proper divisors of 220 are
 * 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 *
 * Evaluate the sum of all the amicable numbers under 10000.
 *
 * @author  Nathan Tsai
 * @version 1.0, 15 Jan 2018
 * @since   13 Jan 2018
 */

public class Problem21 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.println(
      "The sum of all the amicable numbers under 10000 is: " + amicable(10000));
  }

  /**
   * Returns the sum of the amicable numbers under the specified maximum
   * number by iterating through possible values, checking amicability, and
   * adding it to a sum.
   *
   * @param  maxBound the maximum boundary that amicable numbers must be under
   * @return          the sum of the amicable numbers under the maxBound
   */
  public static int amicable(int maxBound) {

    // Initialize variables.
    int sum = 0;
    int a, b;

    // Iterate through values of a.
    for (a = 1; a < maxBound; a++) {

      // Set b to be sum of divisors of a.
      b = sumDivisors(a);

      // Adds one amicable number to the sum
      // The other amicable number of the pair will be added later as
      // a increments.
      if (a == sumDivisors(b) && a != b && b < maxBound) {
        sum = sum + a;
      }
    }

    return sum;
  }

  /**
   * Returns the sum of the divisors of the specified number by adding up
   * pairs of each divisor to a sum.
   *
   * @param  num the number of which sum of divisors is returned
   * @return     the sum of the divisors of the number
   */
  public static int sumDivisors(int num) {

    // Start at 1 because all numbers are divisible by 1.
    int sum = 1;

    // Iterate from 2 to the "square root" of the number
    // so you only have to iterate half the values.
    for (int i = 2; i * i < num; i++) {

      // Add the divisor and its pair to the sum.
      if (num % i == 0) {
        sum = sum + (i) + (num / i);
      }
    }

    return sum;
  }
} // End class Problem21
