![image](https://github.com/ynccsyd/JAVA_TR/assets/109158340/6d4cca77-26f7-454b-a55c-b9f08b4424ef)
![image](https://github.com/ynccsyd/JAVA_TR/assets/109158340/5600a2e0-f733-4277-bfa8-08b5031f2747)

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        int[][] arrM = new int[size][size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = inp.nextInt();
            if (arr[i] < 0)
                count++;
            arrM[i][i] = arr[i];
            for (int j = 0; j < i; j++) {
                arrM[j][i] = arrM[j][i - 1] + arr[i];
                if (arrM[j][i] < 0)
                    count++;
            }
        }
        System.out.println(count);
        inp.close();
    }
}
```
