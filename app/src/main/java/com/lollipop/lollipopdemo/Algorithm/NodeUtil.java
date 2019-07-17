package com.lollipop.lollipopdemo.Algorithm;

public class NodeUtil {
    public static Node initNodes(int[] valueArray) {
        Node header = new Node(valueArray[0]);
        Node temp = header;
        for (int i = 1; i < valueArray.length; i++) {
            Node next = new Node(valueArray[i]);
            temp.next = next;
            temp = next;
        }
        return header;
    }

    public static Node reverse(Node header) {
        if (header == null || header.next == null) {
            return header;
        }

        Node temp = header.next;
        Node newHeader = reverse(temp);
        temp.next = header;
        header.next = null;
        return newHeader;
    }

    public static Node reverseByWhile(Node header) {
        Node preNode = null, nextNode;
        while (header != null) {
            nextNode = header.next;
            header.next = preNode;
            preNode = header;
            header = nextNode;
        }
        return preNode;
    }

    public static void logNodeValue(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static int getNodeCount(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
