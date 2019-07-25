package com.lollipop.lollipopdemo.Algorithm;

import java.lang.reflect.Array;

/**
 * 归并排序
 */
public class MergeSort {

    private static int array[] = new int[]{1, 3, 1, 2, 4, 4, 9, 6, 3, 6, 1};

    public static void main(String[] args) {
        if (array != null && array.length > 0) {
            int[] sort = sort(0, array.length - 1);
            LogUtil.log(sort);
        }
    }

    private static int[] sort(int start, int end) {
        if (start >= end)
            return new int[]{array[start]};
        int middle = (start + end) / 2;
        int[] frontArray = sort(start, middle);
        int[] behindArray = sort(middle + 1, end);

        int i = 0, j = 0, k = 0;
        int[] sortArray = new int[frontArray.length + behindArray.length];
        while (i < frontArray.length && j < behindArray.length) {
            sortArray[k++] = frontArray[i] > behindArray[j] ? behindArray[j++] : frontArray[i++];
        }
        while (i < frontArray.length)
            sortArray[k++] = frontArray[i++];
        while (j < behindArray.length)
            sortArray[k++] = behindArray[j++];
        return sortArray;
    }

    private static void merge() {

    }
}
