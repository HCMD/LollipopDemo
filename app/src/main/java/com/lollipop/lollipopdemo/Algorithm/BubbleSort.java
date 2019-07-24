package com.lollipop.lollipopdemo.Algorithm;

/**
 * 冒泡排序：只会操作相邻的两个数据。每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。
 * 如果不满足就让它俩互换。
 *
 */
public class BubbleSort {
    private static int[] array = new int[]{3, 1, 5, 4, 8};

    public static void main(String[] args) {
        sort(array);
        log(array);
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flagBreak = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                int temp = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flagBreak = true;
                }
            }
            if (!flagBreak) //说明数据无交换，提前退出
                break;
        }
    }

    private static void log(int[] array) {
        for (Object i1 : array) {
            System.out.println(i1);
        }
    }
}
