package refactoring.Assignment_1.PlainTextToHtml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    private final String fileName;
    public FileReader(String fileName){
        this.fileName = fileName;
    }
    protected String readFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
