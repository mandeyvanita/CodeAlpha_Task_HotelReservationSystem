package service;

import model.Room;
import java.util.ArrayList;

public class RoomService {

    private ArrayList<Room> rooms;

    public RoomService() {
        rooms = new ArrayList<>();

        rooms.add(new Room(101, "Standard", 1500, true));
        rooms.add(new Room(102, "Standard", 1500, true));
        rooms.add(new Room(201, "Deluxe", 2500, true));
        rooms.add(new Room(202, "Deluxe", 2500, true));
        rooms.add(new Room(301, "Suite", 4000, true));
    }

    public void displayRooms() {
        System.out.println("\n===== Available Rooms =====");
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public Room searchRoom(int roomId) {
        for (Room room : rooms) {
            if (room.getRoomId() == roomId) {
                return room;
            }
        }
        return null;
    }

    public boolean bookRoom(int roomId) {
        Room room = searchRoom(roomId);

        if (room != null && room.isAvailable()) {
            room.bookRoom();
            return true;
        }

        return false;
    }

    public boolean cancelRoom(int roomId) {
        Room room = searchRoom(roomId);

        if (room != null && !room.isAvailable()) {
            room.cancelBooking();
            return true;
        }

        return false;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
