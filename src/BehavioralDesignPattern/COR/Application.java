package BehavioralDesignPattern.COR;

public class Application extends HelpHandler{

    public Application(Topic.Topics topic) {
        super(null, topic);
    }

    public void handleHelp(){
        // show a list of help topics
    }

    // and more application specific methods
}
