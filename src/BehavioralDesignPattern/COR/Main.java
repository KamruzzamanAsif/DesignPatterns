package BehavioralDesignPattern.COR;

public class Main {

    public static void main(String[] args) {
        Application application = new Application(Topic.Topics.APPLICATION_TOPIC);
        Dialog dialog = new Dialog(application, Topic.Topics.PRINT_TOPIC);
        Button button = new Button(dialog, Topic.Topics.PAPER_ORIENTATION_TOPIC);

        button.handleHelp();
    }
}
