package refactoring.Solution.TriviaGame;

import java.util.HashMap;
import java.util.LinkedList;

public class Question {
    private final HashMap<String,LinkedList<String>> question;
    private final String[] categories = {"Pop","Science","Sports","Rock"};
    public  Question(){
        question = new HashMap<>();
    }
    public void generateQuestions(){
        for(String category : categories){
            LinkedList<String> ques = new LinkedList<>();
            for(int i=0; i<50; i++){
                ques.addLast(makeQuestion(category,i));
            }
            question.put(category,ques);
        }

    }
    public String makeQuestion(String category, int index){
        return category+" Question "+ index;
    }

    public String getQuestion(String category){
        return question.get(category).removeFirst();
    }
}
