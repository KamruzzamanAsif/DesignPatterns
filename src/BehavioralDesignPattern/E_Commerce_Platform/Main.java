package BehavioralDesignPattern.E_Commerce_Platform;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.initializeDatabase();

        // Create a new user object and register it
//        User newUser = new User("john", "john@gmail.com", "123", "US");
//        userManagement.registerUser(newUser);

        // Login an existing user and get the user object
        User loggedInUser = userManagement.loginUser("john", "123");

        userManagement.closeDatabase();
    }
}
