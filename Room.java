package model;

public class Room {

    private int roomId;
    private String roomType;
    private double price;
    private boolean available;

    public Room(int roomId, String roomType, double price, boolean available) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.price = price;
        this.available = available;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void bookRoom() {
        available = false;
    }

    public void cancelBooking() {
        available = true;
    }

    @Override
    public String toString() {
        return "Room ID: " + roomId +
                " | Type: " + roomType +
                " | Price: ₹" + price +
                " | Available: " + available;
    }

    public String toFileString() {
        return roomId + "," + roomType + "," + price + "," + available;
    }
}
