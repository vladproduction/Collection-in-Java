package com.vladproduction.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vladproduction on 26-Mar-24
 */

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map);

        //try to put one more
        map.put(3, "other three");
        System.out.println(map);

        //get by key
        String get1 = map.get(1);
        System.out.println(get1);
        System.out.println(map.get(10)); //null



    }
}
