package refactoring.Assignment_2;

import java.util.ArrayList;
import java.util.List;

public class TonerSaveMode extends PrintMode{
    private final ColorIntensity colorIntensity;
    private String tonerSavingLevel;
    List<ColorIntensity> colorIntensities = new ArrayList<>(){{new HighColorIntensity(); new LowColorIntensity();
            new MediumColorIntensity();}};
    public TonerSaveMode(PrintModeProperties printModeProperties, ColorIntensity colorIntensity) {
        super(printModeProperties);
        this.colorIntensity = colorIntensity;
    }

    @Override
    public void applyConfiguration() {
        for(ColorIntensity colorIntensity:colorIntensities){
            if(this.colorIntensity == colorIntensity){
                // use algorithm
            }
        }
    }
}
