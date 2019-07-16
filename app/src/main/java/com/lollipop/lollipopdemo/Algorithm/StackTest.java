package com.lollipop.lollipopdemo.Algorithm;

public class StackTest {
    static String[] items = new String[]{};

    public static void main(String[] args) {
//        testStackArray();
        testStackNode();
    }

    private static void testStackNode() {
        StackNode stackNode = new StackNode();
        for (String item : items) {
            stackNode.pushStack(item);
        }
        for (int i = 0; i < items.length; i++) {
            Node node = stackNode.popStack();
            System.out.println(node.value);
        }
    }

    private static void testStackArray() {
        StackArray stack = new StackArray(items.length);
        for (String item : items) {
            stack.pushStack(item);
        }
        for (int i = 0; i < items.length; i++) {
            System.out.println(stack.popStack());
        }
    }
}
