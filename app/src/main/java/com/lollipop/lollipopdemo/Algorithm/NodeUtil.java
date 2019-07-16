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

    public static void logNodeValue(Node temp) {
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public static void log(Node node) {
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
