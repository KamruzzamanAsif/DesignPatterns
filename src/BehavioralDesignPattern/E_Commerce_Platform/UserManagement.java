package BehavioralDesignPattern.E_Commerce_Platform;

import java.sql.*;

public class UserManagement {
    private Connection connection;

    // Method to initialize the database connection
    public void initializeDatabase() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:users.db");
            System.out.println("Database connection established.");
            // Create the users' table if it doesn't exist
            Statement statement = connection.createStatement();
            // statement.execute("DROP TABLE IF EXISTS users");
            statement.execute("CREATE TABLE IF NOT EXISTS users (username TEXT PRIMARY KEY, email TEXT, password TEXT, address TEXT)");
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error establishing database connection: " + e.getMessage());
        }
    }

    // Method to close the database connection
    public void closeDatabase() {
        try {
            connection.close();
            System.out.println("Database connection closed.");
        } catch (SQLException e) {
            System.err.println("Error closing database connection: " + e.getMessage());
        }
    }

    // Method to register a new user
    public void registerUser(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (username, email, password, address) VALUES (?, ?, ?, ?)");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getAddress());
            statement.executeUpdate();
            statement.close();
            System.out.println("User registered successfully!");
        } catch (SQLException e) {
            System.err.println("Error registering user: " + e.getMessage());
            System.out.println("User already exist!");
        }
    }

    // Method to login an existing user
    public User loginUser(String username, String password) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next() && resultSet.getString("password").equals(password)) {
                User user = new User(resultSet.getString("username"), resultSet.getString("email"), resultSet.getString("password")
                , resultSet.getString("address"));

                System.out.println("User logged in successfully!");
                resultSet.close();
                statement.close();
                return user;
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error logging in user: " + e.getMessage());
        }
        System.out.println("Invalid username or password. Please try again.");
        return null;
    }
}


