public class Flower extends Plant {
    public Flower(String color, double waterLevel) {
        this.color = color;
        this.waterLevel = waterLevel;
        this.waterLevelNeeded = 5;
        this.waterRemainingPercent = 0.75;
        this.kind = "flower";
        this.isItThirsty = isItThirsty;
    }
}
