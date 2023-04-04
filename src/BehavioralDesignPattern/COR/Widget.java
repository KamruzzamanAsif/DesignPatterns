package BehavioralDesignPattern.COR;

public class Widget extends HelpHandler{
    private Widget parent;

    public Widget(HelpHandler successor, Topic.Topics topic) {
        super(successor, topic);
    }

}
