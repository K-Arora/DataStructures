package sudopl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class LeadersOfArray {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int[] arr;
    int testCases = Integer.parseInt(br.readLine());

    for (int t = 0; t < testCases; t++) {
      int size = Integer.parseInt(br.readLine());
      arr = new int[size];
      String line = br.readLine();
      String[] strs = line.trim().split("\\s+");

      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(strs[i]);
      }

      leaders(arr, size, sb);
      sb.append("\n");

      //code
    }
    System.out.println(sb);
  }

  static void leaders(int[] arr, int size, StringBuffer sb) {

    Stack<Integer> stack = new Stack<>();
    int max = arr[size - 1];
    stack.push(arr[size - 1]);

//    Collections.reverse(Collections.singletonList(arr));
    for (int i = size - 2; 0 <= i; i--) {

      if (max <= arr[i]) {
        stack.push(arr[i]);
        max = arr[i];
      }

    }
    while (!stack.isEmpty()) {
      sb.append(stack.pop() + " ");
    }
//    return sb;
  }
}