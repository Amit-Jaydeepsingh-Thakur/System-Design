package com.hotel.guest;

import com.hotel.room.*;

public class Guest {
    String name;
    String address;
    String roomType;
    int people;
    RoomType room;

    public Guest(String name, String address, String roomType, int people) {
            this.name = name;
            this.address = address;
            this.roomType = roomType;
            this.people = people;

            RoomType room = new RoomType(roomType, people);
    }

    public boolean bookRoom() {
        return room.bookRoom();
    }
}
