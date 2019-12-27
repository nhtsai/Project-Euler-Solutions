/**
 * Project Euler Problem 7 - 10001st Prime:
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 *
 * What is the 10001st prime number?
 *
 * @author  Nathan Tsai
 * @version 1.0, 3 Jan 2018
 * @since   1 Jan 2018
 */

public class Problem7 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.println("The 1001st prime number is: " + nthPrime(10001));
  }

  /**
   * Returns the nth prime number by iterating through numbers and counting
   * prime numbers.
   *
   * @param  n the index of the prime number to retrieve
   * @return   the nth prime number
   */
  public static int nthPrime(int n) {

    // Count the prime numbers.
    int index = 0;

    // Iterate through numbers.
    int number = 0;

    // Iterate through numbers and stop when desired index is reached.
    while (index < n) {
      number++;
      if (isPrime(number)) {
        index++;
      }
    }
    return number;
  }

  /**
	 * Returns a boolean if the specified number is prime (true) or not (false).
	 *
	 * @param  n the number to check if it is prime
	 * @return   the boolean true or false if the number is prime or not
	 */
	public static boolean isPrime(int n) {

    // Handles <= 1 cases.
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
} // End class Problem7
