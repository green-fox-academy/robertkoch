package main.java.music;

public class Violin extends StringedInstrument {
    @Override
    public void sound() {
        System.out.println("Screech");
    }

    public Violin(int numberOfStrings) {
        setName("Violin");
        setNumberOfStrings(numberOfStrings);
    }

    public Violin() {
        setName("Violin");
        setNumberOfStrings(4);

    }
}
