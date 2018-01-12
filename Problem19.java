/**
 * Project Euler Problem 19 - Counting Sundays:
 * You are given the following information,
 * but you may prefer to do some research for yourself.
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4,
 * but not on a century unless it is divisible by 400.
 *
 * How many Sundays fell on the first of the month during the
 * twentieth century (1 Jan 1901 to 31 Dec 2000)?
 *
 * @author  Nathan Tsai
 * @version 1.0, 11 Jan 2018
 * @since   10 Jan 2018
 */

public class Problem19 {

  int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  int[] leap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.println(
      "The Problem19 answer is: " + numSundays(1901, 2000));
  }

  /**
   * Returns the number of Sundays in the specified range of years by using
   * nested if statments to handle each year one by one.
   *
   * @param  startYear the year to start counting
   * @param  endYear   the year to end counting
   * @return           the number of Sundays in the range of years
   */
  public static int numSundays(int startYear, int endYear) {

  /*
    1  Jan 1900 = Monday //  1 day
    7  Jan 1900 = Sunday //  7 days
    14 Jan 1900 = Sunday // 14 days
    21 Jan 1900 = Sunday // 21 days
    28 Jan 1900 = Sunday // 28 days
    4  Feb 1900 = Sunday // 35 days
    11 Feb 1900 = Sunday // 42 days
    18 Feb 1900 = Sunday // 49 days
    25 Feb 1900 = Sunday // 56 days...
    Sundays = if (days_from_Jan_1_1900 % 7) == 0
  */

    // Iterate from start year to end year.
    for (year = startYear; year <= endYear; year++) {

      // Iterate through months of the year.
      for (int monthIndex = 0; monthIndex < 12; monthIndex++) {

        // Handle centuries.
        if (year % 100 == 0) {

          // Handles leap centuries
          if (year % 400 == 0) {

          }
        }
        // Handles other leap years.
        else if (year % 4) {

        }
        // Handle all other non-leap years.
        else {

        }
      }


    }


  }
} // End class Problem19
