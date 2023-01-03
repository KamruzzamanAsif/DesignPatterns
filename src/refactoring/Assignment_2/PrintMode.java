package refactoring.Assignment_2;

public abstract class PrintMode {
    private final PrintModeProperties printModeProperties;

    public PrintMode(PrintModeProperties printModeProperties) {
        this.printModeProperties = printModeProperties;
    }

    public abstract void applyConfiguration();
}
