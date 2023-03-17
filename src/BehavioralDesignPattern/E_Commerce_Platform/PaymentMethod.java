package BehavioralDesignPattern.E_Commerce_Platform;

public interface PaymentMethod {
    void processPayment(double amount);
    double getDiscount();
}
