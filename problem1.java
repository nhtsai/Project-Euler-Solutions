/*
 * @author Nathan Tsai
 * @version 9/13/2016
 * 
 * Multiples of 3 and 5:
 * If we list all the natural numbers below 10 
 * that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class problem1 {
  public static void main(String[] args) {
    System.out.println(multiples(10));
    System.out.println(multiples(1000));
  }
  
  public static int multiples(int n)
  {
    int sum = 0;

    for (int i = 0; i < n; i++) {
      
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }

   }

   return sum;
  }
}