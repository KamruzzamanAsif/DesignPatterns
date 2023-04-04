package BehavioralDesignPattern.E_Commerce_Platform;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public int getPaymentID() {
        return 1;
    }

    @Override
    public void processPayment(double amount, User user) {
        System.out.println("Payment done with CreditCard. For User " + user.getUsername() + " Total tk = " + amount);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
