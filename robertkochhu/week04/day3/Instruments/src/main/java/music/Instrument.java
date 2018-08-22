package main.java.music;

abstract public class Instrument {
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    abstract public void play();

}