package BehavioralDesignPattern.E_Commerce_Platform;

public class PayPalPayment implements PaymentMethod {

    @Override
    public int getPaymentID() {
        return 3;
    }

    @Override
    public void processPayment(double amount, User user) {
        System.out.println("Payment done with Paypal. For User " + user.getUsername() + " Total tk = " + amount);
    }

    @Override
    public double getDiscount() {
        return 10.0;
    }
}
