/**
 * Project Euler Problem 18 - Maximum Path Sum I:
 * By starting at the top of the triangle below and
 * moving to adjacent numbers on the row below,
 * the maximum total from top to bottom is 23.
 *
 *    3
 *   7 4
 *  2 4 6
 * 8 5 9 3
 *
 * That is, 3 + 7 + 4 + 9 = 23.
 *
 * Find the maximum total from top to bottom of the triangle below:
 *
 *               75
 *              95 64
 *             17 47 82
 *            18 35 87 10
 *           20 04 82 47 65
 *          19 01 23 75 03 34
 *         88 02 77 73 07 63 67
 *        99 65 04 28 06 16 70 92
 *       41 41 26 56 83 40 80 70 33
 *      41 48 72 33 47 32 37 16 94 29
 *     53 71 44 65 25 43 91 52 97 51 14
 *    70 11 33 28 77 73 17 78 39 68 17 57
 *   91 71 52 38 17 14 91 43 58 50 27 29 48
 *  63 66 04 68 89 53 67 30 73 16 69 87 40 31
 * 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 *
 * NOTE: As there are only 16384 routes,
 * it is possible to solve this problem by trying every route.
 * However, Problem 67, is the same challenge with a triangle containing
 * one-hundred rows; it cannot be solved by brute force,
 * and requires a clever method! ;o)
 *
 * @author  Nathan Tsai
 * @version 1.0, 10 Jan 2018
 * @since   9 Jan 2018
 */

public class Problem18 {

  private static int[][] triangle = {
    {75},
    {95, 64},
    {17, 47, 82},
    {18, 35, 87, 10},
    {20,  4, 82, 47, 65},
    {19,  1, 23, 75,  3, 34},
    {88,  2, 77, 73,  7, 63, 67},
    {99, 65, 04, 28,  6, 16, 70, 92},
    {41, 41, 26, 56, 83, 40, 80, 70, 33},
    {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
    {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
    {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
    {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
    {63, 66,  4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
    { 4, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60,  4, 23}
  };

  /**
   * Runs the program and prints the solution of the problem to System.out.
   *
   * @param args the input taken in from the command line during runtime
   */
  public static void main(String[] args) {
    System.out.println(
      "The maximum total from top to bottom of the triangle is: " +
      pathSum(triangle));
  }

  /**
   * Returns the maximum path sum of the triangle provided by working from
   * the bottom up and cumulatively adding up the maximum adjacent terms.
   *
   * Implements method described here: https://stackoverflow.com/a/6542279.
   *
   * @param  triangleArray the 2-dimensional integer array containing the
   *                       triangle of which you want to find the max path sum.
   * @return               the value of the best path sum through the triangle
   */
  public static int pathSum(int[][] triangleArray) {

    // Initialize to the top entry
    int sum = triangleArray[0][0];

    // Iterate from penultimate (second to last) row to the first row.
    for (int row = triangleArray.length - 2; row >= 0; row--){

      // Iterate through the columns of the row.
      for (int index = 0; index < triangleArray[row].length; index++) {

        // Sets the current row to the sum of the existing entry and the largest
        // adjacent number in the row below.
        // See the link above.
        triangleArray[row][index] = triangleArray[row][index] +
          ((triangleArray[row + 1][index] > triangleArray[row + 1][index + 1]) ?
          triangleArray[row + 1][index] : triangleArray[row + 1][index + 1]);
      }
    }

    // Return the top triangle array entry comtaining the max sum path.
    return triangleArray[0][0];
  }
} // End class Problem18
