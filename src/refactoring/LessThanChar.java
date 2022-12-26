package refactoring;

import java.util.List;

public class LessThanChar extends Character {
    @Override
    public List<String> modifyLine(List<String> convertedLine) {
        convertedLine.add("&lt;");
        return convertedLine;
    }
}
