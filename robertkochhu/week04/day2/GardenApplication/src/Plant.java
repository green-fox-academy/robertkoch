import java.util.ArrayList;
import java.util.List;

public class Plant {
    private double waterLevel;
    private String color;
    private boolean isItThirsty;
    private int waterLevelNeeded;

    public Plant(double waterLevel, String color, int waterLevelNeeded) {
        this.waterLevel = waterLevel;
        this.color = color;
        this.waterLevelNeeded = waterLevelNeeded;
    }

    public void wateringPlants(int waterAmount) {
        if (waterLevel < waterLevelNeeded) {
            isItThirsty = true;
        }


    }


}
