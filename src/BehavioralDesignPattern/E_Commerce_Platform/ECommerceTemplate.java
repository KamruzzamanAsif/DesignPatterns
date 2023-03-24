package BehavioralDesignPattern.E_Commerce_Platform;

public abstract class ECommerceTemplate {
    ShopManager shopManager = new ShopManager();
    protected abstract boolean login();
    protected abstract void registerUser();
    protected abstract void shopHandling();

    protected void do_shopping(){
        displayProducts();
        addToCart();
        checkOut();
    }

    protected void do_maintenance(){
        displayProducts();
        manageProducts();
        manageUsers();
    }

    protected abstract void manageProducts();
    protected abstract void manageUsers();

    protected abstract void displayProducts();
    protected abstract void addToCart();
    protected abstract void checkOut();
}
