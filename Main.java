import model.Room;
import service.BookingService;
import service.PaymentService;
import service.RoomService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RoomService roomService = new RoomService();
        BookingService bookingService = new BookingService();
        PaymentService paymentService = new PaymentService();

        String username;

        System.out.println("==================================");
        System.out.println("   HOTEL RESERVATION SYSTEM");
        System.out.println("==================================");

        System.out.print("Enter Your Name: ");
        username = sc.nextLine();

        while (true) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Bookings");
            System.out.println("5. Payment");
            System.out.println("6. View Payments");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    roomService.displayRooms();
                    break;

                case 2:
                    System.out.print("Enter Room ID: ");
                    int roomId = sc.nextInt();

                    Room room = roomService.searchRoom(roomId);

                    if (room == null) {
                        System.out.println("Room not found.");
                        break;
                    }

                    if (!room.isAvailable()) {
                        System.out.println("Room already booked.");
                        break;
                    }

                    System.out.print("Enter Number of Days: ");
                    int days = sc.nextInt();

                    bookingService.bookRoom(username, room, days);
                    break;

                case 3:
                    System.out.print("Enter Booking ID: ");
                    int bookingId = sc.nextInt();

                    bookingService.cancelBooking(bookingId, roomService);
                    break;

                case 4:
                    bookingService.viewBookings();
                    break;

                case 5:

                    System.out.print("Enter Booking ID: ");
                    int payBookingId = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Payment Method (UPI/Card/Cash): ");
                    String method = sc.nextLine();

                    paymentService.makePayment(payBookingId, amount, method);
                    break;

                case 6:
                    paymentService.viewPayments();
                    break;

                case 7:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
