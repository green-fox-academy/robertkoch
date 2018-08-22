import java.util.ArrayList;

public class Garden {
    ArrayList<Plant> garden;
    public int counter = 0;

    Garden() {
        garden = new ArrayList<>();
    }

    public void addPlants(Plant plant) {
        this.garden.add(plant);
    }

    public void checkStatus() {
        for (Plant plant : garden) {
            if (plant.waterLevelNeeded > plant.waterLevel) {
                System.out.println("The " + plant.color + " " + plant.kind + " needs water.");
            } else {
                System.out.println("The " + plant.color + " " + plant.kind + " does not need water");
            }
        }
    }

    public void checkThirst() {
        for (Plant plant : garden) {
            if (plant.waterLevel < plant.waterLevelNeeded) {
                plant.isItThirsty = true;
            } else {
                plant.isItThirsty = false;
            }
        }

    }

    public void counter() {

        for (Plant plant : garden) {
            if (plant.isItThirsty == true) {
                counter++;

            }
        }
        System.out.println("Thirsty plants : " + counter);
    }

    public void watering() {
        System.out.println("Watering with 40");
        for (Plant plant : garden) {
            if (plant.isItThirsty == true) {
                plant.waterLevel += 40 / counter;
                System.out.println("The " + plant.color + " " + plant.kind + " needs water");

            } else {
                System.out.println("The " + plant.color + " " + plant.kind + " does not need water");
            }
        }


    }
}

