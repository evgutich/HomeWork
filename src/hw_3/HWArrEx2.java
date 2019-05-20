package hw_3;

import java.util.Arrays;

public class HWArrEx2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3, 5, 6, 1, 8, 2, 10};
        System.out.println(Arrays.toString(removeDuplicate(array)));

    }

    private static int[] removeDuplicate(int[] inputArray) {

        int[] removeIndexes = new int[inputArray.length];
        int deletionCounter = 0;
        for (int i = 0, size = inputArray.length; i < size; i++) {
            for (int j = i + 1, size2 = inputArray.length; j < size2; j++) {
                if (inputArray[j] == inputArray[i]) {
                    removeIndexes[j] = 1;
                    deletionCounter++;
                    break;
                }
            }
        }

        int[] newArr = new int[inputArray.length - deletionCounter];
        int i = 0;
        int j = 0;
        while (i < inputArray.length) {
            if (removeIndexes[i] == 0) {
                newArr[j] = inputArray[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}

