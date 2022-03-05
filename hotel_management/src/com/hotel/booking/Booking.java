package com.hotel.booking;

import com.hotel.room.*;
import com.hotel.payment.*;

public class Booking {
    boolean bookRoom;
    RoomType room;

    public Booking(RoomType room) {
        this.room = room;
    }

    public boolean makeBooking() {
        return this.room.bookRoom();
    }
}
