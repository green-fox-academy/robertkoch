public class Tree extends  Plant {
    public Tree(String color, double waterLevel){
        this.color = color;
        this.waterLevel = waterLevel;
        this.waterLevelNeeded =10;
        this.waterRemainingPercent = 0.4;
        this.kind = "tree";
        this.isItThirsty = isItThirsty;
    }
}
