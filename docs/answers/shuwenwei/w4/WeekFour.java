package com.sww;

/**
 * @author sww
 */
public class WeekFour {

    public static void main(String[] args) {
        System.out.println(result(7));
    }

    static long result(int n) {
        long current = 1;
        long next = 2;
        long temp;
        for (int i = 1; i < n; i++) {
            temp = next;
            next = current + next;
            current = temp;
        }
        return (long) (current % (1e9+7));
    }
}
