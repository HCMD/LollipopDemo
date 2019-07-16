package com.lollipop.lollipopdemo.Algorithm;

/**
 * 反转单链表
 */
public class ReverseNode {

    private static int[] valueArray = new int[]{1, 2, 3, 4};

    public static void main(String[] args) {
        Node header = NodeUtil.initNodes(valueArray);
        NodeUtil.logNodeValue(header);
//        NodeUtil.logNodeValue(reverse(header));
        NodeUtil.logNodeValue(NodeUtil.reverseByWhile(header));
    }
}

