package com.vladproduction._09_stream_operations;

import com.vladproduction._01_demo.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static java.lang.System.out;

public class Example02_toList {
    public static void main(String[] args) {
        Room room1 = new Room("Manchester", "Presentation", 200, 500.0);
        Room room2 = new Room("London", "Hotel", 5, 200.0);
        Room room3 = new Room("Oxford", "Motel", 3, 100.0);
        Room room4 = new Room("Liverpool", "Hotel", 7, 300.0);
        Room room5 = new Room("Newcastle", "Motel", 5, 400.0);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(room1, room2, room3, room4, room5));
        room1.setBreakfast(true);
        room2.setBreakfast(true);

        //Example02_toList:
        /**
         * we assign our stream result to a new collection;
         * it possible by using terminal operation 'collect(Collectors.toList()) or toList()'
         * */

        Collection<Room> breakfastRooms = rooms.stream()
                .filter(Room::isBreakfast)
                .toList();

        //and for each element of breakfastRooms printing city name:
        breakfastRooms.forEach(room -> out.println(room.getCity()));
        /*Manchester
          London*/



    }
}
