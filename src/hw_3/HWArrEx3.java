package hw_3;

import java.util.Arrays;

public class HWArrEx3 {

    public static void main(String[] args) {
        int[] arrayA = {23, 47, 81, 95, 2, 5};
        int[] arrayB = {7, 14, 39, 55, 62, 74};
        int[] arrayC = new int[arrayA.length + arrayB.length];
        merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
        System.out.println(Arrays.toString(sort(arrayC)));
    }

    public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
        int aDex = 0, bDex = 0, cDex = 0;
        while (aDex < sizeA && bDex < sizeB)
            if (arrayA[aDex] < arrayB[bDex])
                arrayC[cDex++] = arrayA[aDex++];
            else
                arrayC[cDex++] = arrayB[bDex++];
        while (aDex < sizeA)
            arrayC[cDex++] = arrayA[aDex++];
        while (bDex < sizeB)
            arrayC[cDex++] = arrayB[bDex++];
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int index = i + 1; index < arr.length; index++) {
                if (arr[min_idx] > arr[index]) {
                    min_idx = index;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
        }
        return arr;
    }
}

