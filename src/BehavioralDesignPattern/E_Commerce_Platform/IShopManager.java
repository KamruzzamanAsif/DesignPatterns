package BehavioralDesignPattern.E_Commerce_Platform;

import java.util.List;

public interface IShopManager {
    void addProduct(Product product);
    void addUser(User user);
    void addPaymentMethod(PaymentMethod paymentMethod);
    void removeProduct(Product product);
    void removeUser(User user);
    void removePaymentMethod(PaymentMethod paymentMethod);
    void displayProducts();
    void purchaseProduct(Product product, User user, PaymentMethod paymentMethod);
}
