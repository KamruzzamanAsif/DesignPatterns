package BehavioralDesignPattern.COR;

public class Button extends HelpHandler{

    public Button(HelpHandler successor, Topic.Topics topic) {
        super(successor, topic);
    }

    public void handleHelp(){
        if(hasHelp()){
            // offer help to button
        }
        else{
            super.handleHelp();
        }
    }
}
