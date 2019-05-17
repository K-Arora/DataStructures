import java.util.*;
import java.util.stream.Collectors;

public class rotateAndDelete {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int size;
    int[] arr;
    int testCases = sc.nextInt();

    List<Integer> list;
    for (int i = 0; i < testCases; i++) {

      size = sc.nextInt();
      list = new ArrayList<>(size);
//      arr = new int[size];
      for (int j = 0; j < size; j++) {
//        arr[j] = sc.nextInt();
        list.add(sc.nextInt());
      }

      int index;
      for (int k = 0; k < size-1; k++) {

        Collections.rotate(list, -1);
        index = size-1-2*k;
        if (index > 0)
        list.remove(index);
        else
          list.remove(0);

//        index = size - 1 - 2*k;
//        System.out.println("index "+index);
//        arr = rotate(arr);
//        arr = delete(arr, index);
      }
      System.out.println(list.get(0));
//      System.out.println(arr[0]);
//      System.out.println("length "+arr.length);
    }
  }

  static int[] rotate(int[] arr) {
    int size = arr.length;

    int temp = arr[size - 1];
    while (--size > 0) {

      arr[size] = arr[size - 1];
//      System.out.println(size);
    }
    arr[0] = temp;
    return arr;
  }

  static int[] delete(int[] arr, int index) {

    List<Integer> list = Arrays.stream(arr)        // IntStream
        .boxed()        // Stream<Integer>
        .collect(Collectors.toList());
    if (index < 0)
      list.remove(0);
    else
      list.remove(index);

    int[] ret = new int[list.size()];
    for (int i=0; i < ret.length; i++)
    {
      ret[i] = list.get(i).intValue();
    }
    return ret;
  }
}
