package refactoring.Scenario;

public class PageSaveMode extends PrintMode{

    // Refused Bequest smell //
    @Override
    public void saveToner() {

    }

    @Override
    public void savePage() {
        // algorithm to change pageSize, orientation
    }

    @Override
    public void boost() {

    }

    public void renderPreview(){
        // preview the updated document
    }
}
