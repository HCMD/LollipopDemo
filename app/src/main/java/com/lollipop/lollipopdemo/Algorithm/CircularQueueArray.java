package com.lollipop.lollipopdemo.Algorithm;

/**
 * 循环队列 数组方式实现
 */
public class CircularQueueArray {
    private Object[] items;
    private int headIndex, tailIndex;
    private int QueueLength;

    public CircularQueueArray(int queueLength) {
        QueueLength = queueLength;
        items = new Object[queueLength];
    }

    private void pushQueue(Object item) {
        //判断队列是否已满
        if ((tailIndex + 1) % QueueLength == headIndex)
            return;
        items[tailIndex] = item;
        tailIndex = (tailIndex + 1) % QueueLength;
    }

    private void popQueue() {
        if (headIndex == tailIndex)
            return;
        headIndex = (headIndex + 1) % QueueLength;
    }
}
