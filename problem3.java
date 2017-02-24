/*
 * @author Nathan Tsai
 * @version 2/20/2017
 *
 * Project Euler Problem 3 - Largest Prime Factor:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */

public class problem3 {
	
	public static void main(String[] args) {
		//System.out.println(primeFac(600851475143));
		System.out.println("The largest prime factor of the number 600,851,475,143 is: " + primeFac(600851475143L));
	}

	public static long primeFac(long n) {

		// using a process similar to prime factorization
		// using factoredNum to represent quotient after original number n is divided by incremented counter c
		long factoredNum = n;
		long largestFactor = 0;
		
		// dividing by prime factor
		int c = 2;


		while (c * c <= factoredNum) {

			// checking if current c is a factor
			if (factoredNum % c == 0) {
				
				// dividing by that factor
				factoredNum = factoredNum / c;
				largestFactor = c;
			}
			else {
				c++;
			}
		}

		if (factoredNum > largestFactor) {
			largestFactor = factoredNum;
		}

		return largestFactor;
	}

	public static boolean isPrime(long n) {
		// checking if n is even
		if (n % 2 == 0) {
			return false;
		}

		// checking all other odd factors up to square root
		for (int i = 3; i*i <= n; i+=2) {
			if (n % i == 0) {
				return false;
			}
		}

		// return true if n is prime
		return true;
	}

}
