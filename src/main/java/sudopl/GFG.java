/*package whatever //do not write package name here */
package sudopl;

import java.util.Scanner;

public class GFG {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int test = scan.nextInt();
    while (test-- > 0) {
      int n = scan.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
      }
      int maxLength = 0;
      int currentMax = 0;
      int currLength = 0;
      String result = "";
      int total = 0;
      StringBuffer tempRes = new StringBuffer();
      for (int i = 0; i < n; i++) {
        if (arr[i] >= 0) {
          total += arr[i];
          currLength++;
          tempRes.append(arr[i] + " ");
        } else {
          if (total > currentMax || (total == currentMax && currLength > maxLength)) {
            result = tempRes.toString();
            maxLength = currLength;
            currentMax = total;
          }
          total = 0;
          currLength = 0;
          tempRes.delete(0, tempRes.length());

        }
      }
      if (total > currentMax || (total == currentMax && currLength > maxLength)) {
        result = tempRes.toString();
        maxLength = currLength;
        currentMax = total;
      }
      System.out.println(result);
    }
  }
}