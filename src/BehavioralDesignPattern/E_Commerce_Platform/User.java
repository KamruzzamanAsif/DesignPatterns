package BehavioralDesignPattern.E_Commerce_Platform;

public class User {
    private String username, email, password, address;
    public User(String username, String email, String password, String address){
        this.username = username;
        this.email = email;
        this.password = password;
        this. address = address;
    }

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getEmail(){
        return this.email;
    }
    public String getAddress(){
        return this.address;
    }

}
