package CreationalDesignPattern.InClassScenarioMakingCW.Singletoon;

public class Printer {
    private static Printer printer;
    private int nrOfPages;
    private Printer() {
    }
    public static Printer getInstance() {
        return printer == null ? printer = new Printer() : printer;
    }
    public void print(String text){
        // print something
    }
}