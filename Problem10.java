/**
 * Project Euler Problem 10 - Summation of Primes:
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 *
 * @author  Nathan Tsai
 * @version 1.0, 4 Jan 2018
 * @since   2 Jan 2018
 */

public class Problem10 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.println("The sum of all the primes below two million is: " +
      primesBelow(2000000));
  }

  /**
   * Returns the sum of the primes below the specified number bound by iterating
   * through all the numbers below the bound and adding up the prime ones.
   *
   * @param numBound the number under which primes are found
   * @return         the sum of all the prime numbers below the number bound
   */
  public static long primesBelow(int numBound) {
    long sum = 0;

    // Adds all of the primes below the number bound.
    for (int i = 0; i < numBound; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }

    return sum;
  }

  /**
	 * Returns a boolean if the specified number is prime (true) or not (false).
	 *
	 * @param  n the number to check if it is prime
	 * @return   the boolean true or false if the number is prime or not
	 */
	public static boolean isPrime(int n) {

    // Handles 1 and negative cases.
    if (n <= 1) {
      return false;
    }

    // Handles 2 case.
    if (n == 2) {
      return true;
    }

		// Checks if n is even
		if (n % 2 == 0) {
			return false;
		}

		// Checks all other odd factors up to square root
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		// Returns true if n is prime
		return true;
	}
} // End class Problem10
