package BehavioralDesignPattern.E_Commerce_Platform;

public class CryptoCurrencyPayment implements Payment{

    @Override
    public void processPayment(User user, double amount) {
        System.out.println(user.getUsername() + " paid" + amount + " using CryptoCurrency");
    }
}
