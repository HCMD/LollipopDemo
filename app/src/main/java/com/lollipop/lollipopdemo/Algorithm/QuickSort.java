package com.lollipop.lollipopdemo.Algorithm;

public class QuickSort {
    private static int[] array = new int[]{1, 3, 1, 2, 4, 4, 9, 6, 3, 6, 1};

    public static void main(String[] args) {
        int[] sort = sort(array, 0, array.length - 1);
        LogUtil.log(sort);
    }

    private static int[] sort(int[] array, int start, int end) {
        if (start >= end)
            return new int[]{array[start]};
        int partitionItem = partition(array, start, end);
        sort(array, start, partitionItem - 1);
        sort(array, partitionItem + 1, end);
        return array;
    }

    private static int partition(int[] array, int start, int end) {
        int partitionItem = array[end];
        int k = start;
        for (int i = start; i < end; i++) {
            int temp = array[i];
            if (temp <= partitionItem) {
                array[i] = array[k];
                array[k] = temp;
                k++;
            }
        }
        array[end] = array[k];
        array[k] = partitionItem;
        return k;
    }
}
