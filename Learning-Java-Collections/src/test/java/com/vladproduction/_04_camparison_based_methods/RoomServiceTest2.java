package com.vladproduction._04_camparison_based_methods;

import com.vladproduction._01_demo.Room;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class RoomServiceTest2 {

    private RoomService service;

    private Room[] rooms;

    @BeforeEach
    void setUp() {
        this.service = new RoomService();
        Room room1 = new Room("Room1", "Daily", 5, 125);
        Room room2 = new Room("Room2", "Weekly", 15, 550);
        Room room3 = new Room("Room3", "Monthly", 25, 1950);
        Room room4 = new Room("Room4", "Daily", 5, 125);
        Room room5 = new Room("Room5", "Weekly", 15, 550);
        Room room6 = new Room("Room6", "Monthly", 25, 1950);
        this.rooms = new Room[]{room1, room2, room3, room4, room5, room6};
        this.service.createRooms(rooms);
    }

    @Test
    public void applyDiscountTest() {
        this.service.applyDiscount(0.25);
        assertEquals(93.75, rooms[0].getPrice());
        assertEquals(412.5, rooms[1].getPrice());
        assertEquals(1462.5, rooms[2].getPrice());
        assertEquals(93.75, rooms[3].getPrice());
        assertEquals(412.5, rooms[4].getPrice());
        assertEquals(1462.5, rooms[5].getPrice());
    }

    @Test
    public void getRoomsByCapacity(){
        Collection<Room> roomsByCapacity = this.service.getRoomsByCapacity(15);
        assertTrue(roomsByCapacity.containsAll(Arrays.asList(rooms[1], rooms[2], rooms[4], rooms[5])));
        assertTrue(this.service.getRoomsByCapacity(25).containsAll(Arrays.asList(rooms[2], rooms[5])));
    }

    @Test
    public void getRoomByPriceAndTypeTest(){
        /*.filter(r->r.getPrice() < price)
          .filter(r ->r.getType().equals(type))*/
        Collection<Room> roomsWithPriceAndType = this.service.getRoomByRateAndType(600.00, "Weekly");
        assertFalse(roomsWithPriceAndType.contains(rooms[0]));
        assertTrue(roomsWithPriceAndType.contains(rooms[1])); //because price is: 550 < 600, and type is: "Weekly"
        assertFalse(roomsWithPriceAndType.contains(rooms[2]));
        assertFalse(roomsWithPriceAndType.contains(rooms[3]));
        assertTrue(roomsWithPriceAndType.contains(rooms[4])); //because price is: 550 < 600, and type is: "Weekly"
        assertFalse(roomsWithPriceAndType.contains(rooms[5]));
    }


}