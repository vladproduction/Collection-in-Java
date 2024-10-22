package com.vladproduction._15_utilities;

import com.vladproduction._01_demo.Room;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCompareTo {
    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 175.00);
        Room oxford = new Room("Oxford", "Suite", 5, 725.0);
        Room oxfordGuest = new Room("Oxford", "Guest Room", 5, 225.0);
        Room manchester = new Room("Manchester", "Premiere", 7, 1125.0);
        Room liverpool = new Room("Liverpool", "Suite", 9, 525.0);

        List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxfordGuest, oxford, manchester, liverpool));

        //sorting in natural order asc
        Collections.sort(rooms);

        rooms.forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getCity(), r.getType(), r.getPrice()));

        //before sorting:
        /*Piccadilly      Guest Room      175.000000
        Oxford          Guest Room      225.000000
        Oxford          Suite           725.000000
        Manchester      Premiere        1125.000000
        Liverpool       Suite           525.000000*/

        //after sorting:
        /*Liverpool       Suite           525.000000
        Manchester      Premiere        1125.000000
        Oxford          Guest Room      225.000000
        Oxford          Suite           725.000000
        Piccadilly      Guest Room      175.000000*/

    }
}
