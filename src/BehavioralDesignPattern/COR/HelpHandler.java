package BehavioralDesignPattern.COR;

public class HelpHandler {
    private HelpHandler successor;
    private Topic.Topics topic;

    public HelpHandler(HelpHandler successor, Topic.Topics topic) {
        this.successor = successor;
        this.topic = topic;
    }

    public boolean hasHelp(){
        return topic != Topic.Topics.NO_HELP_TOPIC;
    }

    public void handleHelp(){
        if (this.successor != null)
            successor.handleHelp();
    }

}
