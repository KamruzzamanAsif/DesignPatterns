package BehavioralDesignPattern.E_Commerce_Platform;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment done with CreditCard. Total tk = " + amount);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
