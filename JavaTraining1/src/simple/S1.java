package simple;

public class S1 {

  /*
   * This is main class
   */
  public static double i = 300000;
  public static double j = -30000;

  /*
   * @type void
   * 
   * @param String args
   * 
   * @return nothing
   * 
   * @param n1
   * 
   * @param c1
   */
  public static void main(String[] args) {
    S1 n1 = new S1();
    // Object of S1 initialized
    double c1 = n1.add();
    // C1 is initialized
    System.out.println(c1);
    //Prints the result
  }

  double add() {
    return i + j;
  }
}
