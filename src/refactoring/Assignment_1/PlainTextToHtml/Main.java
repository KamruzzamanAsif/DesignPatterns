package refactoring.Solution.PlainTextToHtml;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "sample.txt";
        FileReader fileReader = new FileReader(fileName);
        String plainText = fileReader.readFile();

        PlaintextToHtmlConverter plaintextToHtmlConverter = new PlaintextToHtmlConverter(plainText);
        String encodedHtml = plaintextToHtmlConverter.basicHtmlEncode();
        System.out.println(encodedHtml);
    }
}
