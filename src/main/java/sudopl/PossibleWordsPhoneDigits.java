package sudopl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class PossibleWordsPhoneDigits {

  private static Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>() {
    {
      put(0, "");
      put(1, "");
      put(2, "abc");
      put(3, "def");
      put(4, "ghi");
      put(5, "jkl");
      put(6, "mno");
      put(7, "pqrs");
      put(8, "tuv");
      put(9, "wxyz");
    }
  };
  static String []phone = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz", "" , ""};

  public void printAll(int arr[], int n, int index, ArrayList<Character> result) {

    if (index == n) {

      ArrayList<Character> temp = (ArrayList<Character>)result.clone();
      for (int i = 0; i < temp.size(); i++) {
        System.out.print("" + temp.get(i));
      }
      System.out.println();
      return;
    }

    for (int i = 0; i < phone[arr[index]-1].length(); i++) {
      result.add(phone[arr[index] - 1].charAt(i));
      printAll(arr,n,index+1, result);
      result.remove(result.size()-1);
    }
  }
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringBuffer sb = new StringBuffer();


    int testCases = Integer.parseInt(br.readLine());

    for (int i = 0; i < testCases; i++) {


      int size = Integer.parseInt(br.readLine());
      String line = br.readLine();
      String[] str = line.trim().split("\\s+");

      int[] input = new int[size];
      for (int j = 0; j < size; j++) {
        input[j] = Integer.parseInt(str[j]);
      }
      char[] result = new char[input.length + 1];
      printWord(input, 0, result,size);
    }

  }

  static void printWordsUtil(int[] input) {

    char[] result = new char[input.length + 1];

  }

  static void printWord(int[] number, int curr_digit, char[] output, int n) {

    int i;
    if (curr_digit == n)
    {
      System.out.println(" "+output[0]);
      return ;
    }

    // Try all 3 possible characters for current digir in number[]
    // and recur for remaining digits
    for (i=0; i<hashtable.get(number[curr_digit]).length();i++)
    {
      output[curr_digit] = hashtable.get(number[curr_digit]).charAt(i);
      printWord(number, curr_digit+1, output, n);
      if (number[curr_digit] == 0 || number[curr_digit] == 1)
        return;
    }
  }
}
