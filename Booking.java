package model;

public class Booking {

    private int bookingId;
    private String username;
    private int roomId;
    private int numberOfDays;
    private double totalAmount;

    public Booking(int bookingId, String username,
            int roomId, int numberOfDays,
            double totalAmount) {

        this.bookingId = bookingId;
        this.username = username;
        this.roomId = roomId;
        this.numberOfDays = numberOfDays;
        this.totalAmount = totalAmount;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getUsername() {
        return username;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId +
                " | User: " + username +
                " | Room ID: " + roomId +
                " | Days: " + numberOfDays +
                " | Total: ₹" + totalAmount;
    }

    public String toFileString() {
        return bookingId + "," +
                username + "," +
                roomId + "," +
                numberOfDays + "," +
                totalAmount;
    }
}
