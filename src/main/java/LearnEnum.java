import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

enum Day {

  MONDAY, TUESDAY, FRIDAY, WEDNESDAY, THURSDAY, SATURDAY, SUNDAY

}

public class LearnEnum {
  public static void main(String[] args){
    Set mySet = new TreeSet();

    mySet.add(Day.SATURDAY);
    mySet.add(Day.WEDNESDAY);
    mySet.add(Day.FRIDAY);
    mySet.add(Day.WEDNESDAY);

    for (Object d : mySet) {
//      System.in.available();
      try {
        int a  = System.in.read();
      } catch (IOException e) {
        e.printStackTrace();
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
//    Thing to learn
  }
}
