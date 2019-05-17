package sudopl;

/*package whatever //do not write package name here */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ImmediateSmaller {
  public static void main(String[] args) throws IOException {

// 		Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Using string buffer to append each output in a string
    StringBuffer sb = new StringBuffer();
    int testCases;
    testCases = Integer.parseInt(br.readLine());
    int size;
    int arr[];
    for (int t = 0; t < testCases; t++) {

      size = Integer.parseInt(br.readLine());
      arr = new int[size];
      // to read multiple integers line
      String line = br.readLine();
      String[] strs = line.trim().split("\\s+");

      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(strs[i]);

        if (i != 0 && arr[i - 1] > arr[i]) {
          sb.append(arr[i] + " ");
        } else if (i > 0) {
          sb.append("-1 ");
        }

      }
      sb.append("-1\n");
    }
    System.out.println(sb);

  }
}