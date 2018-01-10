/**
 * Project Euler Problem 17 - Number Letter Counts:
 *
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were
 * written out in words, how many letters would be used?
 *
 * NOTE: Do not count spaces or hyphens.
 * For example, 342 (three hundred and forty-two) contains 23 letters and
 * 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance
 * with British usage.
 *
 * @author  Nathan Tsai
 * @version 1.0, 9 Jan 2018
 * @since   8 Jan 2018
 */

public class Problem17 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.println(
      "If all the numbers from 1 to 1000 inclusive were written out in words, " +
      sumLetters(1, 1000) + " letters would be used.");
  }

  /**
   * Returns the sum of the numbers in the specified range by iterating from
   * start to end and adding up the number of letters in each number.
   *
   * @param  start the start of the range, inclusive
   * @param  end   the end of the range, inclusive
   * @return       the sum of the number of letters of all of the number in
   *               the range of numbers, inclusive
   */
  public static int sumLetters(int start, int end) {

    int sum = 0;

    // Iterate through the specified range and add up the number of letters.
    for (int i = start; i <= end; i++) {
      sum += numLetters(i);
    }

    return sum;
  }

  /**
   * Returns the number of letters in the specified number by using recursion,
   * division, and modulus to manipulate the digit being processed.
   *
   * @param  number the number to calculate how many letters it contains
   * @return        the number of letters in the specified number parameter
   */
  public static int numLetters(int number) {

    // zero to nine
    int[] units = {0, 3, 3, 5, 4, 4, 3, 5, 5, 4};

    // 0, ten to nineteen
    int[] teens = {3, 6, 6, 8, 8, 7, 7, 9, 8, 8};

    // twenty to ninety
    int[] tens = {6, 6, 5, 5, 5, 7, 6, 6};

    int hundred = 7; // hundred = 7
    int thousand = 8; // thousand = 8
    int and = 3; // and = 3

    // Handles 0 to 9
    if (number < 10) {
      return units[number];
    }
    // Handles 10 to 19
    else if (number < 20) {
      return teens[number % 10];
    }
    // Handles 20 to 99
    else if (number < 100) {
      return tens[(number / 10) - 2] + numLetters(number % 10);
    }
    // Handles 100 and up
    else {

      // Handles 1000 and up
      if (number >= 1000) {
        return units[number / 1000] + thousand +
          numLetters(number - ((number / 1000) * 1000));
      }

      // Handles 100 to 999
      else if (number >= 100) {

        // Handles cases with 'and'
        if (number % 100 != 0) {
          return units[number / 100] + hundred + and +
            numLetters(number - ((number / 100) * 100));
        }
        // Handles clean hundreds (100, 200, 300, ...)
        else {
          return units[number / 100] + hundred;
        }
      }
    }

    // Random return statement to appease compiler.
    return 0;
  }
} // End class Problem17
