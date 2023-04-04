package BehavioralDesignPattern.E_Commerce_Platform;

import java.util.Scanner;

public abstract class ECommerceTemplate {
    ShopManager shopManager = new ShopManager();
    protected abstract boolean login();
    protected abstract void registerUser();
    protected abstract void shopHandling();

    protected void do_shopping(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("""
                    Enter your choice:\s
                    1. display products\t2. add to cart\t3. checkout
                    >>>enter 'exit' to exit""");
            String choice = input.next();
            if(choice.equals("1")){displayProducts();}
            else if(choice.equals("2")){addToCart();}
            else if(choice.equals("3")){checkOut();}
            else if(choice.equals("exit")){break;}
            else {
                System.out.println("invalid choice");
            }
        }
    }

    protected void do_maintenance(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("""
                    Enter your choice:\s
                    1. display products\t2. manage products\t3. manage users
                    >>>enter 'exit' to exit""");
            String choice = input.next();
            if(choice.equals("1")){displayProducts();}
            else if(choice.equals("2")){manageProducts();}
            else if(choice.equals("3")){manageUsers();}
            else if(choice.equals("exit")){break;}
            else {
                System.out.println("invalid choice");
            }
        }
    }

    protected abstract void manageProducts();
    protected abstract void manageUsers();

    protected abstract void displayProducts();
    protected abstract void addToCart();
    protected abstract void checkOut();
}
