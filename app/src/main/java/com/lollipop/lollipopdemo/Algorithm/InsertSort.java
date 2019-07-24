package com.lollipop.lollipopdemo.Algorithm;

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
