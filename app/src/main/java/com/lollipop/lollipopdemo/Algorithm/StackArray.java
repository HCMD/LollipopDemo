package com.lollipop.lollipopdemo.Algorithm;

/**
 * 用数组实现顺序栈
 */
class StackArray {
    private String[] items;
    private int n;
    private int stackCount;

    StackArray(int n) {
        this.n = n;
        items = new String[n];
    }

    void pushStack(String item) {
        if (stackCount == n)
            return;
        items[stackCount] = item;
        stackCount++;
    }

    String popStack() {
        if (stackCount == 0)
            return null;
        return items[--stackCount];
    }

     int getStackCount() {
        return stackCount;
    }
}
