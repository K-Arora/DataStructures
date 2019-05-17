package sudopl;

/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseInGroup {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int[] arr;
    int testCases = Integer.parseInt(br.readLine());

    for (int t = 0; t < testCases; t++) {
      String line = br.readLine();
      String[] strs = line.trim().split("\\s+");

      int size = Integer.parseInt(strs[0]);
      int group = Integer.parseInt(strs[1]);
      arr = new int[size];
      line = br.readLine();
      strs = line.trim().split("\\s+");

      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(strs[i]);
      }
      reverse(arr, size, group);
      for (int i = 0; i < size; i++) {
        sb.append(arr[i] + " ");
      }

      sb.append("\n");

    }
    System.out.println(sb);
  }

  static void reverse(int[] arr, int size, int group) {

    int loops = size % group, temp;
    for (int i = 0; i < size; i = i + group) {
      if (i + group > size) {

        loops /= 2;
        while (loops-- > 0) {
          temp = arr[i];
          System.out.println("i = " + i);
          arr[i] = arr[--size];
          arr[size] = temp;
          i++;
        }
        break;
      }

      for (int j = 0; j < group / 2; j++) {
        temp = arr[j + i];
        arr[j + i] = arr[i + group - j - 1];
        arr[i + group - j - 1] = temp;

      }
    }
  }
}
