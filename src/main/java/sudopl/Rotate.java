package sudopl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rotate {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr;
    int size = Integer.parseInt(br.readLine());
    int rotate = Integer.parseInt(br.readLine());
    arr = new int[size];
    // to read multiple integers line
    String line = br.readLine();
    String[] strs = line.trim().split("\\s+");

    for (int i = 0; i < size; i++) {
      arr[i] = Integer.parseInt(strs[i]);
    }

    leftRotate(arr, rotate, size);


  }

  static int gcd(int a, int b) {
    if (b == 0) {
      System.out.println("gcd "+a);
      return a;
    } else {
      return gcd(b, a % b);
    }
  }

  static void leftRotate(int arr[], int d, int n) {
    int i, j, k, temp;

    for (i = 0; i < gcd(d, n); i++) {
      /* move i-th valthues of blocks */
      temp = arr[i];
      j = i;
//      System.out.println("i = " + i + " temp " + temp);
      while (true) {
        k = j + d;
//        System.out.println("k = " + k + " j = " + j);

        if (k >= n) {
          k = k - n;
//          System.out.println("check k exceeded k = "+k);
        }
        if (k == i) {
//          System.out.println("break");
          break;
        }
        arr[j] = arr[k];
//        System.out.println("swapped j and k");
        j = k;
      }
      arr[j] = temp;
    }
  }

}
