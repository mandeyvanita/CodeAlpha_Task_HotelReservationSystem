package service;

import model.Booking;
import model.Room;

import java.util.ArrayList;

public class BookingService {

    private ArrayList<Booking> bookings;
    private int bookingCounter = 1;

    public BookingService() {
        bookings = new ArrayList<>();
    }

    public void bookRoom(String username, Room room, int days) {

        if (room == null) {
            System.out.println("Room not found.");
            return;
        }

        if (!room.isAvailable()) {
            System.out.println("Room already booked.");
            return;
        }

        room.bookRoom();

        double total = room.getPrice() * days;

        Booking booking = new Booking(
                bookingCounter++,
                username,
                room.getRoomId(),
                days,
                total);

        bookings.add(booking);

        System.out.println("\n========== BOOKING SUCCESS ==========");
        System.out.println(booking);
    }

    public void cancelBooking(int bookingId, RoomService roomService) {

        Booking bookingToRemove = null;

        for (Booking booking : bookings) {

            if (booking.getBookingId() == bookingId) {

                Room room = roomService.searchRoom(booking.getRoomId());

                if (room != null) {
                    room.cancelBooking();
                }

                bookingToRemove = booking;
                break;
            }
        }

        if (bookingToRemove != null) {
            bookings.remove(bookingToRemove);
            System.out.println("Booking cancelled successfully.");
        } else {
            System.out.println("Booking not found.");
        }
    }

    public void viewBookings() {

        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        System.out.println("\n========== BOOKING LIST ==========");

        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }
}
