package MultiThreading;

// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
  @Override
  public void run() {
    try {
      // Displaying the thread that is running
      System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    } catch (Exception e) {
      // Throwing an exception
      System.out.println("Exception is caught");
    }
  }

}

// Java code for thread creation by implementing
// the Runnable Interface
class MultithreadingInterfaceDemo implements Runnable {
  public void run() {
    try {
      // Displaying the thread that is running
      System.out.println("Thread " +
                             Thread.currentThread().getId() +
                             " is running");

    } catch (Exception e) {
      // Throwing an exception
      System.out.println("Exception is caught");
    }
  }
}


class TestMultiPriority1 extends Thread {
  public void run() {
    System.out.println("running thread name is:" + Thread.currentThread().getName()+"  prior  "+Thread.currentThread().getPriority());
    System.out.println("running thread priority is:" + Thread.currentThread().getPriority());

  }
}
  public class BasicThreadExample1 {

    public static void main(String[] args) {

//      MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
//      multithreadingDemo.start();
//
//
//      Thread runnableThread = new Thread(new MultithreadingInterfaceDemo());
//      runnableThread.start();

      TestMultiPriority1 m1=new TestMultiPriority1();
      TestMultiPriority1 m2=new TestMultiPriority1();
      m1.setName("min-priority-thread");
      m2.setName("max-priority-thread");
      m1.setPriority(Thread.MIN_PRIORITY);
      m2.setPriority(Thread.MAX_PRIORITY);
      m1.start();
      m2.start();
    }
}


//    running thread name is:min-priority-thread  prior - 1
//    running thread name is:max-priority-thread  prior - 10
//    running thread priority is:10
//    running thread priority is:1

//    running thread name is:max-priority-thread  prior  10
//    running thread name is:min-priority-thread  prior  1
//    running thread priority is:10
//    running thread priority is:1
