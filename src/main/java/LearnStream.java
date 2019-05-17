import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Learn about stream, map and filter in Java8
 * https://dzone.com/articles/how-to-use-map-filter-collect-of-stream-in-java-8
 */
public class LearnStream {

  private LearnStream() {
  }

  public static void main(String[] args) {

    // Stream.map(Function mapper) takes a function as an argument

    // Task - Convert this into uppperCase
    List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");

    System.out.println(cities);

    // First way
    List<String> result = new ArrayList<>();
    for (String str : cities) {
      Collections.addAll(result, str.toUpperCase());
    }
    System.out.println(result);


    // Second Way using Java8

    List<String> resultJAVA = cities
        .stream()
        .map(LearnStream::countCharacters)
        .collect(Collectors.toList());

    System.out.println(resultJAVA);

  }

  /**
   * Funtion to count length of strings
   * @param string
   * @return
   */
  private static String countCharacters(String string) {

    Integer len = string.length();
    return len.toString();
  }
  // map() is used to transform one object into other by applying a function.

}
