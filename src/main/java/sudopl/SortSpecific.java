package sudopl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortSpecific {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int[] arr;
    int pIndex, testCases, size;
    testCases = Integer.parseInt(br.readLine());
    for (int t = 0; t < testCases; t++) {

      String line = br.readLine();
      String[] strs = line.trim().split("\\s+");

      size = Integer.parseInt(strs[0]);
      arr = new int[size];
      line = br.readLine();
      strs = line.trim().split("\\s+");

      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(strs[i]);
      }

      specifcSort(arr, size);

      for (int i = 0; i < size; i++) {
        sb.append(arr[i] + " ");
      }

      sb.append("\n");
    }
    System.out.println(sb);
  }

  static void specifcSort(int[] arr, int size) {

    int left = 0, right = size - 1;

    while (left <= right) {
      while (arr[left] % 2 != 0) {
        left++;
      }

      while (arr[right] % 2 == 0 && right > left) {
        right--;
      }
      if (right > left) {
        swap(arr, left, right);
      } else {
        break;
      }
      left++;
      right--;
    }
    Arrays.sort(arr, 0, left);

    reverse(arr, 0, left-1);
    Arrays.sort(arr, left, size);
  }

  static void swap(int[] arr, int index1, int index2) {

    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }

  static void reverse(int[] input, int start, int last) {

    int middle = last / 2;
    for (int i = 0; i <= middle; i++) {
      int temp = input[i];
      input[i] = input[last - i];
      input[last - i] = temp;
    }
  }
}

//21
//3 53 90 20 96 58 29 14 14 35 89 86 74 8 90 92 53 81 7 67 49
//89 81 67 53 53 49 29 7 3 8 14 14 20 35 58 74 86 90 90 92 96