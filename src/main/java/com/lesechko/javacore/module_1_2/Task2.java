package com.lesechko.javacore.module_1_2;

import java.util.HashSet;
import java.util.List;

public class Task2 {
    private static boolean hasDuplicates(Integer[] a) { // Холодный старт в 3 раза медленнее, 2й проход на ~5-15%
        if (a == null) return false;
        return a.length > new HashSet<>(List.of(a)).size();
    }

    private static boolean hasDuplicates2(Integer[] a) {
        if (a == null) return false;
        HashSet<Integer> s = new HashSet<Integer>(); // Вопрос: var использовать ОК?
        for (var el : a) { if (!s.add(el)) return true; }
        return false;
    }

    public static void main(String[] args) {
        Integer[] a1 = {4, 5, 6, 6, 8}; // true
        System.out.println("hasDuplicates: " + hasDuplicates(a1));
        System.out.println("hasDuplicates2: " + hasDuplicates2(a1));

        Integer[] a2 = {4, 5, 6, 7, 8}; // false
        System.out.println("hasDuplicates: " + hasDuplicates(a2));
        System.out.println("hasDuplicates2: " + hasDuplicates2(a2));

        Integer[] a3 = null; // false
        System.out.println("hasDuplicates: " + hasDuplicates(a3));
        System.out.println("hasDuplicates2: " + hasDuplicates2(a3));

        Integer[] a4 = {}; // false
        System.out.println("hasDuplicates: " + hasDuplicates(a4));
        System.out.println("hasDuplicates2: " + hasDuplicates2(a4));

        Integer[] a5 = new Integer[10_000_000];
        for (int i = 0; i < a5.length; i++) a5[i] = i;
//        a5[9_000_000] = 5;
//        a5[9_000_000] = 9_500_000;

        var start2 = System.currentTimeMillis();
        System.out.println(hasDuplicates2(a5));
        var end2 = System.currentTimeMillis();
        System.out.println("hasDuplicates2: " + (end2 - start2));

        var start = System.currentTimeMillis();
        System.out.println(hasDuplicates(a5));
        var end = System.currentTimeMillis();
        System.out.println("hasDuplicates: " + (end - start));

        start = System.currentTimeMillis();
        System.out.println(hasDuplicates(a5));
        end = System.currentTimeMillis();
        System.out.println("hasDuplicates: " + (end - start));

        start2 = System.currentTimeMillis();
        System.out.println(hasDuplicates2(a5));
        end2 = System.currentTimeMillis();
        System.out.println("hasDuplicates2: " + (end2 - start2));
    }
}
