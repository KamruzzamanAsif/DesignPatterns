package BehavioralDesignPattern.E_Commerce_Platform;

import java.util.*;

public class RahimErDokan extends ECommerceTemplate{

    private List<Product> products = shopManager.getProducts();
    private List<User> users = shopManager.getUsers();
    private Map<Product, Integer> productCart = new HashMap<>();

    private User currentUser;

    @Override
    protected boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter username: ");
        String username = input.nextLine();
        System.out.println("\nEnter password: ");
        String password = input.nextLine();
        if(shopManager.isUserExist(username, password)){
            System.out.println("\nLogin successful");
            this.currentUser = shopManager.getUser(username, password);
            return true;
        }
        else{
            System.out.println("\nLogin failed");
            return false;
        }
    }

    @Override
    protected void registerUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("******Register user********");
        System.out.println("\nEnter username: ");
        String username = input.nextLine();
        System.out.println("\nEnter email: ");
        String email = input.nextLine();
        System.out.println("\nEnter password: ");
        String password = input.nextLine();
        System.out.println("\nEnter address: ");
        String address = input.nextLine();
        User user = new User(username, email, password, address);
        shopManager.addUser(user);
    }

    @Override
    protected void shopHandling() {
        if(this.currentUser != null){
            if(Objects.equals(this.currentUser.getUsername(), "admin")){
               do_maintenance();
            }
            else{
                do_shopping();
            }
        }
    }

    @Override
    protected void manageProducts() {
        System.out.println("Select your choice: \n\t 1. Add Product\n\t 2. Remove Product");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if(choice.equals("1")){
            System.out.println("Enter product name: ");
            String product_name = scanner.next();
            System.out.println("Enter product description: ");
            String product_description = scanner.next();
            System.out.println("Enter product price: ");
            String product_price = scanner.next();
            System.out.println("Enter product image: ");
            String product_image = scanner.next();
            System.out.println("Enter product inventory: ");
            String product_inventory = scanner.next();

            Product newProduct = new Product(product_name, product_description,
                    Integer.parseInt(product_price), product_image, Integer.parseInt(product_inventory));
            this.products.add(newProduct);
            shopManager.addProduct(newProduct);
        }
        else if(choice.equals("2")){
            System.out.println("Enter product name: ");
            String product_name = scanner.next();
            Product productToRemove = null;
            for (Product product : this.products) {
                if (product.getName().equals(product_name.trim())) {
                    productToRemove = product;
                    break;
                }
            }
            shopManager.removeProduct(product_name.trim());
            this.products.remove(productToRemove);
        }
    }

    @Override
    protected void manageUsers() {
        System.out.println("Select your choice: \n\t 1. Add User\n\t 2. Remove User");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if(choice.equals("1")){
            System.out.println("Enter user name: ");
            String user_name = scanner.next();
            System.out.println("Enter email: ");
            String email = scanner.next();
            System.out.println("Enter password: ");
            String password = scanner.next();
            System.out.println("Enter address: ");
            String address = scanner.next();

            User user = new User(user_name, email, password, address);
            this.users.add(user);
            shopManager.addUser(user);
        }
        else if(choice.equals("2")){
            System.out.println("Enter user name: ");
            String user_name = scanner.next();

            User userToRemove = null;
            for (User user: this.users) {
                if (user.getUsername().equals(user_name.trim())) {
                    userToRemove = user;
                    break;
                }
            }
            shopManager.removeUser(user_name);
            this.products.remove(userToRemove);
        }
    }

    @Override
    protected void displayProducts() {
        if(this.products.size() > 0){
            System.out.println("******* Product List *******");
            for(int i=0; i<this.products.size(); i++){
                System.out.println("\nProduct No. " + (i+1) + products.get(i).toString());
            }
        }
        else{
            System.out.println("/////No products available////");
        }
    }

    @Override
    protected void addToCart() {
        System.out.println("Add products to your cart");
        Product product;
        Scanner cart_input = new Scanner(System.in);

        while(true){
            System.out.println("Enter product no. : ");
            int product_no = cart_input.nextInt();
            System.out.println("Enter product quantity: ");
            int product_quantity = cart_input.nextInt();
            if(product_no <= this.products.size()){
                product = this.products.get(product_no-1);
                if(product_quantity <= product.getInventory()){
                    this.productCart.put(product, product_quantity);
                }
                else{
                    System.out.println("Invalid product quantity");
                }
            }
            else{
                System.out.println("Invalid product no.");
            }

            System.out.println("Do you want to add more products? Yes(1) / No(2): ");
            String choice = cart_input.next();
            if(choice.equals("2"))
                break;
        }
    }

    @Override
    protected void checkOut() {
        shopManager.purchaseProduct(this.productCart, this.currentUser);
    }
}
