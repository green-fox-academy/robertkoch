import java.util.ArrayList;
import java.util.List;

public class Plant {
    public double waterLevel;
    public String color;
    public boolean isItThirsty;
    public int waterLevelNeeded;
    public double waterRemainingPercent;
    public String kind;

    public void newWaterLevel(int waterAmount) {
        this.waterLevel = this.waterLevel + waterAmount * waterRemainingPercent;
    }

    }





