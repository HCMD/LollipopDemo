package com.lollipop.lollipopdemo.Algorithm;

//链式栈
class StackNode {
    private Node node;

    StackNode() {
    }

    Node pushStack(String item) {
        if (node == null) {
            node = new Node(item);
            return node;
        }
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(item);
        return node;
    }

    Node popStack() {
        //空栈
        if (node == null)
            return null;
        //栈中只有一个元素
        if (node.next == null) {
            Node temp = node;
            node = null;
            return temp;
        }
        //栈中有多个元素
        Node temp = node;
        Node preNode = temp;
        while (temp.next != null) {
            preNode = temp;
            temp = temp.next;
        }
        Node popNode = temp;
        preNode.next = null;
        return popNode;
    }
}
