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
 * @version 1.0, 12 Jan 2018
 * @since   10 Jan 2018
 */

public class Problem19 {

  private static int[] months =
    {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  private static int[] leap =
    {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.printf(
      "%d Sundays fell on the first of the month during the
      * twentieth century\n", numSundays(1901, 2000));
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
      Logic used:
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

    // Use the days in the year 1900 to count Sundays.
    int days = 365 * (startYear - 1900);

    // Number of Sundays on the first of the month.
    int count = 0; 

    // Iterate from start year to end year.
    for (int year = startYear; year <= endYear; year++) {

      // Iterate through months of the year.
      for (int monthIndex = 0; monthIndex < 12; monthIndex++) {

        // Handle centuries.
        if (year % 100 == 0) {

          // Handles leap centuries
          if (year % 400 == 0) {

            // Add one to reach the first day of the month.
            days += 1;

            // Check if the first of the month is a Sunday.
            if (days % 7 == 0) {
              count++;
            }

            // Add the rest of the days of the month.
            days += (leap[monthIndex] - 1);
          }

          // Handles other centuries
          else {

            // Add one to reach the first day of the month.
            days += 1;

            // Check if the first of the month is a Sunday.
            if (days % 7 == 0) {
              count++;
            }

            // Add the rest of the days of the month.
            days += (months[monthIndex] - 1);
          }
        }

        // Handles other leap years.
        else if (year % 4 == 0) {

          // Add one to reach the first day of the month.
          days += 1;

          // Check if the first of the month is a Sunday.
          if (days % 7 == 0) {
            count++;
          }

          // Add the rest of the days of the month.
          days += (leap[monthIndex] - 1);
        }
        // Handle all other non-leap years.
        else {

          // Add one to reach the first day of the month.
          days += 1;

          // Check if the first of the month is a Sunday.
          if (days % 7 == 0) {
            count++;
          }

          // Add the rest of the days of the month.
          days += (months[monthIndex] - 1);
        }
      }
    }

    // Subtract back out the days from the year 1900.
    // days = days - (365 * (startYear - 1900));

    // Return the number of Sundays on the firsts of the months.
    return count;
  }
} // End class Problem19
