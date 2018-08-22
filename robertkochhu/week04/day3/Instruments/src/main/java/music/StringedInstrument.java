package main.java.music;

abstract public class StringedInstrument extends Instrument {


    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    private int numberOfStrings;

    abstract public void sound();

    @Override
    public void play() {
        System.out.print(getName() + ", " + "a " + numberOfStrings + " stringed instrument that goes ");
        sound();
        System.out.println();
    }
}
