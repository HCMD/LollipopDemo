package com.lollipop.lollipopdemo.Algorithm;

/**
 * 选择排序算法，分已排序区间和未排序区间。
 * 每次从未排序区间找最小元素，放在已排序区间末尾
 */
public class SelectionSort {

    private static Integer[] array = new Integer[]{4, 1, 8, 2, 3, 9};

    public static void main(String[] args) {
        sort();
        LogUtil.log(array);
    }

    private static void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int value = array[i];
                if (value > array[j]) {
                    array[i] = array[j];
                    array[j] = value;
                }
            }
        }
    }
}
