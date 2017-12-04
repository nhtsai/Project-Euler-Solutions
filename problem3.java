/*
 * Project Euler Problem 3 - Largest Prime Factor:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 *
 * @author  Nathan Tsai
 * @version 1.0, 3 Dec 2017
 * @since   20 Feb 2017
 */
public class problem3 {

	/**
	 * Runs the program and prints the solution of the problem to System.out.
	 *
	 * @param args the input taken in from the command line during runtime
	 */
	public static void main(String[] args) {

		// Prints out the largest prime factor under 600,851,475,143
		System.out.println(
			"The largest prime factor of the number 600,851,475,143 is: " +
			primeFac(600851475143L));
	}

	/**
	 * Returns the largest prime factor under the specified bound a process
	 * similar to prime factorization.
	 *
	 * @param  n the bound under which to find the largest prime factor
	 * @return   the largest prime factor
	 */
	public static long primeFac(long n) {

		// Represents quotient after original number n is divided by c
		long factoredNum = n;

		// Initializes the largest factor variable
		long largestFactor = 0;

		// Divides by prime factors, starting with 2
		int c = 2;

		while (c * c <= factoredNum) {

			// Checks if c is a factor
			if (factoredNum % c == 0) {

				// Divides number by factor c
				factoredNum = factoredNum / c;

				// Sets largest prime factor to c
				largestFactor = c;
			}
			else {

				// Increments c to check for other prime factors
				do {
					c++;
				} while (!isPrime((long) c));
			}
		}

		// Sets the remaining factored number to be the largest prime factor
		// if the remaining factored number is greater than the largest prime factor
		if (factoredNum > largestFactor) {
			largestFactor = factoredNum;
		}

		// Return the largest prime factor of n
		return largestFactor;
	}

	/**
	 * Returns a boolean if the specified number is prime (true) or not (false).
	 *
	 * @param  n the number to check if it is prime
	 * @return   the boolean true or false if the number is prime or not
	 */
	public static boolean isPrime(long n) {

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

}
