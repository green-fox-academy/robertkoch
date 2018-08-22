package main.java.music;

public class BassGuitar extends StringedInstrument {
    @Override
    public void sound() {
        System.out.println("Duuuum");
    }

    public BassGuitar(int numberOfStrings) {
        setName("Bass Guitar");
        setNumberOfStrings(numberOfStrings);
    }

    public BassGuitar() {
        setName("Bass Guitar");
        setNumberOfStrings(4);
    }

}
