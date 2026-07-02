package service;

import model.Payment;

import java.util.ArrayList;

public class PaymentService {

    private ArrayList<Payment> payments;
    private int paymentCounter = 1;

    public PaymentService() {
        payments = new ArrayList<>();
    }

    public void makePayment(int bookingId, double amount, String method) {

        Payment payment = new Payment(
                paymentCounter++,
                bookingId,
                amount,
                method,
                true);

        payment.makePayment();
        payments.add(payment);

        System.out.println("\n========== PAYMENT SUCCESS ==========");
        System.out.println(payment);
    }

    public void viewPayments() {

        if (payments.isEmpty()) {
            System.out.println("No payment records found.");
            return;
        }

        System.out.println("\n========== PAYMENT HISTORY ==========");

        for (Payment payment : payments) {
            System.out.println(payment);
        }
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }
}
