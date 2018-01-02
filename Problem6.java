/**
 * Project Euler Problem 6 - Sum Square Difference:
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385.
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025.
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 *
 *
 *
 * @author  Nathan Tsai
 * @version 1.0, 1 Jan 2018
 * @since   1 Jan 2018
 */
public class Problem6 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    // System.out.printf("The sum of the squares of the first 10 natural numbers" +
    // " is %d.\n", sumOfSquares(10));
    // System.out.printf("The square of the sum of the first 10 natural numbers" +
    // " is %d.\n", squareOfSum(10));
    // System.out.printf("The difference between the sum of the squares of the" +
    // " first 10 natural numbers and the square of the sum of the first 10" +
    // " natural numbers is: %d.\n", (squareOfSum(10) - sumOfSquares(10)));
    //
    // System.out.println();

    System.out.printf("The sum of the squares of the first 100 natural numbers"
    + " is %d.\n", sumOfSquares(100));
    System.out.printf("The square of the sum of the first 100 natural numbers"
    + " is %d.\n", squareOfSum(100));
    System.out.printf("The difference between the sum of the squares of the"
    + " first 100 natural numbers and the square of the sum of the first 100"
    + " natural numbers is: %d.\n", (squareOfSum(100) - sumOfSquares(100)));
  }

  /**
   * Returns the integer sum of the squares of all numbers from 1 to n by
   * adding iterative squares.
   *
   * @param  n the natural number bound
   * @return   the integer sum of the squares
   */
  public static int sumOfSquares(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += (i * i);
    }

    return sum;
  }

  /**
   * Returns the integer square of the sum of all numbers from 1 to n by
   * adding each term then squaring the final result.
   *
   * @param  n the natural number bound
   * @return   the integer square of the sum.
   */
  public static int squareOfSum(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    return (sum * sum);
  }
}
