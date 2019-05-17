public class LearnSync {
  public static void main(String[] args) {

    System.out.println("Countt  - "+Thread.activeCount());
//    Sender sender = new Sender();

//    ThreadedSend t1 = new ThreadedSend("message1", sender);
//    ThreadedSend t2 = new ThreadedSend("2message2", sender);

//    t1.start();
//    t1.run();
//    t2.start();
    System.out.println("cnt - "+Thread.activeCount());

    int count = Thread.activeCount();
    System.out.println("currently active threads = " + count);

    Thread th[] = new Thread[count];
    // returns the number of threads put into the array
    Thread.enumerate(th);

    // prints active threads
    for (int i = 0; i < count; i++) {
      System.out.println(i + ": " + th[i]);
    }


    // wait for threads to end
    try {
//      t1.join();
      System.out.println("TRY - "+Thread.activeCount());
//      t2.join();
    } catch (Exception e) {
      System.out.println("Interrupted");
    }
    System.out.println("cnt3 - "+Thread.activeCount());

  }
}

class Sender {

  void send(String msg) {
    System.out.println("Sending\t" + msg);
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println("Thread  interrupted.");
    }
    System.out.println("\n" + msg + " Sent");
  }
}

// Class for sending a message using Threads
class ThreadedSend extends Thread {
  Sender sender;
  private String msg;
  private Thread thread;

  // Recieves a message object and a string message to be sent
  ThreadedSend(String m, Sender obj) {
    msg = m;
    sender = obj;
  }

  @Override
  public void run() {
    // Only one thread can send a message at a time.

    synchronized (sender) {
      // synchronizing the sender object
      sender.send(msg);
    }

  }
}
