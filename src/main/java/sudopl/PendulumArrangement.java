package sudopl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PendulumArrangement {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int testCases, size;
    Integer[] arr;
    testCases = Integer.parseInt(br.readLine());

    for (int t = 0; t < testCases; t++) {

      size = Integer.parseInt(br.readLine());

      arr = new Integer[size];
      String line = br.readLine();

      String[] strs = line.trim().split("\\s+");

      int length = strs.length;
      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(strs[i]);
      }
      int[] temp = pendulumArray(arr);
      for (int i = 0; i < size; i++) {
        sb.append(temp[i] + " ");
      }
      sb.append("\n");
    }
    System.out.println(sb);

  }

  static int[] pendulumArray(Integer[] arr) {

    int size = arr.length;
    Arrays.sort(arr);
    int[] temp = new int[size];
    int mid;
    if (size % 2 == 0) {
      mid = size / 2 - 1;
    } else {
      mid = size / 2;
    }

    temp[mid] = arr[0];
//    System.out.println("mid "+mid);
//    int left = 2, right = 1;
    int j = 1;
    for (int i = 1; i < size; i += 2) {

      temp[mid + j] = arr[i];
      if (mid < j) {
        break;
      }
      temp[mid - j] = arr[i + 1];
//      System.out.println("temp[mid + j]  "+temp[mid + j]+"  mid "+mid+"  j "+j+"  i "+i);
      j++;
    }
    return temp;
  }
}
