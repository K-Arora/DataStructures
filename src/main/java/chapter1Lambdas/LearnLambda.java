package chapter1Lambdas;

import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LearnLambda {

  public static void main(String[] args) {

    // Different ways to write a lambda

    Runnable noArguments = () -> System.out.println("Runnable without args");

    ActionListener oneArgument = event -> System.out.println("Event with 1 arg");

    Runnable multiStatement = () -> {
      System.out.println("Hello line1");
      System.out.println("Hello line2");
    };


    BinaryOperator<Long> binaryOperator = (x, y) -> (x + y);

    //Even you can mention the type of params

    BinaryOperator<Long> longOperator = (Long x, Long y) -> (x + y);


    // Returns true or false
    // this is type inferring
    Predicate<Integer> atleast5 = x -> x > 5;

    Stream<Integer> integerStream = Stream.of(1, 2, 3);
//    int sum = 0;
//    integerStream.reduce(0, (Integer sum, Integer element) -> {
//      return sum + element;
//    });

    Integer sum1 = integerStream.reduce(0, (Integer sum, Integer element) -> (sum + element));
    System.out.println("  :  " + sum1);

//    Question6
    String string = "CountLowerCaseLetters";
    long count = string
        .chars()
        .filter(Character::isLowerCase)
        .count();

    //    Question7 - return the max count of lowercase letters in a list<String>
    List<String> stringList = Arrays.asList("ab", "CD", "CountLowerCaseLetters");
    Optional<String> largest = stringList.stream()
        .max(Comparator.comparing(s -> s.chars()
                 .filter(Character::isLowerCase)
                 .count()
             )
        );

//    for(int i = 0; i < 10; i++) {
//      System.out.println(i);
//    }
//      double dec =1.2345;
//      System.out.println(new DecimalFormat("0.00").format(1.2345));
//    System.out.println(new DecimalFormat("0.00").format(4));
//    System.out.println(new DecimalFormat("0.00").format(3.40));
//
//
//


    List<String> names = new ArrayList<>();
    names.add("Rams");
    names.add("Posa");
    names.add("Chinni");

    // Getting Spliterator
    Spliterator<String> namesSpliterator = names.spliterator();

    // Traversing elements
    namesSpliterator.forEachRemaining(System.out::println);


    Path filePath = Paths.get("a/b/c/kara.csv");
    String fileName = filePath.getFileName().toString();
    System.out.println(filePath.getParent());

  }
}
