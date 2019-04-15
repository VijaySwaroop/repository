/*
 * Implement a Thread class to print numbers from 1 to 10,
 * (in both ways by implementing runnable and extending thread class)
 */

public class Simple_60 extends Thread {




  public void run() {
    System.out.println("Thread class exetnded and printing numbers from 1 to 10");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

  }

  public static void main(String[] args) throws InterruptedException {
    

    Simple_60 sp = new Simple_60();
    S60 s2 = new S60();
    
    Thread thread1 = new Thread(sp);
    Thread thread2 = new Thread(s2);
    thread1.start();
    thread2.start();
  }

}

class S60 implements Runnable {

  @Override
  public void run() {
    System.out.println("Class implementing Runnable Inteface and printing nos from 11 to 20");
    for (int i = 11; i <= 20; i++) {
      System.out.println(i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

}



