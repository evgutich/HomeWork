package hw_3;

import java.util.Arrays;

public class HWArrEx1 {
    public static void main(String[] args) {
        int[] cycleArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(shiftArray(cycleArray)));
    }

    private static int[] shiftArray(int[] cycleArray) {
        for (int i = 0; i < cycleArray.length - 1; i++) {
            int tmp = cycleArray[i + 1];
            cycleArray[i + 1] = cycleArray[0];
            cycleArray[0] = tmp;
        }
        return cycleArray;
    }
}
