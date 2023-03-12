package BehavioralDesignPattern.E_Commerce_Platform;

public class Product {
    private String name;
    private String description;
    private double price;
    private String image;
    private int inventory;

    public Product(String name, String description, double price, String image, int inventory){
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public int getInventory() {
        return inventory;
    }

    public String getImage() {
        return image;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void displayDetails() {
        System.out.println(getName());
        System.out.println(getDescription());
        System.out.println(getPrice());
        System.out.println(getImage());
        System.out.println(getInventory());
    }

    public void purchase(User user, Payment payment) {
        if (getInventory() > 0) {
            makePayment(user, payment);
            updateInventory();
            sendConfirmationEmail(user);
        } else {
            System.out.println("This product is out of stock.");
        }
    }

    protected void makePayment(User user, Payment payment) {
        // logic for processing payment
    }

    protected void updateInventory() {
        this.inventory--;
    }

    protected void sendConfirmationEmail(User user) {
        // logic for sending confirmation email
    }
}
