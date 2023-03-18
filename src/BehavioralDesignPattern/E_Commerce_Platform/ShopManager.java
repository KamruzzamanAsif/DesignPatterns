package BehavioralDesignPattern.E_Commerce_Platform;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ShopManager implements IShopManager {
    List<Product> products = null;
    List<User> users = null;
    List<PaymentMethod> paymentMethods = null;

    public ShopManager(){
       loadUsers();
       loadProducts();
       loadPaymentMethods();
    }

    private void loadUsers() {
        String filename = "src/BehavioralDesignPattern/E_Commerce_Platform/users.txt";
        String line = null;

        try {
            FileReader fileReader = new FileReader(filename);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");

                String userName = fields[0].trim();
                String email = fields[1].trim();
                String password = fields[2].trim();
                String address = fields[3].trim();

                User user = new User(userName, email, password, address);

                this.users.add(user);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadProducts() {

        String filename = "src/BehavioralDesignPattern/E_Commerce_Platform/products.txt";
        String line = null;

        try {
            FileReader fileReader = new FileReader(filename);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");

                String productName = fields[0].trim();
                String productDescription = fields[1].trim();
                double productPrice = Double.parseDouble(fields[2].trim());
                String productImage = fields[3].trim();
                int productInventory = Integer.parseInt(fields[4].trim());

                Product product = new Product(productName, productDescription, productPrice, productImage, productInventory);

                this.products.add(product);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadPaymentMethods() {
        paymentMethods.add(new CreditCardPayment());
        paymentMethods.add(new PayPalPayment());
        paymentMethods.add(new CryptoCurrencyPayment());
    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);

        String filename = "src/BehavioralDesignPattern/E_Commerce_Platform/products.txt";
        String newProductData = product.getName()+","+product.getDescription()+","+
                product.getPrice()+","+product.getImage()+","+product.getInventory();

        try {
            FileWriter fileWriter = new FileWriter(filename, true);

            fileWriter.write("\n" + newProductData);

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);

        String filename = "src/BehavioralDesignPattern/E_Commerce_Platform/users.txt";
        String newProductData = user.getUsername()+","+user.getEmail()+","+
                user.getPassword()+","+user.getAddress();

        try {
            FileWriter fileWriter = new FileWriter(filename, true);

            fileWriter.write("\n" + newProductData);

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
