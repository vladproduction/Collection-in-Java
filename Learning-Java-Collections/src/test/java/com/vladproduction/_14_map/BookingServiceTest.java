package com.vladproduction._14_map;

import com.vladproduction._01_demo.Room;
import com.vladproduction._11_list.Guest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class BookingServiceTest {

    BookingService bookingService;
    Room piccadilly, cambridge, westminister, oxford, victoria, manchester;
    Guest john, maria, sonia, siri, bob, sandra;

    @BeforeEach
    public void setUp() {

        this.bookingService = new BookingService();

        piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
        oxford = new Room("Oxford", "Suite", 5, 225.0);
        victoria = new Room("Victoria", "Suite", 5, 225.0);
        manchester = new Room("Manchester", "Suite", 5, 250.0);

        john = new Guest("John", "Doe", false);
        maria = new Guest("Maria", "Doe", true);
        sonia = new Guest("Sonia", "Doe", true);
        siri = new Guest("Siri", "Doe", true);
        bob = new Guest("Bob", "Doe", false);
        sandra = new Guest("Sandra", "Doe", false);

    }

    @Test
    public void bookTest() {

        assertTrue(this.bookingService.book(cambridge, bob));
        assertTrue(this.bookingService.book(oxford, maria));
        assertTrue(this.bookingService.book(victoria, sonia));
        assertFalse(this.bookingService.book(cambridge, siri));
        assertFalse(this.bookingService.book(cambridge, sandra));
        assertFalse(this.bookingService.book(oxford, john));
        assertFalse(this.bookingService.book(victoria, john));

    }

    @Test
    public void totalRevenueTest() {

        this.bookingService.book(piccadilly, john);
        this.bookingService.book(oxford, maria);
        this.bookingService.book(manchester, siri);
        this.bookingService.book(victoria, sonia);
        assertEquals(825, this.bookingService.totalRevenue());

        this.bookingService.book(cambridge, sandra);
        assertEquals(1000, this.bookingService.totalRevenue());

    }

    @Test
    public void getBookingsTest() {

        this.bookingService.book(piccadilly, john);
        this.bookingService.book(oxford, maria);
        this.bookingService.book(manchester, siri);
        this.bookingService.book(victoria, sonia);

        // Assertions
        assertNotNull(this.bookingService.getBookings());
        assertEquals(4, this.bookingService.getBookings().size());
        assertTrue(this.bookingService.getBookings().containsKey(manchester));
        assertTrue(this.bookingService.getBookings().containsKey(victoria));
        assertEquals(john, this.bookingService.getBookings().get(piccadilly));
        assertEquals(siri, this.bookingService.getBookings().get(manchester));
    }
}