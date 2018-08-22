package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    @Override
    public void sound() {
        System.out.println("Twang");
    }

    public ElectricGuitar(int numberOfStrings) {

        setName("ElectricGuitar");
        setNumberOfStrings(6);
    }

    public ElectricGuitar() {
        setName("ElectricGuitar");
        setNumberOfStrings(6);
    }

}

