package com.lollipop.lollipopdemo.Algorithm.validMark;

import com.lollipop.lollipopdemo.Algorithm.Node;
import com.lollipop.lollipopdemo.Algorithm.StackNode;

import java.util.Stack;

/**
 * 判断合法字符串
 */
public class ValidMark {

    public static void main(String[] args) {
        boolean valid = isValid("{([])}");
        System.out.println(valid);
    }

    private static boolean isValid(String str) {
        StackNode stack = new StackNode();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String key = String.valueOf(c);
            Mark mark = new Mark(key);
            Node stackTop = stack.getStackTop();
            if (stackTop != null) {
                Mark stackTopMark = (Mark) stackTop.value;
                if (stackTopMark.value.equals(key))
                    stack.popStack();
                else if (!mark.isLeftMark()) {
                    return false;
                } else {
                    stack.pushStack(mark);
                }
            } else {
                if (!mark.isLeftMark()) {
                    return false;
                }
                stack.pushStack(new Mark(key));
            }
        }
        Node stackTop = stack.getStackTop();
        return stackTop == null;
    }
}
