package com.vladproduction.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vladproduction on 26-Mar-24
 */

public class ForEachMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");

        for(Map.Entry<Integer, String> entry: map1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
