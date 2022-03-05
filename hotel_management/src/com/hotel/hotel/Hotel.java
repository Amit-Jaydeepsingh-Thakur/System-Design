package com.hotel.hotel;

import java.util.*;
import com.hotel.room.*;

public class Hotel {
    List<RoomType> rooms;
    int capacity;

    public Hotel(int capacity) {
        rooms = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public boolean addRoom(RoomType room) {
        if (rooms.size() < this.capacity) {
            rooms.add(room);
            return true;
        }

        return false;
    }
}
