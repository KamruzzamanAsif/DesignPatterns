package BehavioralDesignPattern.COR;

public class Dialog extends Widget{

    public Dialog(HelpHandler successor, Topic.Topics topic) {
        super(successor, topic);
    }

    public void handleHelp(){
        if(hasHelp()){
            // offer help to dialog
        }
        else{
            super.handleHelp();
        }
    }
}
