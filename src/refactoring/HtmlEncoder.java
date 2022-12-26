//package refactoring;
//
//import java.util.ArrayList;
//import java.util.List;
//
//// i removed switch statement smell
//
//public class HtmlEncoder {
//
//    String result;
//
//    String text;
//    List<String> convertedLine;
//    String characterToConvert;
//    private String encode(String text) {
//        this.text = text;
//
//        result = new ArrayList<>();
//        convertedLine = new ArrayList<>();
//        characterToConvert = stashNextCharacterAndAdvanceThePointer();
//
//        int i = 0;
//        while (i <= this.text.length()) {
//            this.convertedLine = Character.modifyLine(convertedLine);
//
//            if (i >= text.length()) break;
//
//            characterToConvert = stashNextCharacterAndAdvanceThePointer();
//        }
//        addANewLine();
//        String finalResult = String.join("<br />", result);
//        return finalResult;
//    }
//
//    private String stashNextCharacterAndAdvanceThePointer() {
//        return String.valueOf(charAt(i++));
//    }
//
//    private void addANewLine() {
//        String line = String.join("", convertedLine);
//        result.add(line);
//        convertedLine = new ArrayList<>();
//    }
//
//    private void pushACharacterToTheOutput() {
//        convertedLine.add(characterToConvert);
//    }
//}
