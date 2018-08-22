import main.java.music.BassGuitar;
import main.java.music.ElectricGuitar;
import main.java.music.Violin;

public class Main {
    public static void main(String[] args) {
        ElectricGuitar egitar1 = new ElectricGuitar(6);
        egitar1.play();
        BassGuitar bgitar1 = new BassGuitar(6);
        bgitar1.play();
        Violin violin1 = new Violin(6);
        violin1.play();
    }
}
