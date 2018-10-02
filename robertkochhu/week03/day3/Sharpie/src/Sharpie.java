public class Sharpie {
    String color;
    float width;
    float inkAmount;

    Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void use() {
        this.inkAmount--;
    }
}
