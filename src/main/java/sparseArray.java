import java.util.*;

public class sparseArray {

  private static final Scanner scanner = new Scanner(System.in);

  static int[] matchingStrings(String[] inputStrings, String[] queries) {

    int[] result = new int[queries.length];

    for (int q = 0; q < queries.length; q++) {

      for (int i = 0; i < inputStrings.length; i++) {

        if (inputStrings[i].equals(queries[q])) {

          result[q]++;
        }
      }
    }

    return result;
  }

  static boolean detectLoop(SinglyLinkedListNode head) {
    HashSet<SinglyLinkedListNode> hashSet =  new HashSet<SinglyLinkedListNode>();

    while (head != null) {

      if (hashSet.contains(head))
        return true;
      hashSet.add(head);
      hashSet.clone();
      head = head.next;
    }
    return false;
  }
  static int mergingPointOfTwoLinkedLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

    List<Integer> ll = new LinkedList<>();
    ll.size();

    return 5;
  }

  public static void main(String[] args) {

    String[] nm = scanner.nextLine().split(" ");

    int n = Integer.parseInt(nm[0]);

    int m = Integer.parseInt(nm[1]);

    int[][] queries = new int[m][3];

    for (int i = 0; i < m; i++) {
      String[] queriesRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int j = 0; j < 3; j++) {
        int queriesItem = Integer.parseInt(queriesRowItems[j]);
        queries[i][j] = queriesItem;
      }
    }

    long result = arrayManipulation(n, queries);

    System.out.println("result " + result);

    scanner.close();
  }

  static long arrayManipulation(int n, int[][] queries) {
    long[] zeroes = new long[n];
    long max = Integer.MIN_VALUE;

    for (int i = 0; i < queries.length; i++) {
//      System.out.println("len - "+queries.length);
      for (int j = queries[i][0] - 1; j < queries[i][1]; j++) {

//        System.out.println("i = "+i+" j = "+j);
        zeroes[j] += queries[i][2];
        if (max < zeroes[j]) {
          max = zeroes[j];
        }
      }
    }
    // for (int i = 0; i < zeroes.length; i++) {
    //   if (max < zeroes[i]) {
    //     max = zeroes[i];
    //   }
    // }
    return max;
  }

  static class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
  }

  static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

    // Assuming head1's length is bigger than head2
    int m = lengthOfList(head1);
    int n = lengthOfList(head2);
    int diff = m - n;
    System.out.println("result " + diff);
    // if assumption goes wrong
    if( n > m ) {
      SinglyLinkedListNode temp = head1;
      head1 = head2;
      head2 = temp;
      diff = n - m;
    }
    System.out.println("diff " + diff);
    // as head1 will be bigger
    for(int i = 0; i < diff; i++) {
      head1 = head1.next;
    }

    System.out.println("done " + diff);

    while(head1 != null || head2 != null) {

      if (head1 == head2) {
        return head1.data;
      }
      head1 = head1.next;
      head2 = head2.next;
    }
    return 0;
  }

  static int lengthOfList(SinglyLinkedListNode head) {

    ArrayList<Integer> arr;
    int len = 0;
    while(head != null) {
      len++;
    }
    return len;
  }


}

