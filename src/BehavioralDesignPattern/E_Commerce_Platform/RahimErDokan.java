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
            input.close();
            return true;
        }
        else{
            System.out.println("\nLogin failed");
            input.close();
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
        input.close();
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

    }

    @Override
    protected void manageUsers() {

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
        Product product = null;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter product no. : ");
            int product_no = input.nextInt();
            System.out.println("Enter product quantity: ");
            int product_quantity = input.nextInt();
            if(product_no < this.products.size()){
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

            System.out.println("Do you want to add more products? Yes / No");
            String choice = input.nextLine();
            if(choice.equalsIgnoreCase("no"))
                break;
            else
                continue;
        }
    }

    @Override
    protected void checkOut() {
        shopManager.purchaseProduct(this.productCart, this.currentUser);
    }
}
