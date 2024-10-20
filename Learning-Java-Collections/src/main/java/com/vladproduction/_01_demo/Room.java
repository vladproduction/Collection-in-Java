package com.vladproduction._01_demo;

import java.util.Objects;

public class Room {

    private String city;
    private String type;
    private int capacity;
    private double price;
    public boolean breakfast;

    public Room(String city, String type, int capacity, double price) {
        this.city = city;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return capacity == room.capacity && Double.compare(price, room.price) == 0 && Objects.equals(city, room.city) && Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, type, capacity, price);
    }

    @Override
    public String toString() {
        return String.format("Room: %s %s %s %s", this.city, this.type, this.capacity, this.price);
    }
}
