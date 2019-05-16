package hw_3;

import java.util.Arrays;

public class HWArrEx4 {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2},
                {3, 4},
                {5, 6, 7}
        };
        System.out.println(Arrays.toString(linearize(arr)));
    }

    private static int[] linearize(int[][] arr) {
        int arrSize = 0;
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            arrSize = arrSize + arr[i].length;
        }
        int[] linerizeArr = new int[arrSize];
        for (int[] i : arr) {
                for (int j : i) {
                  linerizeArr[count] = j;
                  count++;
                }
        }
        return linerizeArr;
    }
}
