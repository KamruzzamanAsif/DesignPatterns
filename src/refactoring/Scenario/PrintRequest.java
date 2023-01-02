package refactoring.Scenario;

public class PrintRequest {
    private Document document;
    private TonerSaveMode tonerSaveMode;
    private PageSaveMode pageSaveMode;
    private BoosterMode boosterMode;

    public PrintRequest(Document document, TonerSaveMode tonerSaveMode, PageSaveMode pageSaveMode, BoosterMode boosterMode) {
        this.document = document;
        this.tonerSaveMode = tonerSaveMode;
        this.pageSaveMode = pageSaveMode;
        this.boosterMode = boosterMode;
    }
}
