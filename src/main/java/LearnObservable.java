import rx.Observable;
import rx.Subscriber;

public class LearnObservable {

  public static void main(String[] args) {


    rx.Observable<String> observable = rx.Observable.create(subscriber -> {
      subscriber.onStart();
      subscriber.onNext("hellllooooo");
      subscriber.onCompleted();
    });
  }
}

//class Learn {
//
//  rx.Observable<String> observable = rx.Observable.create(new Observable.OnSubscribe<String>() {
//    @Override
//    public void call(Subscriber<? super String> subscriber) {
//      subscriber.onStart();
//      subscriber.onNext("hellllooooo");
//      subscriber.onCompleted();
//    }
//  });
//}