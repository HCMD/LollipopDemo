package com.lollipop.lollipopdemo;

import android.util.Log;
import android.widget.ScrollView;

/**
 * 反转单链表
 */
public class ReverseNode {

    private static int[] valueArray = new int[]{1, 2, 3, 4};

    public static void main(String[] args) {
        Node header = initNodes();
        logNodeValue(header);
//        logNodeValue(reverse(header));
        logNodeValue(reverseByWhile(header));
    }

    private static Node initNodes() {
        Node header = new Node(valueArray[0]);
        Node temp = header;
        for (int i = 1; i < valueArray.length; i++) {
            Node next = new Node(valueArray[i]);
            temp.next = next;
            temp = next;
        }
        return header;
    }

    private static Node reverse(Node header) {
        if (header == null || header.next == null) {
            return header;
        }

        Node temp = header.next;
        Node newHeader = reverse(temp);
        temp.next = header;
        header.next = null;
        return newHeader;
    }

    private static Node reverseByWhile(Node header) {
        Node preNode = null, nextNode;
        while (header != null) {
            nextNode = header.next;
            header.next = preNode;
            preNode = header;
            header = nextNode;
        }
        return preNode;
    }

    private static void logNodeValue(Node temp) {
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    private static void log(Node node) {
        if (node == null)
            return;
        if (node.next == null)
            System.out.println(node.value);
        else{
            System.out.println(node.value);
            log(node.next);
        }
    }
}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}
