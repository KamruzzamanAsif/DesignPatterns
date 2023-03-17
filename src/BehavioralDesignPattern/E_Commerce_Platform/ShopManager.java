package BehavioralDesignPattern.E_Commerce_Platform;
import java.util.ArrayList;
import java.util.List;

public class ShopManager implements IShopManager {
    List<Product> products = null;
    List<User> users = null;
    List<PaymentMethod> paymentMethods = null;

    public ShopManager(ArrayList<Product> products, ArrayList<User> users, ArrayList<PaymentMethod> paymentMethods){
       this.products = products;
       this.users = users;
       this.paymentMethods = paymentMethods;
    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void addPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethods.add(paymentMethod);
    }

    @Override
    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    @Override
    public void removeUser(User user) {
        this.users.remove(user);
    }

    @Override
    public void removePaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethods.remove(paymentMethod);
    }

    @Override
    public void displayProducts() {
        for(Product product: products){
            System.out.println(product.toString());
        }
    }

    // getters
    public List<Product> getProducts() {
        return this.products;
    }
    public List<User> getUsers() {
        return this.users;
    }
    public List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }


    @Override
    public void purchaseProduct(Product product, User user, PaymentMethod paymentMethod) {
        if (products.contains(product) && users.contains(user) && paymentMethods.contains(paymentMethod)) {
            double totalPrice = product.getPrice() * (1 - paymentMethod.getDiscount());
            paymentMethod.processPayment(totalPrice);
            product.updateInventory();
            sendOrderConfirmationMessage(product, user, paymentMethod);
            sendPaymentReceipt(user, paymentMethod);
        }
        else {
            System.out.println("Product " + product.getName() + " cannot be bought");
        }
    }

    private void sendPaymentReceipt(User user, PaymentMethod paymentMethod) {
        user.receivePaymentReceipt("payment done!");
    }

    public void sendOrderConfirmationMessage(Product product, User user, PaymentMethod paymentMethod){
        user.getOrderConfirmation(product.getName() + " is bought");
    }
}
