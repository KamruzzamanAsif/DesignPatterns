package BehavioralDesignPattern.E_Commerce_Platform;

import java.util.List;
import java.util.Map;

public interface IShopManager {
    void addProduct(Product product);
    void addUser(User user);

    void removeProduct(String productName);
    void removeUser(String username);

    void purchaseProduct(Map<Product, Integer> productCart, User user);
}
