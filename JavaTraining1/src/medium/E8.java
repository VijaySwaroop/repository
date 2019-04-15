package medium;

public enum E8 implements I1, I2 {
  Winter,Summer;
  private  E8()
  {
    
  }

  @Override
  public void add() {
    int i1 = 10;
    int j1 = 20;
    System.out.println(i1 + j1);
  } 

  @Override
  public void sub() {
    int i2 = 20 ;
    int j2 = 10 ;
    System.out.println(i2 - j2);
  }
}
