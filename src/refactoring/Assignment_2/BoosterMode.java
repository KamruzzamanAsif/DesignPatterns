package refactoring.Assignment_2;

public class BoosterMode extends PrintMode{
    public BoosterMode(PrintModeProperties printModeProperties) {
        super(printModeProperties);
    }

    @Override
    public void applyConfiguration() {
        // increase colorIntensity up to intensityThreshold
    }
}
