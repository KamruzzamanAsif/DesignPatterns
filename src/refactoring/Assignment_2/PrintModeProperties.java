package refactoring.Assignment_2;

public class PrintModeProperties {
    private int numberOfPages;
    private PageSize pageSize;
    private String orientation;
    private double colorIntensity;
    private int costPerPage;

    public PrintModeProperties(int numberOfPages, PageSize pageSize, String orientation,
                               double colorIntensity, int costPerPage){
        this.numberOfPages = numberOfPages;
        this.pageSize = pageSize;
        this.orientation = orientation;
        this.colorIntensity = colorIntensity;
        this.costPerPage = costPerPage;
    }

    public PageSize getPageSize() {
        return pageSize;
    }

    public String getOrientation() {
        return orientation;
    }

    public int getCostPerPage() {
        return costPerPage;
    }

    public double getColorIntensity() {
        return colorIntensity;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
