package com.jakedoren.Hospital.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Rooms")
public class Room {
    private final int roomNumber;
    private Room[] rooms;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
