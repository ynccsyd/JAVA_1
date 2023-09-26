package HackerRank.JavaSubarray;

import java.util.*;

public class JavaSubarray {
    public static void main(String[] args) {

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
