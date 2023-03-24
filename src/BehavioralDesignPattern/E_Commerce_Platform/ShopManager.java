package BehavioralDesignPattern.E_Commerce_Platform;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShopManager implements IShopManager {
    private List<Product> products = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private  List<PaymentMethod> paymentMethods = new ArrayList<>();
    private Constants  constants = Constants.getInstance();

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
            fileReader.close();

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
            fileReader.close();

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

        System.out.println("User registered successfully!");
    }

    @Override
    public void addPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethods.add(paymentMethod);
    }

    @Override
    public void removeProduct(String productName) {
        // Find the product with the specified name in the list
        Product productToRemove = null;
        for (Product product : this.products) {
            if (product.getName().equals(productName)) {
                productToRemove = product;
                break;
            }
        }

        // Remove the product from the list if found
        if (productToRemove != null) {
            this.products.remove(productToRemove);

            // Update the file to reflect the updated list of products
            String filename = "src/BehavioralDesignPattern/E_Commerce_Platform/products.txt";
            try {
                FileWriter fileWriter = new FileWriter(filename);

                for (Product product : this.products) {
                    String productData = product.getName() + "," + product.getDescription() + "," +
                            product.getPrice() + "," + product.getImage() + "," + product.getInventory();
                    fileWriter.write(productData + "\n");
                }

                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void removeUser(String username) {
        User userToRemove = null;
        for (User user: this.users) {
            if (user.getUsername().equals(username.trim())) {
                userToRemove = user;
                break;
            }
        }

        // Remove the user from the list if found
        if (userToRemove != null) {
            this.users.remove(userToRemove);

            // Update the file to reflect the updated list of products
            String filename = "src/BehavioralDesignPattern/E_Commerce_Platform/users.txt";
            try {
                FileWriter fileWriter = new FileWriter(filename);

                for (User user : this.users) {
                    String userData = user.getUsername() + "," + user.getEmail() + "," +
                            user.getPassword() + "," + user.getAddress();
                    fileWriter.write(userData + "\n");
                }

                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("User removed Successfully!");
    }

    @Override
    public void removePaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethods.remove(paymentMethod);
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
    public void purchaseProduct(Map<Product, Integer> productCart, User user) {
        double totalPrice = 0.0;
        double discount_price = 0.0;

        for (Map.Entry<Product, Integer> entry : productCart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            updateProductInventory(product.getName(), quantity);

            totalPrice += product.getPrice() * quantity;
        }


        // payment method strategies
        System.out.println("Select payment method: " + constants.payment_methods);
        Scanner input = new Scanner(System.in);
        int payment_choice = input.nextInt();

        for (PaymentMethod paymentMethod : paymentMethods) {
            if (payment_choice == paymentMethod.getPaymentID()) {
                discount_price = paymentMethod.getDiscount();
                paymentMethod.processPayment(totalPrice - discount_price);
            }
        }

        // payment receipt
        sendPaymentReceipt(user, productCart, totalPrice, discount_price);
    }

    private void updateProductInventory(String productName, int quantity){
        for (Product product: this.products){
            if(product.getName().equals(productName)){
                product.updateInventory(quantity);
            }
        }

        String fileName = "src/BehavioralDesignPattern/E_Commerce_Platform/products.txt";
        /// update in file ///
        try {
            // Read the contents of the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                // Split each line into product name and quantity
                String[] productInfo = line.split(",");
                String product_name = productInfo[0].trim();
                String product_description = productInfo[1].trim();
                int product_price =  Integer.parseInt(productInfo[2].trim());
                String product_image = productInfo[3].trim();
                int product_quantity = Integer.parseInt(productInfo[4].trim());

                // If the current line corresponds to the product to be updated, update the quantity
                if (product_name.equals(productName)) {
                    product_quantity -= quantity;
                }

                // Append the updated product info to the string builder
                sb.append(product_name + "," + product_description + "," +
                        product_price + "," + product_image + "," + product_quantity + "\n");
            }
            reader.close();

            // Write the updated contents back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(sb.toString());
            writer.close();

            System.out.println("Product quantity updated successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

    }

    private void sendPaymentReceipt(User user, Map<Product, Integer> productCart,
                                    double totalPrice, double discount_price) {

        StringBuilder sb = new StringBuilder();
        // Print the header of the receipt
        sb.append("Product\tUnit price\tQuantity\tPrice\n");

        // Print the list of products and their prices
        for (Map.Entry<Product, Integer> entry : productCart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            sb.append(product.getName()).append("\t").append(product.getPrice()).append("\t\t").append(quantity).append("\t\t").append(product.getPrice() * quantity).append("\n");
        }

        // Print the total amount and footer of the receipt
        sb.append("--------------------------------------\n");
        sb.append("Total:\t").append(totalPrice).append("\n");
        sb.append("Discount:\t").append(discount_price).append("\n");
        sb.append("--------------------------------------\n");
        sb.append("Grand Total:\t").append(totalPrice-discount_price).append("\n");
        // send to user
        user.receivePaymentReceipt(sb.toString());
    }


    public boolean isUserExist(String userName, String password){
        for(User user : users){
            if(user.getUsername().equals(userName) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public User getUser(String username, String password){
        for(User user : users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
