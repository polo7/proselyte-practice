package com.lesechko.javacore.module_1_2;

import java.util.HashSet;
import java.util.List;

public class Task2 {
    private static boolean hasDublicates(Integer[] a) {
        if (a == null) return false;
        return a.length > new HashSet<>(List.of(a)).size();
    }

//    private static boolean hasDublicates(Integer[] a) {
//        if (a == null || a.length == 0) return false;
//        HashSet<Integer> s = new HashSet<Integer>();
//        for (var el : a) {
//            if (s.contains(el)) return true;
//            s.add(el);
//        }
//        return false;
//    }

    public static void main(String[] args) {
        Integer[] a1 = {4, 5, 6, 6, 8}; // true
        System.out.println(hasDublicates(a1));

        Integer[] a2 = {4, 5, 6, 7, 8}; // false
        System.out.println(hasDublicates(a2));

        Integer[] a3 = null; // false
        System.out.println(hasDublicates(a3));

        Integer[] a4 = {}; // false
        System.out.println(hasDublicates(a4));
    }
}
