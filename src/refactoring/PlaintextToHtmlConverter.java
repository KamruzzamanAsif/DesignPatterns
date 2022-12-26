//package refactoring;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
////There is comment smell in addNewLine and stashNextCharacterAndAdvanceThePointer
//
//public class PlaintextToHtmlConverter {
//    String htmlLines;
//    HtmlEncoder htmlEncoder = new HtmlEncoder();
//
//    public String toHtml() throws Exception {
//        String text = read();
//        htmlLines = htmlEncoder.encode(text);
//        return htmlLines;
//    }
//
//    protected String read() throws IOException {
//        return new String(Files.readAllBytes(Paths.get("sample.txt")));
//    }
//
//}