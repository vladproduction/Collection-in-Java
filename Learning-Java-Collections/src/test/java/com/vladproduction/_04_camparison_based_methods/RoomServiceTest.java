package com.vladproduction._04_camparison_based_methods;

import com.vladproduction._01_demo.Room;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class RoomServiceTest {

    private RoomService service;
    private Room room1, room2, room3, room4;
    private Room [] rooms;

    @BeforeEach
    void setUp() {
        this.service = new RoomService();
        this.room1 = new Room("Room1", "Daily", 5, 125);
        this.room2 = new Room("Room2", "Weekly", 5, 550);
        this.room3 = new Room("Room3", "Monthly", 5, 1950);
        this.rooms = new Room[]{this.room1, this.room2,this.room3};
        this.service.createRooms(this.rooms);
    }

    @AfterEach
    void tearDown() {
        for (Room room : rooms) {
            this.service.removeRoom(room);
        }
    }

    @Test
    void getInventoryTest() {
        assertEquals(3, this.service.getInventory().size());
        assertNotEquals(4, this.service.getInventory().size());
    }

    @Test
    void createRoomTest() {
        this.service.createRoom("Room4", "Yearly", 5, 10000);
        assertEquals(4, this.service.getInventory().size());
    }

    @Test
    void createRoomsTest() {
        Room[] newRooms = {
                new Room("Room4", "Yearly", 5, 10000),
                new Room("Room5", "Yearly", 5, 10000),
                new Room("Room6", "Yearly", 5, 10000)};
        this.service.createRooms(newRooms);
        assertEquals(6, this.service.getInventory().size());
    }

    @Test
    void removeRoomTest() {
        this.service.removeRoom(new Room("Room1", "Daily", 5, 125));
        assertEquals(2, this.service.getInventory().size());
        assertFalse(this.service.getInventory().contains(room1));
    }

    @Test
    public void asArrayTest(){
        Room[] rooms = this.service.asArray();
        assertEquals(3, rooms.length);
        assertEquals(this.room1, rooms[0]);
        assertEquals(this.room2, rooms[1]);
        assertEquals(this.room3, rooms[2]);
    }

    @Test
    public void hasRoomTest(){
        assertFalse(this.service.hasRoom(this.room4));
        assertTrue(this.service.hasRoom(this.room1));
    }

    @Test
    public void getByTypeTest(){
        String type = "Daily";
        Collection<Room> dailyRooms = this.service.getByType(type);
        assertEquals(1, dailyRooms.size());
        assertTrue(dailyRooms.stream()
                .map(Room::getType)
                .allMatch(t->t.equals(type)));
    }

    @Test
    public void getByTypeTestNegative(){
        String type = "Daily-Weekly";
        Collection<Room> dailyRooms = this.service.getByType(type);
        assertEquals(0, dailyRooms.size());
        assertTrue(dailyRooms.stream()
                .map(Room::getType)
                .noneMatch(t->t.equals(type)));
    }
}