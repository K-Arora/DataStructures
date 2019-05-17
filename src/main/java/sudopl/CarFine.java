/*package whatever //do not write package name here */
package sudopl;
import java.util.*;
import java.lang.*;
import java.io.*;

class CarFine {
  public static void main (String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();

    int testCases = Integer.parseInt(br.readLine());
    int cars, date;
    int[][] carFine;
    String[] str;
    String line;
    for(int t = 0; t < testCases; t++) {

      line = br.readLine();
      str = line.trim().split("\\s+");

      cars = Integer.parseInt(str[0]);
      date = Integer.parseInt(str[1]);
      carFine = new int[2][cars];

      line = br.readLine();
      str = line.trim().split("\\s+");

      for(int i = 0; i < str.length; i++)
        carFine[0][i] = Integer.parseInt(str[i]);

      line = br.readLine();
      str = line.trim().split("\\s+");
      for(int i = 0; i < str.length; i++)
        carFine[1][i] = Integer.parseInt(str[i]);


      calculateTotalFine(date, carFine);
    }
  }

  static void calculateTotalFine(int date, int [][]carFine) {


    int sum = 0;
    if(date % 2 == 0) {
      for(int i = 0; i < carFine[0].length; i++)
        if(carFine[0][i] % 2 != 0)
          sum += carFine[1][i];

    } else {
      for(int i = 0; i < carFine[0].length; i++)
        if(carFine[0][i] % 2 == 0)
          sum += carFine[1][i];

    }
    System.out.println(sum);
  }
}