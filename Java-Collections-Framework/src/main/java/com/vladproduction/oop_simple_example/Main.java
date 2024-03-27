package com.vladproduction.oop_simple_example;

/**
 * Created by vladproduction on 26-Mar-24
 */

public class Main {
    public static void main(String[] args) {
        SampleParent sp = new SampleParent();
        sp.method1();
        SampleParent sc = new SampleChild();
        sc.method1();
        SampleChild sc1 = new SampleChild();
        sc1.method1();
    }
}
