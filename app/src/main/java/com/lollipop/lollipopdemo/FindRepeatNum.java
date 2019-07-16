package com.lollipop.lollipopdemo;

import android.util.SparseArray;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class FindRepeatNum {
    public static void main(String[] args) {
    }

    private static void findRepeat(int[] args) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int arg : args) {
            map.put(arg, arg);
        }
        Set<Integer> integers = map.keySet();
    }

    private static int[] arrayValue = new int[]{1, 2, 3, 4};



}
