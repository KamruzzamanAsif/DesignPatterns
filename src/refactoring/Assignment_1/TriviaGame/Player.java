package refactoring.Solution.TriviaGame;

public class Player {
    private String playerName;
    private int place;
    private int purse;
    private boolean inPenaltyBox;

    public Player(String playerName){
        this.playerName = playerName;
        this.place = 0;
        this.purse = 0;
        this.inPenaltyBox = false;
    }

    public String getPlayerName(){
        return this.playerName;
    }
    public int getPlace(){
        return place;
    }
    public int getPurse(){
        return purse;
    }
    public boolean isInPenaltyBox(){
        return inPenaltyBox;
    }

    public void updateLocation(int dice){
        place = place + dice;
        if (place > 11)
        {
            place= place - 12;
        }
    }

    public void setInPenaltyBox(boolean inPenaltyBox) {
        this.inPenaltyBox = inPenaltyBox;
    }
    public void incrementPurse(){
        this.purse += 1;
    }
    public String getCurrentCategory() {
        if (place%4 == 0) return "Pop";
        else if (place%4 == 1) return "Science";
        else if (place%4 == 2) return "Sports";
        else return "Rock";
    }
}
