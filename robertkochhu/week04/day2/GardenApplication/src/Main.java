public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Plant plant = new Plant();
        garden.addPlants(new Flower("black", 0));
        garden.addPlants(new Flower("white", -50));
        garden.addPlants(new Flower("blue",50));
        garden.addPlants(new Tree("green",-5));
        garden.addPlants(new Tree("red",2));
        garden.addPlants(new Tree("yellow",25));
        garden.checkStatus();
        garden.checkThirst();
        garden.counter();

    }
}
