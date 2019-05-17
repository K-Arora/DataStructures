/*package whatever //do not write package name here */
package sudopl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ClosestNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int[] arr;
    int testCases = Integer.parseInt(br.readLine());
    int result;
    for (int t = 0; t < testCases; t++) {
      String line = br.readLine();
      String[] strs = line.trim().split("\\s+");

      int size = Integer.parseInt(strs[0]);
      int num = Integer.parseInt(strs[1]);

      int diff;
      arr = new int[size];
      line = br.readLine();
      strs = line.trim().split("\\s+");

      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(strs[i]);
      }

      diff = Math.abs(arr[0] - num);
      result = arr[0];
      Arrays.sort(arr);
      for (int i = 1; i < size; i++) {

        if (Math.abs(arr[i] - num) < diff) {
          diff = Math.abs(arr[i] - num);
          result = arr[i];
//          System.out.println("diff "+diff+"  res  "+result);
        } else if ((Math.abs(arr[i] - num) == diff)) {

          if (result < arr[i]) {
            result = arr[i];
          }
        }
      }
      sb.append(result);
      sb.append("\n");

    }
    System.out.println(sb);
  }
}