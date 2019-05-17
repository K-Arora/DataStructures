/*package whatever //do not write package name here */
 package sudopl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class sortBasic {
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

      pIndex = partition(arr, size);
      //   System.out.println("part Arr  "+Arrays.toString(arr));
      //   if (pIndex != 0)
      Arrays.sort(arr, 0, pIndex);//, pIndex, Collections.reverseOrder());
      reverse(arr, 0, pIndex-1);
      Arrays.sort(arr, pIndex, size);
      //   System.out.println("pIndex  "+pIndex);
      for (int i = 0; i < size; i++) {
        sb.append(arr[i] + " ");
      }
      sb.append("\n");
    }
    System.out.println(sb);

  }

  static int partition(int[] arr, int size) {

    int pIndex = 0;
    for (int i = 0; i < size; i++) {

      if (arr[i] % 2 != 0) {

        swap(arr, i, pIndex);
        pIndex++;
      }
    }
    return pIndex;
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