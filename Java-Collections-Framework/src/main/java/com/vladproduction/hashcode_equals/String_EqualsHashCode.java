package com.vladproduction.hashcode_equals;

import java.util.HashSet;
import java.util.Set;

public class String_EqualsHashCode {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("String-1");
        set.add("String-1");
        set.add("String-2");
        set.add("String-3");


        System.out.println(set);

    }
}
