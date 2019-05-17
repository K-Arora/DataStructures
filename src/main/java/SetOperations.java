import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class SetOperations {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();

    String line = br.readLine(); // for test cases
    String[] str = line.trim().split("\\s+");
    int testCases = Integer.parseInt(str[0]);
    Set<Integer> set1;
    Set<Integer> set2;

    int operation;
    for (int t = 0; t < testCases; t++) {


      set1 = new HashSet<>();
      set2 = new HashSet<>();
      line = br.readLine(); // for size
      readSetElements(br, set1);
      readSetElements(br, set2);

      operation = Integer.parseInt(br.readLine());

      switch (operation) {
        case 2:
          union(set1, set2);
          break;
        case 1:
          intersection(set1, set2);
          break;
        case 3:
          xor(set1, set2);
          break;
        case 4:
          aSubB(set1, set2);
          break;
        case 5:
          bSubA(set1, set2);
          break;
      }
    }
  }

  private static void readSetElements(BufferedReader br, Set<Integer> set) throws IOException {
    String line;
    String[] str;
    line = br.readLine();
    str = line.trim().split("\\s+");

    for (int i = 0; i < str.length; i++) {
      set.add(Integer.parseInt(str[i]));
    }
  }

  private static void union(Set<Integer> set1, Set<Integer> set2) {

    set1.addAll(set2);
    printResult(set1);
  }

  private static void intersection(Set<Integer> set1, Set<Integer> set2) {

    set1.retainAll(set2);
    printResult(set1);
  }

  private static void xor(Set<Integer> set1, Set<Integer> set2) {

    Set<Integer> union = new HashSet<>(set1);
    union.addAll(set2);

    Set<Integer> intersection = new HashSet<>(set1);
    intersection.retainAll(set2);

    aSubB(union, intersection);
  }

  private static void aSubB(Set<Integer> set1, Set<Integer> set2) {

    set1.removeAll(set2);
    printResult(set1);
  }

  private static void bSubA(Set<Integer> set1, Set<Integer> set2) {

    set2.removeAll(set1);
    printResult(set2);
  }

  private static void printResult(Set<Integer> set) {
    StringBuffer sb = new StringBuffer();
    List<Integer> sortedList = new ArrayList<>(set);
    Collections.sort(sortedList);
    Iterator<Integer> itr = sortedList.iterator();
    System.out.print("{");
    while (itr.hasNext()) {
      sb.append(itr.next());

      if (itr.hasNext()) {
        sb.append(", ");
      }
    }

    System.out.println("" + sb + "}");
  }
}
