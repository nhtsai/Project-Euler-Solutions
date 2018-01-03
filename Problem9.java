/**
 * Project Euler Problem 9 - Special Pythagorean Triplet:
 * A Pythagorean triplet is a set of three natural numbers,
 * a < b < c, for which, a^2 + b^2 = c^2.
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * @author  Nathan Tsai
 * @version 1.0, 3 Jan 2018
 * @since   2 Jan 2018
 */
 
public class Problem9 {

  // Initialize Pythagorean triple variables.
  private static int a;
  private static int b;
  private static int c;

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.println("The product of the special Pythagorean triplet is: " +
      pythagoreanProduct(1000));
    System.out.printf("The Pythagorean triplet whose sum is equals 1000 is: " +
      "%d, %d, and %d.\n", a, b, c);
  }

  /**
   * Returns the product of the Pythagorean triple that corresponds with the
   * specified sum by calculating all possible values of a, b, and c.
   *
   * @param sum the desired sum of the Pythagorean triple values
   * @return    the product of the Pythagorean triple
   */
  public static int pythagoreanProduct(int sum) {

    // Initialize the maximum b value.
    int bMax = 0;

    // Iterate through possible values of a.
    for (a = 1; a < sum; a++) {

      // Iterate through possible values of b, accounting for a.
      // Start b at a to avoid repeating (a^2 + b^2) values.
      // Use bMax to ensure that b doesn't exceed the sum.
      for (b = a, bMax = sum - a; b < bMax; b++) {

        // Set c to whatever amount of the sum is left by a and b.
        c = sum - (a + b);

        // Return the product if a Pythagorean triple is found.
        if (a * a + b * b == c * c) {
          return (a * b * c);
        }
      }
    }
    // Return statement to satisfy the compiler.
    return (a * b * c);
  }
} // End class Problem9
