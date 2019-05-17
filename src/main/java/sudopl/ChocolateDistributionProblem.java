 package sudopl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChocolateDistributionProblem {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();

    int testCases, students, size, arr[];
    testCases = Integer.parseInt(br.readLine());
    String line;
    String[] str;
    int[][] carFine = new int[2][];
    int len = carFine.length;
    for (int t = 0; t < testCases; t++) {


      size = Integer.parseInt(br.readLine());
      carFine = new int[2][size];
      int l = carFine[0].length;
      arr = new int[size];
      line = br.readLine();
      str = line.trim().split("\\s+");

      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(str[i]);
      }
      students = Integer.parseInt(br.readLine());
      int result;
      result = subsetMinimumDifference(arr, students);
      sb.append(result + "\n");
    }
    System.out.println(sb);
  }

  static int subsetMinimumDifference(int[] arr, int students) {

    if (students == 1) {
      return 0;
    }
    Arrays.sort(arr);
    int result = Integer.MAX_VALUE, diff;
    for (int i = 0; i < arr.length - students + 1; i++) {
      diff = arr[i + students - 1] - arr[i];

      if (result > diff) {
        result = diff;
      }
    }
    return result;
  }

  static void countDistinct(int A[], int k, int n)
  {
    for (int i = 0; i < n - k + 1; i++) {
      boolean[] bool = new boolean[101];
      int count = 0;

      for (int j = 0; j < k; j++) {

        if (bool[A[i+j]] == true) count++;
        else bool[A[i+j]] = true;
      }

      System.out.print(k-count + " ");

    }
  }
}
