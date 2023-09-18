package com.lesechko.javacore.module_1_2;

import java.util.Arrays;
import java.util.HashMap;

public class Task1 {
    private static int[] twoSum(int[] a, int n) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (hm.containsKey(n - a[i])) return new int[]{hm.get(n - a[i]), i};
            hm.put(a[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17};
        int number = 23;
        System.out.println(Arrays.toString(twoSum(array, number)));
    }
}
