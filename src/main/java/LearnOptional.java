import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.Assertions;

public class LearnOptional {

  public static void main(String[] args) {

    String nullName = null;
    System.out.println("name: " + nullName);
    String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
    System.out.println("name: " + name);
    Assertions.assertThat(name).isEqualTo("john");

    whenOptionalFilterWorks_thenCorrect();


    List<String> companyNames = Arrays.asList(
        "paypal", "oracle", "", "microsoft", "", "apple");
    Optional<List<String>> listOptional = Optional.of(companyNames);

    int size = listOptional//.get().size();
        .map(List::size)
        .orElse(0);
    System.out.println(size);
  }

  private static void whenOptionalFilterWorks_thenCorrect() {
    Integer year = 2016;
    Optional<Integer> yearOptional = Optional.of(year);
    boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
    Assertions.assertThat(is2016).isTrue();
    boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
    Assertions.assertThat(is2017).isFalse();
  }
}