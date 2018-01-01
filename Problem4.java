/*
 * Project Euler Problem 4 - Largest Palindrome Product:
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author  Nathan Tsai
 * @version 1.0, 1 Jan 2018
 * @since   4 Dec 2017
 */
public class Problem4 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {

    System.out.println(
      "The largest palindrome made from the product of two 3-digit numbers is: "
      + largestPalindrome(3));
  }

  /**
   * Returns the sum of the multiples of 3 or 5 under the specified integer
   * parameter.
   *
   * @param  n the number of digits
   * @return   the largest palindrome product of two numDigits-digit numbers
   */
  public static int largestPalindrome(int numDigits) {
    int limit = 1;
    int firstNum = 0;
    int secondNum = 0;
    int product = firstNum * secondNum;
    int currentPalindrome = 0;
    int largestPalindrome = 0;

    // Makes limit 1000
    for(int i = 0; i < numDigits; i++) {
      limit = limit * 10;
    }

    // Iterates through 100 to 999
    for (firstNum = limit / 10; firstNum < limit; firstNum++) {

      for(secondNum = limit / 10; secondNum < limit; secondNum++) {

        // 100 * 100, 100 * 101, 100 * 102,
        product = firstNum * secondNum;

        // Set product to palindrome if the
        if (isPalindrome(product)) {
          currentPalindrome = product;
        }

        // Checks if current palindrome is larger than the largest palindrome
        if (currentPalindrome > largestPalindrome) {
          largestPalindrome = currentPalindrome;
        }
      }
    }
    return largestPalindrome;
  }

  /**
   * Checks if the number is a palindrome and returns a boolean.
   *
   * @param number  the number to check
   * @return        whether or not the number is a palindrome
   */
  public static boolean isPalindrome(int number) {

    // Converts number to a string
    String numberString = "" + number;

    boolean result = false;

    int index = 0;

    // Checks number from both sides of the string to see if they are equal
    while (index < (numberString.length() - 1 - index)){

      if (numberString.charAt(index) == numberString.charAt(numberString.length() - 1 - index)) {
        result = true;
        index++;
      }
      else {
        result = false;
        break;
      }
    }
    return result;
  }
} // End class Problem4
