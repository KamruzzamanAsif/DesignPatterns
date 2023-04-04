package BehavioralDesignPattern.E_Commerce_Platform;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RahimErDokan rahimErDokan = new RahimErDokan();
        Constants constants = Constants.getInstance();
        System.out.println(constants.welcome_message);

        while (true){
            System.out.println(constants.login_message);
            Scanner input = new Scanner(System.in);
            String choice = input.next();
            if(choice.equals("1")){
                if(rahimErDokan.login()) {
                    rahimErDokan.shopHandling();
                    break;
                }
            }
            else if(choice.equals("2")){
                rahimErDokan.registerUser();
                break;
            }
            else{
                System.out.println(constants.wrong_input);
            }
        }
    }

}
