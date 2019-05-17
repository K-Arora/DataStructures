//import rx.Observable;

public class practiceRxJava {

  //  public void nonBlock() {
//    Observable<Long> interval = Observable;
//    Observable<Long> interval = Observable.interval(1, TimeUnit.SECONDS);
//    interval.subscribe(i -> {
//      try {
//        Thread.sleep(1000);
//      } catch (InterruptedException e) {
//      }
//      log.info("sub i {}", i);
//    });
//  }

  public static void main(String[] args) {
    example obj = new example(3, 5);
    System.out.println(obj);
  }
}

class example {
  int a;
  int b;

  example(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public String toString() {
    return Integer.toString(this.a) + "\n" + Integer.toString(this.b);
  }
}

