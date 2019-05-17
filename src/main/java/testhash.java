public class testhash {


  public static void main(String[] args) {
//    String a = new String("Aa");
//    String b = new String("BB");
//
//    String b = "BB";
//
//    System.out.println("Equals: " + a.equals(b));
//    System.out.println("Hashcode a: " + a.hashCode());
//    System.out.println("Hashcode b: " + b.hashCode());

    ThreadExample threadExample = new ThreadExample();
    System.out.println(threadExample.getState()
                           + "   Thread name: "
                           + threadExample.getName()
                           + "    "
                           + threadExample
                           + "    "
                           + Thread.currentThread().getName());
    threadExample.start();

    RunnableExample runnableExample = new RunnableExample();
    System.out.println(runnableExample.toString() + "   Runnable name: " + runnableExample);
    runnableExample.run();

    Thread t1 = new Thread(runnableExample);
    System.out.println(t1);

    Thread t2 = new Thread(runnableExample);
    System.out.println(t2);


  }
}

class ThreadExample extends Thread {
  @Override
  public void run() {
    System.out.println("thread is running...");
  }
}


class RunnableExample implements Runnable {
  public void run() {
    System.out.println("thread is running in Runnable interface...");

  }
}