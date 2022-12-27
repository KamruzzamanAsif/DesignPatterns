package refactoring.Assignment_1.TriviaGame;

import refactoring.Solution.TriviaGame.Player;
import refactoring.Solution.TriviaGame.Question;

import java.util.ArrayList;

public class TriviaGame {
    ArrayList<Player> players = new ArrayList<Player>();
    int currentPlayer = 0;
    boolean isGettingOutOfPenaltyBox;
    Question question = new Question();

    public TriviaGame() {
        question.generateQuestions();
    }

    public boolean isPlayable() {
        return (players.size() >= 2);
    }

    public boolean addPlayer(String playerName) {
        Player player = new Player(playerName);
        players.add(player);
        announce(playerName + " was added");
        announce("They are player number " + players.size());
        return true;
    }

    public void roll(int dice) {
        announce(players.get(currentPlayer) + " is the current player");
        announce("They have rolled a " + dice);

        if (players.get(currentPlayer).isInPenaltyBox()) {
            if (dice % 2 != 0) {
                isGettingOutOfPenaltyBox=true;
                changeLocation(dice);
                askQuestion();
            }else {
                announce(players.get(currentPlayer).getPlayerName() + " is not getting out of the penalty box");
                isGettingOutOfPenaltyBox=false;
            }
        } else {
            changeLocation(dice);
            askQuestion();
        }

    }

    private void changeLocation(int dice) {
        players.get(currentPlayer).updateLocation(dice);
        announce(players.get(currentPlayer).getPlayerName()
                + "'s new location is "
                + players.get(currentPlayer).getPlace());
        announce("The category is " + players.get(currentPlayer).getCurrentCategory());
    }

    private void askQuestion() {
        String category =players.get(currentPlayer).getCurrentCategory();
        String quesReturn = question.getQuestion(category);
        announce(quesReturn);
    }

    private void updateCurrentPlayer(){
        currentPlayer++;
        if (currentPlayer == players.size()) currentPlayer = 0;
    }
    public boolean wasCorrectlyAnswered() {
        Player player = players.get(currentPlayer);
        if (!player.isInPenaltyBox()) {
            if (isGettingOutOfPenaltyBox) {
                announce("Answer was correct!!!!");
                player.incrementPurse();
                announce(players.get(currentPlayer)
                        + " now has "
                        + players.get(currentPlayer).getPurse()
                        + " Gold Coins.");
                boolean winner = didPlayerWin();
                updateCurrentPlayer();
                return winner;
            } else {
                updateCurrentPlayer();
                return true;
            }
        }
        return false;
    }

    public boolean wrongAnswer() {
        Player player = players.get(currentPlayer);
        announce("Question was incorrectly answered");
        announce(players.get(currentPlayer) + " was sent to the penalty box");
        player.setInPenaltyBox(true);
        updateCurrentPlayer();
        return true;
    }

    private boolean didPlayerWin() {
        return !(players.get(currentPlayer).getPurse()== 6);
    }

    protected void announce(Object message) {
        System.out.println(message);
    }
}