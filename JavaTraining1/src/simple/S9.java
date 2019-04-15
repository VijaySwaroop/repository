package simple;

/*
 * 
 * @author Avijay
 *
 */

public class S9 {
  
  public static void main(String[] args ) {
    /*
     * @param args
     * @visibility Public
     * @returns nothing
     */
   
    System.out.println("Palindrome and Prime Numbers");
    S9 n1 = new S9();
    n1.prime();
  }

  public void prime() {
    int i1 = 0;
    int a1 = 2;
    int j1;
    int r1;
    int sum = 0;
    int temp = a1;
    int temp2 = a1;
    for (i1 = 2; i1 <= 100;) {
      for (j1 = 2; j1 <= a1 - 1; j1++) {
        if (a1 % j1 == 0) {
          break;
        }
      }
      if (a1 == j1) {
        while (temp2 > 0) {
          r1 = temp2 % 10;
          sum = (sum * 10) + r1;
          temp2 = temp2 / 10;
        }
        if (temp == sum) {
          System.out.println(a1 + " is Prime number and  palindrome ");
        }
        i1++;
      }
      a1++;
      sum = 0;
      temp = a1;
      temp2 = a1;
    }
  }
}
