package medium;

import java.util.Scanner; 

/*
 * 
 * @author Avijay
 *
 */

public class M2 {
  /*
   * @param 
   */
  public static void main(String[] args) {
    /*
     * @param
     */
    int rows ;
    System.out.println("Enter number of rows of Pascal Triangle to Print");
    Scanner a1 = new Scanner(System.in);
    rows = a1.nextInt();
    for (int i = 0; i < rows; i++) {
      int number = 1;
      System.out.format("%" + (rows - i) * 2 + "s", "");
      for (int j = 0; j <= i; j++) {
        System.out.format("%4d", number);
        number = number * (i - j) / (j + 1);
      }
      System.out.println();
      a1.close();
    }
  }
}
