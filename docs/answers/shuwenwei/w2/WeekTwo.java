package com.sww;


/**
 * @author sww
 */
public class WeekTwo {
    public static void main(String[] args) {
        int[] array = {10, 9, 2, 5, 3, 7, 101, 18, 17, 19, 16, 1};
        System.out.println(result(array));
    }

    static int getMaxFromArray(int[] array) {
        if (array == null || array.length == 0){
            return 0;
        }
        int max = array[0];
        for (int i : array) {
            max = Math.max(i, max);
        }
        return max;
    }

    static int result(int[] array) {
        if (array == null) {
            return 0;
        }

        int[] indexLength = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            indexLength[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i]) {
                    indexLength[i] = Math.max(indexLength[j] + 1, indexLength[i]);
                }
            }
        }
        return getMaxFromArray(indexLength);
    }
}
