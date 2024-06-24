package com.vladproduction.stack;

import java.util.Stack;

public class StackDemo_Peek {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        //LIFO (last in - first out)
        //5-3-1

        //push
        stack.push(5);
        stack.push(3);
        stack.push(1);

        //pop
        System.out.println("peeked = " + stack.peek());
        System.out.println("popped = " + stack.pop());





    }
}
