package BehavioralDesignPattern.E_Commerce_Platform;

import java.util.Objects;

public class Constants {
    private static Constants constants = null;
    public static Constants getInstance() {
        if(constants == null)
            return new Constants();
        else
            return constants;
    }

    public final String  welcome_message = """

            ********************************************
            *         Welcome to RahimerDokan          *
            ********************************************""";

    public final String login_message = """

            Please Login/Register\040
                    1. Login
                    2. Register
            Enter your choice:
            """;


    public final String wrong_input = """ 
            
            wrong input choice
            """;

}
