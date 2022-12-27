package refactoring.Assignment_1.PlainTextToHtml;

import java.util.ArrayList;
import java.util.List;

public class PlaintextToHtmlConverter {
    List<String> htmlText;
    List<String> convertedLine;

    String plainText;
    public PlaintextToHtmlConverter(String plainText){
        this.plainText = plainText;
    }

    public String basicHtmlEncode() {
        htmlText = new ArrayList<>();
        convertedLine = new ArrayList<>();

        for(char character: plainText.toCharArray()){
            switch (character) {
                case '<' -> convertedLine.add("&lt;");
                case '>' -> convertedLine.add("&gt;");
                case '&' -> convertedLine.add("&amp;");
                case '\n' -> addANewLine();
                default -> pushACharacterToTheOutput(character);
            }
        }
        addANewLine();
        resetConvertedLine();
        return String.join("<br />", htmlText);
    }

    protected void addANewLine() {
        String line = String.join("", convertedLine);
        htmlText.add(line);
    }

    protected void resetConvertedLine(){
        convertedLine = new ArrayList<>();
    }

    protected void pushACharacterToTheOutput(char character) {
        convertedLine.add(String.valueOf(character));
    }
}
