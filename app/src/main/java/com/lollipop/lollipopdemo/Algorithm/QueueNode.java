package com.lollipop.lollipopdemo.Algorithm;

//链式栈
public class QueueNode {
    private int defaultCount;
    private Node head, tail;

    public QueueNode(int defaultCount) {
        this.defaultCount = defaultCount;
    }

    void initHeadNode(Object obj) {
        head = new Node(obj);
        tail = head;
    }

    //入队
    Node pushQueue(Object item) {
        //先判断队列内是否有空余
        int nodeCount = NodeUtil.getNodeCount(head);
        if (nodeCount == defaultCount)
            return head;

        //判断是否是空队列
        if (head == null) {
            initHeadNode(item);
            return head;
        }

        //插入队尾
        Node newTail = new Node(item);
        tail.next = newTail;
        tail = newTail;
        return head;
    }

    //出队
    Node popQueue() {
        //判断是否是空队列
        if (head == null)
            return null;

        //从队首移除
        Node newHead = head.next;
        head = newHead;
        return newHead;
    }
}
