/**
 * Project Euler Problem 22 - Names Scores:
 *
 * Using p022_names.txt, a 46K text file containing over
 * five-thousand first names, begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN,
 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 *
 * @author  Nathan Tsai
 * @version 1.0, 16 Jan 2018
 * @since   15 Jan 2018
 */

import java.util.*;
import java.io.*;

public class Problem22 {

  private static String filename = "Problem22_Names.txt";

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {

    File file = new File(filename);

    try {
      Scanner scan = new Scanner(file);

      while (scan.hasNextLine()) {
        System.out.println();
      }

    } catch (FileNotFoundException e) {
      System.err.print("File not found.\n");
      System.exit(1);
    }

    System.out.println(
      "The Problem22 answer is: ");
  }

  /**
   * Returns the integer 0.
   *
   * @param  n the
   * @return   the
   */
  public static int sumLetters(String name) {
    int sum;

    return sum;
  }
} // End class Problem22
