package BehavioralDesignPattern.E_Commerce_Platform;

public class CryptoCurrencyPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment done with CryptoCurrency. Total tk = " + amount);
    }

    @Override
    public double getDiscount() {
        return 50.0;
    }
}
