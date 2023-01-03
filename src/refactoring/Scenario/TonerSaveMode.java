package refactoring.Scenario;

public class TonerSaveMode extends PrintMode{
    // Refused Bequest smell //
    private String tonerSavingLevel;

    // duplicate code smell //
    @Override
    public void saveToner() {
        if(tonerSavingLevel == "high"){
            // color intensity reducing standard algorithm(colorIntensity)
        }
        else if(tonerSavingLevel == "medium" || tonerSavingLevel == "low"){
            // use two different algorithms to reduce color intensity(colorIntensity)
        }
    }
    @Override
    public void savePage() {

    }

    @Override
    public void boost() {

    }
}
