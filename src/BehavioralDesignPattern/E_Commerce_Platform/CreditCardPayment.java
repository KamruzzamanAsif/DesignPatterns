package BehavioralDesignPattern.E_Commerce_Platform;

public class CreditCardPayment implements Payment{

    @Override
    public void processPayment(User user, double amount) {
        System.out.println(user.getUsername() + " paid " + amount + " using CreditCard");
    }
}
