package refactoring.Assignment_2;


public class PrintRequest {
    private final Document document;
    private final TonerSaveMode tonerSaveMode;
    private final PageSaveMode pageSaveMode;
    private final BoosterMode boosterMode;

    public PrintRequest(Document document, TonerSaveMode tonerSaveMode, PageSaveMode pageSaveMode, BoosterMode boosterMode) {
        this.document = document;
        this.tonerSaveMode = tonerSaveMode;
        this.pageSaveMode = pageSaveMode;
        this.boosterMode = boosterMode;
    }
}