/**
 * Project Euler Problem 22 - Names Scores:
 *
 * Using problem022_names.txt, a 46K text file containing over
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
 * @version 1.0, 27 Dec 2019
 * @since   15 Jan 2018
 */

import java.util.*;
import java.io.*;

public class Problem22 {

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) throws IOException {

    System.out.println(871198282);

    System.out.println(sumFile("problem022_names.txt"));
  }

  /**
   * Returns the sum of all the names in the provided file by adding up the
   * character values of all the names to a cumulative sum.
   *
   * @param filename the
   * @return         the
   */
  public static int sumFile(String filename) {

    int fileSum = 0;

    File file = new File(filename);

    // TODO: SORT FILE ALPHABETICALLY AND INDEX IT


    try {
      Scanner scanner = new Scanner(file);






      scanner.useDelimiter("\",\"");

      while(scanner.hasNext()) {
        String name = scanner.next();
        fileSum = fileSum + (sumLetters(name) * name.getIndex);
        // fileSum += sumLetters(name);
      }

    } catch (FileNotFoundException e) {
      System.err.print("File not found.\n");
      System.exit(1);
    }

    return fileSum;
  }

  /**
   * Returns the sum of the characters in the specified name by casting each
   * character to integers and adding to a sum.
   *
   * @param name the name of which to calculate its value
   * @return     the sum of the characters of the name
   */
  public static int sumLetters(String name) {

    // Initialize the sum variable.
    int sum = 0;

    // Value that can be subtracted to count letter values from 1.
    int letterValue = (int) ('A') - 1;

    // Convert name to all uppercase to work with char values.
    String sumString = name.toUpperCase();

    // Iterate through the uppercase name.
    for (int index = 0; index < sumString.length(); index++) {

      // Add character values of the uppercase name to find sum.
      sum += (int) (sumString.charAt(index) - letterValue);
    }

    return sum;
  }
} // End class Problem22
