package com.sww;

import java.util.HashSet;

/**
 * @author sww
 */
public class WeekThree {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(result(str));
    }

    static int result(String str) {
        int result = 0;
        int arrayLength = str.length();
        HashSet<Character> set = new HashSet<>(16);
        for (int start = 0, end = 0; start < arrayLength && end < arrayLength;) {
            Character c = str.charAt(end++);
            if (set.contains(c)) {
                set.remove(str.charAt(start++));
            } else {
                set.add(c);
                result = Math.max(result, set.size());
            }
        }
        return result;
    }
}
