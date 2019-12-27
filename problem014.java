/**
 * Project Euler Problem 14 - Longest Collatz Sequence:
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the
 * following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem),
 * it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million
 *
 * @author  Nathan Tsai
 * @version 1.0, 7 Jan 2018
 * @since   7 Jan 2018
 */

public class Problem14 {

  // Initialize the array to hold the values of the max Collatz chain.
  private static long[] max = new long[]{0, 0};

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.printf("The longest Collatz chain with a starting number " +
      "under 1,000,000 is %d terms long, with a starting number of %d.\n",
      longestCollatz(1000000)[1], longestCollatz(1000000)[0]);
  }

  /**
   * Returns a long array containing the start number, under the specified start
   * number maximum bound, with the max number of terms in its Collatz chain
   * and the number of terms in that chain.
   *
   * @param  startBound the start number maximum boundary, non-inclusive
   * @return            the long array containing the start number with the most
   *                    Collatz chain terms, and the number of terms
   */
    public static long[] longestCollatz(long startBound) {

    long currentTerms = 0;

    // Iterate through all allowed start numbers under the bound.
    for (long start = 1; start < startBound; start++) {

      // Calculate the number of terms of given start number.
      currentTerms = collatz(start);

      // Set maximums by comparing to current calculations.
      if (currentTerms > max[1]) {
        max[0] = start;
        max[1] = currentTerms;
      }
    }

    return max;
  }

  /**
   * A recursive method that returns the number of calculations it takes to
   * reach the 4-2-1 Collatz Conjecture pattern.
   *
   * @param  n the whole number input to check the numbers
   * @return   the number of calculations until one 4-2-1 pattern is completed
   */
  public static long collatz(long n) {

    long numTerms = 1;

    // Apply Collatz Conjecture while number is larger than 1.
    while (n > 1) {
      if (n % 2 == 0) {
        n = n / 2;
      }
      else {
        n = 3 * n + 1;
      }

      // Increment each calculation to count the number of terms.
      numTerms++;
    }
    return numTerms;
  }

} // End class Problem14
