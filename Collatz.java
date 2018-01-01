/*
 * Collatz Conjecture :
 * Pick any whole number. If it's even, divide it by 2. If it's odd, multiply
 * it by 3 and add 1. Then repeat with the answer as the input.
 * The Collatz conjecture states that every whole number integer, right the way
 * up to infinity, will eventually get you trapped in that 4-2-1 loop.
 *
 * Learned about it here: https://www.reddit.com/comments/7n97dk//ds011mx/
 *
 * @author  Nathan Tsai
 * @version 1.0, 31 Dec 2017
 * @since   31 Dec 2017
 */
public class Collatz {

  private static int count = 0;

  /**
   * Runs the collatz conjecture method to count how many calculations it takes
   * until the input reaches the 4-2-1 repeating pattern.
   *
   * @param args The string array from command line input during runtime
   */
  public static void main(String[] args) {

    // Handles non-whole numbers.
    int input = (int) 42.0;

    // Handles negative input.
    if (input < 0) {
      input = input * -1;
    }

    System.out.println("\nCollatz Conjecture of input " + input + " takes " +
    collatz(input) + " calculations until it reaches the 4-2-1 pattern.");
  }

  /**
   * A recursive method that returns the number of calculations it takes to
   * reach the 4-2-1 Collatz Conjecture pattern.
   *
   * @param n The whole number input to check.
   * @return The number of calculations until the 4-2-1 pattern is reached.
   */
  public static int collatz(int n) {
    if (n == 4) {
      return count;
    }
    else if (n % 2 == 0) {
      System.out.println(n + " is even");
      n = n / 2;
      System.out.println("divide it by 2 to equal " + n);
      count++;
      return collatz(n);
    }
    else {
      System.out.println(n + " is odd");
      n = 3 * n + 1;
      System.out.println("multiply by 3 and add 1 to equal " + n);
      count++;
      return collatz(n);
    }
  }
}
