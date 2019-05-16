package hw_3;

import java.util.Arrays;

public class HWArrEx2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3, 5, 6, 1, 8, 2, 10};
        System.out.println(Arrays.toString(remoweDuplicate(array)));

    }

    private static int[] remoweDuplicate(int[] arr) {
        int nElems = arr.length;
        for (int i = 0; i < nElems -1; i++) {
            for (int j = 1; j < nElems -1; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        for (int k = j; k < nElems-1; k++)
                            arr[k] = arr[k + 1];
                        nElems--;
                    }
                }
            }
        }
        int[] newArr = new int[nElems];
        int i = 0;
        while (i < nElems) {
            newArr[i] = arr[i];
            i++;
        }
        return newArr;
    }
}

