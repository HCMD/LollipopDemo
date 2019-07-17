package com.lollipop.lollipopdemo.Algorithm;

public class QueueTest {
    public static void main(String[] args) {
        testQueueNode();
    }

    private static void testQueueNode() {
        int queueDefaultNum = 6;
        int[] valueArray = new int[]{1, 4, 8, 3, 9};
        int[] valueArrayTwo = new int[]{5,2,0};
        QueueNode queueNode = new QueueNode(queueDefaultNum);
        Node headNode = null;
        push(valueArray, queueNode, headNode);
        pop(queueNode,2);
        push(valueArrayTwo, queueNode, headNode);
    }

    private static void pop(QueueNode queueNode,int popNum) {
        System.out.println("出队");
        Node popNode = null;
        for (int i = 0; i < popNum; i++) {
            popNode = queueNode.popQueue();
        }
        NodeUtil.logNodeValue(popNode);
    }

    private static void push(int[] valueArray, QueueNode queueNode, Node headNode) {
        System.out.println("入队");
        for (int i : valueArray) {
            headNode = queueNode.pushQueue(i);
        }
        NodeUtil.logNodeValue(headNode);
    }
}
