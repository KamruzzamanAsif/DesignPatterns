package refactoring.Scenario;

public abstract class PrintMode {
    int numberOfPages;
    int pageSize;
    String orientation;
    double colorIntensity;
    int costPerPage;

    public abstract void saveToner();
    public abstract void savePage();
    public abstract void boost();

    // getters and setters for all fields
}
