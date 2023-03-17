package BehavioralDesignPattern.E_Commerce_Platform;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.initializeDatabase();

        // Create a new user object and register it
//        User newUser = new User("john", "john@gmail.com", "123", "US");
//        userManagement.registerUser(newUser);

        // Login an existing user and get the user object
//        User loggedInUser = userManagement.loginUser("john", "123");
//
//        userManagement.closeDatabase();

        System.out.println("***********Login Portal**************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String username = input.nextLine();
        System.out.print("\nEnter password: ");
        String password = input.nextLine();
        User loggedInUser = userManagement.loginUser(username, password);
        if(loggedInUser != null){
            enterWebsite(loggedInUser);
        }
        userManagement.closeDatabase();
    }

    public static void enterWebsite(User user){
        System.out.println("***********User Portal**************");
    }
}
