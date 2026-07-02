package model;

public class Payment {

    private int paymentId;
    private int bookingId;
    private double amount;
    private String paymentMethod;
    private boolean paymentStatus;

    public Payment(int paymentId, int bookingId, double amount,
            String paymentMethod, boolean paymentStatus) {

        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void makePayment() {
        paymentStatus = true;
    }

    @Override
    public String toString() {
        return "Payment ID: " + paymentId +
                " | Booking ID: " + bookingId +
                " | Amount: ₹" + amount +
                " | Method: " + paymentMethod +
                " | Status: " + (paymentStatus ? "Success" : "Pending");
    }

    public String toFileString() {
        return paymentId + "," +
                bookingId + "," +
                amount + "," +
                paymentMethod + "," +
                paymentStatus;
    }
}