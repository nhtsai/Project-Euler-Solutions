/**
 * Project Euler Problem 2 - Even Fibonacci Numbers:
 * Each new term in the Fibonacci sequence is
 * generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence
 * whose values do not exceed four million,
 * find the sum of the even-valued terms.
 *
 * @author  Nathan Tsai
 * @version 1.0, 3 Jan 2018
 * @since   20 Feb 2017
 */

public class Problem2 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {

    // Prints out the sum of the even Fibonacci numbers less than 4,000,000
    System.out.println(
      "The sum of all even Fibonacci numbers under 4,000,000 is: " +
      evenFibSum(4000000));
  }

  /**
   * Returns the Fibonacci number under the specified index
   * by using recursion to calculate Fibonacci values.
   *
   * @param  n the index used to find Fibonacci numbers
   * @return   the Fibonacci value
   */
  public static long fibonacci(int n) {

    // Base cases for recursive Fibonacci sequence
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }

    // Fibonacci sequence using recursion
    else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  /**
   * Returns the sum of the even Fibonacci values under the specified limit
   * parameter by using the fibonacci() method to iterate through the
   * Fibonacci values and add the even values.
   *
   * @param  limit the integer limit under which to find the even Fibonacci
   *               values
   * @return       the sum of the even Fibonacci values
   */
  public static int evenFibSum(int limit) {

    // Starts sum at 2 to skip the first 2 terms (0 and 1) and start at 1
    int n = 2;

    // Initializes sum
    int sum = 0;

    // Iterates through Fibonacci numbers under limit
    while (fibonacci(n) <= limit) {

      // Adds the Fibonacci value to the sum if value is even
      if (fibonacci(n) % 2 == 0) {
        // System.out.println(fibonacci(n));
        sum += fibonacci(n);
      }

      // Increments the index of the Fibonacci sequence
      n++;
    }

    // Returns final sum
    return sum;
  }
} // End class Problem2
