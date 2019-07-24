package com.lollipop.lollipopdemo.Algorithm;

/**
 * 插入排序：分已排序区间和未排序区间，每次从未排序区间取值，从已排序区间倒序遍历，把元素插入到已排序区间中合适的位置
 */
public class InsertSort {
    private static Integer[] array = new Integer[]{1,3,6,4};

    public static void main(String[] args) {
        sort();
        LogUtil.log(array);
    }

    private static void sort() {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else break;
            }
            array[j + 1] = value;
        }
    }
}
