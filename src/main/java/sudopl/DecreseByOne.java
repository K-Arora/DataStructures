package sudopl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecreseByOne {

  public static void main(String[] args) throws IOException {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int[] arr;
    int testCases, size;

    System.out.println("Enter size");
    String line = br.readLine();
    String[] strs = line.trim().split("\\s+");

    size = Integer.parseInt(strs[0]);
    arr = new int[size];

    System.out.println("Enter line:");
    line = br.readLine();
    strs = line.trim().split("\\s+");

    for (int i = 0; i < size; i++) {
      arr[i] = Integer.parseInt(strs[i]);
    }



    for (int i = 0; i < size; i++) {
      sb.append(arr[i] -1 + ",");
    }


    System.out.println(sb);
  }
}
