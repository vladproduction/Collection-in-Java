package com.vladproduction.LinkedList;

import com.vladproduction.LinkedList.MyLinkedList;

/**
 * Created by vladproduction on 24-Mar-24
 */

public class Test_MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(3);
        list.add(5);

        System.out.println(list);

//        System.out.println(list.get(1));
//        list.remove(1);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
