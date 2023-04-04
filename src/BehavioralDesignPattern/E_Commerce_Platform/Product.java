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

    protected void updateInventory(int quantity) {
        this.inventory -= quantity;
    }


    @Override
    public String toString() {
        return "\n Product Name: " + this.getName() +
                "\n Description: " + this.getDescription() +
                "\n Price: Tk. " + this.getPrice() +
                "\n Image: " + this.getImage() +
                "\n Inventory: " + this.getInventory();
    }
}
