package com.hotel.room;

public class RoomType implements Room {
    String roomType;
    int capacity;
    boolean booked;
    boolean amenities;

    public RoomType(String type, int capacity) {
        this.roomType = type;
        this.capacity = capacity;
        this.amenities = false;
    }

    @Override
    public boolean isBooked() {
        return false;
    }

    @Override
    public boolean amenityEnabled() {
        return false;
    }

    @Override
    public int capacity() {
        return 0;
    }

    public boolean bookRoom() {
        if (!booked) {
            System.out.println("Booked Room");
            booked = true;
            return true;
        }

        return false;
    }
}
