package refactoring.Scenario;

public class BoosterMode extends PrintMode{
    // Refused Bequest smell //
    private double intensityThreshold;
    @Override
    public void saveToner() {

    }

    @Override
    public void savePage() {

    }

    @Override
    public void boost() {
        // increase colorIntensity up to intensityThreshold
    }
}
