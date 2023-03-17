package BehavioralDesignPattern.E_Commerce_Platform;

public class PayPalPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment done with Paypal. Total tk = " + amount);
    }

    @Override
    public double getDiscount() {
        return 10.0;
    }
}
