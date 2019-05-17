import java.time.LocalDate;
import java.util.Date;

public class javaDateTypes {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println("Date() : " + date);

    Date date1 = new Date(2017,1,1);

    int a = LocalDate.now().getYear();

    final LocalDate TEST_DATE = LocalDate.of(2016, 1, 1);



  }
}
