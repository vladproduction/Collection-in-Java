package com.vladproduction._13_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainDeque {
    public static void main(String[] args) {

        Deque<String> messageStack = new ArrayDeque<>();
        messageStack.push("Message1");
        print(messageStack);
        messageStack.push("Message2");
        print(messageStack);
        messageStack.push("Message3");
        print(messageStack);
        messageStack.push("Message4");
        print(messageStack);

    }

    public static void print(Deque<String> deque) {

        System.out.format("%n--Deque Contents--%n");

        int x = 0;
        for(String msg : deque) {
            System.out.format("%x: %s %s %n", x++, msg, x == 1 ? "(Top)":"");
        }

        System.out.println("");

    }
}
