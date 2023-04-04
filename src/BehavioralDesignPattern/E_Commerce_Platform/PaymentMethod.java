package BehavioralDesignPattern.E_Commerce_Platform;

public interface PaymentMethod {

    int getPaymentID();
    void processPayment(double amount, User user);
    double getDiscount();
}
